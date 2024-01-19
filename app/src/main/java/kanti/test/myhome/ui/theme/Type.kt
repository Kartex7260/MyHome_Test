package kanti.test.myhome.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import kanti.test.myhome.R

// Set of Material typography styles to start with
val Typography = Typography(
	bodyLarge = TextStyle(
		fontFamily = FontFamily(fonts = arrayOf(Font(R.font.circe))),
		fontSize = 17.sp,
		lineHeight = 25.06.sp
	),

    titleLarge = TextStyle(
        fontFamily = FontFamily(fonts = arrayOf(Font(R.font.circe))),
        fontSize = 21.sp
    ),

	titleSmall = TextStyle(
		fontFamily = FontFamily(fonts = arrayOf(Font(R.font.circe))),
		fontSize = 17.sp
	)
)