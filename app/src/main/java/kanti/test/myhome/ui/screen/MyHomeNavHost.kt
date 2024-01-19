package kanti.test.myhome.ui.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kanti.test.myhome.R
import kanti.test.myhome.ui.screen.cameras.CamerasScreen
import kanti.test.myhome.ui.screen.doors.DoorsScreen

@Composable
fun MyHomeNavHost(
	navController: NavHostController,
	paddingValues: PaddingValues
) {
	val camerasRoute = stringResource(id = R.string.nav_host_cameras)
	val doorsRoute = stringResource(id = R.string.doors)

	NavHost(
		navController = navController,
		startDestination = camerasRoute
	) {
		composable(
			route = camerasRoute
		) {
			CamerasScreen(
				paddingValues = paddingValues
			)
		}

		composable(
			route = doorsRoute
		) {
			DoorsScreen(
				paddingValues = paddingValues
			)
		}
	}
}