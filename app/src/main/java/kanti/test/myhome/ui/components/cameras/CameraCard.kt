package kanti.test.myhome.ui.components.cameras

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kanti.test.myhome.R
import kanti.test.myhome.data.model.cameras.Camera
import kanti.test.myhome.ui.theme.White

@Composable
fun CameraCard(
	modifier: Modifier = Modifier,
	camera: Camera,
	painter: Painter
) = Card(
	modifier = modifier,
	colors = CardDefaults.cardColors(
		containerColor = White,
		contentColor = MaterialTheme.colorScheme.onSurface
	),
	elevation = CardDefaults.elevatedCardElevation()
) {
	Box {
		Image(
			modifier = Modifier
				.fillMaxWidth()
				.height(207.dp),
			painter = painter,
			contentDescription = null,
			contentScale = ContentScale.Crop,
			colorFilter = ColorFilter.tint(
				color = Color.Black.copy(alpha = 0.4f),
				blendMode = BlendMode.Darken
			)
		)
		Image(
			modifier = Modifier
				.align(Alignment.Center),
			painter = painterResource(id = R.drawable.play_button),
			contentDescription = null
		)
		if (camera.rec) {
			Image(
				modifier = Modifier
					.align(Alignment.TopStart)
					.padding(start = 8.dp, top = 8.dp),
				painter = painterResource(id = R.drawable.rec),
				contentDescription = null
			)
		}
		if (camera.favourite) {
			Image(
				modifier = Modifier
					.align(Alignment.TopEnd)
					.padding(end = 3.dp, top = 3.dp),
				painter = painterResource(id = R.drawable.star),
				contentDescription = null
			)
		}
	}
	Row(
		modifier = Modifier.height(72.dp),
	) {
		Text(
			modifier = Modifier.padding(
				top = 22.dp,
				start = 16.dp
			),
			text = camera.name,
			style = MaterialTheme.typography.bodyLarge
		)
	}
}

@Preview
@Composable
private fun PreviewCameraCard() {
	CameraCard(
		modifier = Modifier.fillMaxWidth(),
		camera = Camera(
			name = "Камера 1"
		),
		painter = painterResource(id = R.drawable.visual)
	)
}