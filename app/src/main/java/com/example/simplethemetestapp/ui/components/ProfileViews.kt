package com.example.simplethemetestapp.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun ProfileViews(
    modifier: Modifier = Modifier,
    avatars: List<Int>,
    paddingUnit: Dp,
    avatarHeight: Dp
) {
    Box(
        modifier = modifier
    ) {
        avatars.forEachIndexed { index, avatar ->
            Image(
                painter = painterResource(id = avatar),
                modifier = Modifier
                    .padding(start = paddingUnit.times(index))
                    .size(avatarHeight)
                    .clip(CircleShape)
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.onSurface,
                        shape = CircleShape
                    ),
                contentDescription = ""
            )
        }
        ShowMoreView(
            modifier = Modifier
                .padding(start = paddingUnit.times(avatars.size))
                .widthIn(min = avatarHeight)
                .height(24.dp),
            remainingParticipants = 2,
        )
    }
}