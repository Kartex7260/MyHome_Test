package kanti.test.myhome.ui.screen

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kanti.test.myhome.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
	navController: NavController
) {
	val circeFont = remember {
		FontFamily(fonts = arrayOf(Font(R.font.circe)))
	}
	val tabText = @Composable { text: String ->
		Text(
			text = text,
			fontFamily = circeFont,
			fontSize = 21.sp
		)
	}

	Column(
		modifier = Modifier
			.shadow(2.dp)
	) {
		CenterAlignedTopAppBar(
			title = {
				Text(
					text = stringResource(id = R.string.app_name),
					fontFamily = circeFont,
					fontSize = 21.sp
				)
			}
		)
		var selectedTab by rememberSaveable {
			mutableIntStateOf(0)
		}
		TabRow(
			selectedTabIndex = selectedTab,
			contentColor = MaterialTheme.colorScheme.onSurface
		) {
			val camerasRoute = stringResource(id = R.string.nav_host_cameras)
			val doorsRoute = stringResource(id = R.string.nav_host_doors)

			Tab(
				selected = false,
				onClick = {
					selectedTab = 0
					navController.navigate(route = camerasRoute)
				},
				text = {
					tabText(stringResource(id = R.string.cameras))
				},
				interactionSource = MutableInteractionSource()
			)
			Tab(
				selected = false,
				onClick = {
					selectedTab = 1
					navController.navigate(route = doorsRoute)
				},
				text = {
					tabText(stringResource(id = R.string.doors))
				}
			)
		}
	}
}

@Composable
fun MainScreen() {
	val navController = rememberNavController()
	Scaffold(
		modifier = Modifier,

		topBar = {
			TopBar(
				navController = navController
			)
		}
	) { paddingValues ->
		MyHomeNavHost(
			navController = navController,
			paddingValues = paddingValues
		)
	}
}

@Preview
@Composable
private fun PreviewMainScreen() {
	MainScreen()
}