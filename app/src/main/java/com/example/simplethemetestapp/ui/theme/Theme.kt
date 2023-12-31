package com.example.simplethemetestapp.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.simplethemetestapp.ui.app.MyAppState


enum class Theme {
    ORANGE_BLUE, BLUE_PURPLE, YELLOW_GREEN, RED_BLACK
}

private val myColorScheme = lightColorScheme(
    primary = Green100,
    secondary = Color.White,
    tertiary = Pink80,
    onSurface = Gray60,
    outline = Blue100

)

@Composable
fun SimpleThemeTestAppTheme(
    appState: MyAppState,
    content: @Composable () -> Unit
) {

    /*   val view = LocalView.current
       if (!view.isInEditMode) {
           SideEffect {
               val window = (view.context as Activity).window
               window.statusBarColor = colorScheme.primary.toArgb()
               WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
           }
       }*/

    MaterialTheme(
        colorScheme = myColorScheme,
        typography = Typography,
        content = {
            Surface(
                modifier = Modifier.fillMaxSize(),
                tonalElevation = 5.dp,
                shadowElevation = 10.dp,
            ) {
                Box(
                    Modifier
                        .fillMaxSize()
                        .background(
                            brush = getGradientBackgroundBrush(appState.appTheme)
                        )
                ) {

                }
                content.invoke()
            }
        }
    )
}

fun getGradientBackgroundBrush(appTheme: Theme): Brush {
    return when (appTheme) {
        Theme.ORANGE_BLUE -> Brush.linearGradient(
            0.0f to Orange100,
            500.0f to Blue100,
            start = Offset.Zero,
            end = Offset.Infinite
        )

        Theme.BLUE_PURPLE -> Brush.linearGradient(
            0.0f to Purple80,
            500.0f to Blue100,
            start = Offset.Zero,
            end = Offset.Infinite
        )

        Theme.YELLOW_GREEN -> Brush.linearGradient(
            0.0f to Yellow100,
            500.0f to Green100,
            start = Offset.Zero,
            end = Offset.Infinite
        )

        Theme.RED_BLACK -> Brush.linearGradient(
            0.0f to Red100,
            500.0f to Black80,
            start = Offset.Zero,
            end = Offset.Infinite
        )
    }
}
