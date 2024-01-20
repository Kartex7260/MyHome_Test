package kanti.test.myhome.ui.screen.cameras.viewmodel

data class CamerasUiState(
	val roomsWithCameras: List<RoomWithCameras> = listOf(),
	val loading: Boolean = false
)