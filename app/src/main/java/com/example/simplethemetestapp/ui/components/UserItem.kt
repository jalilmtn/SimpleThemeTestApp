package com.example.simplethemetestapp.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.simplethemetestapp.ui.theme.Blue100
import com.example.simplethemetestapp.ui.theme.Gray80
import com.example.simplethemetestapp.ui.theme.Green100

@Composable
fun UserDetails(modifier: Modifier = Modifier, avatarId: Int, isActive: Boolean) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Canvas(modifier = Modifier
            .padding(end = 16.dp)
            .size(4.dp)) {
            scale(scaleX = 1f, scaleY = 1f) {
                drawCircle(Blue100, radius = 4.dp.toPx())
            }
        }
        Box(
            modifier = modifier,
        ) {
            Image(
                painter = painterResource(id = avatarId),
                modifier = Modifier
                    .size(48.dp)
                    .clip(CircleShape)
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.background.copy(alpha = 0f),
                        shape = CircleShape
                    ),
                contentDescription = ""
            )
            if (isActive)
                Canvas(
                    modifier = Modifier
                        .offset(y = (4).dp, x = (4).dp)
                        .size(16.dp)
                        .size(4.dp)
                        .align(Alignment.BottomEnd)
                ) {
                    scale(scaleX = 1f, scaleY = 1f) {
                        drawCircle(Gray80, radius = 9.dp.toPx())
                        drawCircle(Green100, radius = 6.dp.toPx())
                    }
                }

        }


        Column(
            modifier = Modifier
                .padding(8.dp)
                .background(Color.Transparent)
        ) {
            Text(
                text = "Nelly",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                text = "Enjoy your trip to spain",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.secondary.copy(alpha = .6f)
            )
        }
    }

}
