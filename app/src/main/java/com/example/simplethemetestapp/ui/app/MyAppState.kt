package com.example.simplethemetestapp.ui.app

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.simplethemetestapp.ui.theme.Theme


@Composable
fun rememberMyAppState(
): MyAppState {
    return remember() {
        MyAppState()
    }
}

@Stable
class MyAppState(
) {
    var appTheme: Theme by mutableStateOf(Theme.ORANGE_BLUE)
}




