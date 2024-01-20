package kanti.test.myhome

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kanti.test.myhome.ui.screen.MainScreen
import kanti.test.myhome.ui.theme.MyHomeTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			Content()
		}
	}
}

@Composable
fun Content() {
	MyHomeTheme {
		Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
			MainScreen()
		}
	}

}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
	Content()
}