package kanti.test.myhome.ui.screen.cameras

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CamerasScreen(
	paddingValues: PaddingValues = PaddingValues()
) {
	Text(
		modifier = Modifier.padding(paddingValues),
		text = "Cameras"
	)
}

@Preview
@Composable
private fun PReviewCamerasScreen() {
	CamerasScreen()
}