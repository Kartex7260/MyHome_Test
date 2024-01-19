package kanti.test.myhome.data.model.cameras

data class Camera(
	val id: Int = 0,
	val name: String = "",
	val room: String = "",
	val snapshot: String = "",
	val favourite: Boolean = false,
	val rec: Boolean = false
)
