package com.example.simplethemetestapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.simplethemetestapp.ui.theme.Gray80

@Composable
fun ShowMoreView(
    modifier: Modifier = Modifier,
    remainingParticipants: Int,
) {
    val cornerSize = CornerSize(50)
    Row(
        modifier = modifier
            .background(
                color = Gray80,
                shape = MaterialTheme.shapes.medium.copy(cornerSize)
            )
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.onSurface,
                shape = MaterialTheme.shapes.medium.copy(cornerSize)
            ),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        if (remainingParticipants > 0) {
            Text(
                modifier = Modifier
                    .wrapContentHeight(),
                text = "+$remainingParticipants",
                color = MaterialTheme.colorScheme.onSurface,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center
            )
        }
    }
}