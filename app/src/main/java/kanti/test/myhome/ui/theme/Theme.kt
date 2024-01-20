package kanti.test.myhome.ui.theme

import android.app.Activity
import android.graphics.Color
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColors(
	primary = Azure,
	surface = Surface,
	background = Background

	/* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun MyHomeTheme(
	content: @Composable () -> Unit
) {
	val view = LocalView.current
	if (!view.isInEditMode) {
		SideEffect {
			val window = (view.context as Activity).window
			window.statusBarColor = LightColorScheme.surface.toArgb()
			window.navigationBarColor = Color.TRANSPARENT
			WindowCompat.getInsetsController(window, view).apply {
				isAppearanceLightStatusBars = true
				isAppearanceLightNavigationBars = true
			}
		}
	}

	MaterialTheme(
		colors = LightColorScheme,
		typography = Typography,
		content = content
	)
}