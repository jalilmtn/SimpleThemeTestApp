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
import androidx.compose.foundation.shape.CornerSize
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

@Composable
fun GroupItem(modifier: Modifier = Modifier, avatarPair: Pair<Int, Int>) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Canvas(modifier = Modifier.padding(end = 16.dp).size(4.dp)) {
            scale(scaleX = 1f, scaleY = 1f) {
                drawCircle(Blue100, radius = 4.dp.toPx())
            }
        }
        Box(
            modifier = modifier,
        ) {
            Image(
                painter = painterResource(id = avatarPair.first),
                modifier = Modifier
                    .size(32.dp)
                    .clip(CircleShape),
                contentDescription = ""
            )

            Box(
                modifier = Modifier
                    .offset(y = (12).dp, x = (12).dp)
                    .size(32.dp)
                    .background(
                        color = MaterialTheme.colorScheme.onPrimary,
                        shape = MaterialTheme.shapes.medium.copy(
                            CornerSize(
                                50
                            )
                        )
                    )
                    .clip(MaterialTheme.shapes.medium)
                    .align(Alignment.BottomEnd),
                contentAlignment = Alignment.Center,
            ) {

                Image(
                    painter = painterResource(id = avatarPair.second),
                    modifier = Modifier
                        .size(32.dp)
                        .clip(CircleShape)
                        .border(
                            width = 1.dp,
                            color = MaterialTheme.colorScheme.onSurface,
                            shape = CircleShape
                        ),
                    contentDescription = ""
                )

            }

        }
        Column(
            modifier = Modifier
                .padding(start = 16.dp, top = 8.dp)
                .background(Color.Transparent)
        ) {
            Text(
                text = "Mallow, Cap and 3 others",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                text = "SketchHeads",
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.secondary.copy(alpha = .6f)
            )
        }


    }
}
