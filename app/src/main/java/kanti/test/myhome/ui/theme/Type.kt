package kanti.test.myhome.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import kanti.test.myhome.R

// Set of Material typography styles to start with
val Typography = Typography(
	subtitle1 = TextStyle(
		fontFamily = FontFamily(fonts = arrayOf(Font(R.font.circe))),
		fontSize = 17.sp,
		lineHeight = 25.06.sp
	),

    h6 = TextStyle(
        fontFamily = FontFamily(fonts = arrayOf(Font(R.font.circe))),
        fontSize = 21.sp
    )
)