package kanti.test.myhome.ui.screen.doors

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun DoorsScreen(
	paddingValues: PaddingValues = PaddingValues()
) {
	Text(
		modifier = Modifier.padding(paddingValues),
		text = "Doors"
	)
}

@Preview
@Composable
private fun PreviewDoorsScreen() {
	DoorsScreen()
}