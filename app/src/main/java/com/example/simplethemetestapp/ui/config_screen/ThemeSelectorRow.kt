package com.example.simplethemetestapp.ui.config_screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.simplethemetestapp.R
import com.example.simplethemetestapp.ui.app.rememberMyAppState
import com.example.simplethemetestapp.ui.theme.Gray100
import com.example.simplethemetestapp.ui.theme.Theme
import com.example.simplethemetestapp.ui.theme.getGradientBackgroundBrush


@Composable
fun ThemeSelectorRow(modifier: Modifier = Modifier, onItemClick: (Theme?) -> Unit) {
    val appState = rememberMyAppState().appTheme
    val borderStrokeState = remember {
        mutableStateOf(appState)
    }

    LazyRow(
        modifier = modifier,
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        item {
            Card(
                modifier = Modifier
                    .size(90.dp, 120.dp)
                    .clickable {
                        borderStrokeState.value = Theme.ORANGE_BLUE
                        onItemClick.invoke(Theme.ORANGE_BLUE)
                    },
                border = BorderStroke(
                    1.dp,
                    brush = SolidColor(MaterialTheme.colorScheme.onSurface.copy(alpha = .6f))
                )
            ) {
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(
                            color = Gray100
                        )
                ) {
                    Icon(
                        modifier = Modifier
                            .align(Alignment.Center)
                            .size(32.dp),
                        painter = painterResource(id = R.drawable.refresh),
                        contentDescription = "",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }
        }
        Theme.entries.forEach {
            item {

                val borderStroke = if (it == borderStrokeState.value) BorderStroke(
                    3.dp,
                    brush = SolidColor(MaterialTheme.colorScheme.outline)
                )
                else null
                Card(
                    modifier = Modifier
                        .padding(start = 8.dp)
                        .size(90.dp, 120.dp)
                        .clickable {
                            borderStrokeState.value = it
                            onItemClick.invoke(it)
                        },
                    border = borderStroke

                ) {
                    Box(
                        Modifier
                            .fillMaxSize()
                            .background(
                                brush = getGradientBackgroundBrush(it)
                            )
                    ) {
                        Icon(
                            modifier = Modifier.align(Alignment.Center),
                            painter = painterResource(id = R.drawable.lock),
                            contentDescription = ""
                        )
                    }
                }
            }
        }
    }
}