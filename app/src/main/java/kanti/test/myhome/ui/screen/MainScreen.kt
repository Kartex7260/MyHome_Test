package kanti.test.myhome.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kanti.test.myhome.R

@Composable
fun TopBar(
	navController: NavController
) {
	Column(
		modifier = Modifier
			.shadow(2.dp)
	) {
		TopAppBar(
			modifier = Modifier.height(62.dp),
			backgroundColor = MaterialTheme.colors.surface
		) {
			Row(
				modifier = Modifier.fillMaxWidth(),
				horizontalArrangement = Arrangement.Center
			) {
				Text(
					text = stringResource(id = R.string.app_name),
					style = MaterialTheme.typography.h6
				)
			}
		}
		var selectedTab by rememberSaveable {
			mutableIntStateOf(0)
		}
		TabRow(
			modifier = Modifier.height(44.dp),
			selectedTabIndex = selectedTab,
			backgroundColor = MaterialTheme.colors.surface,
			contentColor = MaterialTheme.colors.primary
		) {
			val camerasRoute = stringResource(id = R.string.nav_host_cameras)
			val doorsRoute = stringResource(id = R.string.nav_host_doors)

			val contentColor = MaterialTheme.colors.onSurface

			Tab(
				selected = false,
				onClick = {
					selectedTab = 0
					navController.navigate(route = camerasRoute)
				},
				text = { Text(text = stringResource(id = R.string.cameras)) },
				selectedContentColor = contentColor,
				unselectedContentColor = contentColor
			)
			Tab(
				selected = false,
				onClick = {
					selectedTab = 1
					navController.navigate(route = doorsRoute)
				},
				text = { Text(text = stringResource(id = R.string.doors)) },
				selectedContentColor = contentColor,
				unselectedContentColor = contentColor
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