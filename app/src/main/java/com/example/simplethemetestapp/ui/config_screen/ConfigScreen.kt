package com.example.simplethemetestapp.ui.config_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.simplethemetestapp.ui.theme.Theme


@Composable
fun ConfigScreen(modifier: Modifier, onThemChange: (Theme?) -> Unit) {
    Column(
        modifier = modifier
            .padding(8.dp)
            .fillMaxSize()
    ) {
        MessagesBox()
        Box(Modifier.weight(1f)) {
            Column(modifier = Modifier.align(Alignment.BottomCenter)) {
                Row (Modifier.wrapContentWidth().padding(bottom = 24.dp).align(Alignment.CenterHorizontally)){
                    Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = MaterialTheme.colorScheme.secondary)
                    Text(
                        modifier = Modifier,
                        text = "Chroma Glow",
                        textAlign = TextAlign.Center,
                        color = MaterialTheme.colorScheme.secondary
                    )
                }
                ThemeSelectorRow(
                    onItemClick = onThemChange
                )
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 24.dp),
                    text = "This theme is available to Nitro users only.",
                    textAlign = TextAlign.Center,
                    color = MaterialTheme.colorScheme.secondary
                )
            }
        }

    }
}




