package com.example.simplethemetestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.view.WindowCompat
import com.example.simplethemetestapp.ui.app.rememberMyAppState
import com.example.simplethemetestapp.ui.components.MyTopBar
import com.example.simplethemetestapp.ui.config_screen.ConfigScreen
import com.example.simplethemetestapp.ui.theme.SimpleThemeTestAppTheme
import com.example.simplethemetestapp.ui.theme.Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContent {
            val appState = rememberMyAppState()
            SimpleThemeTestAppTheme(appState) {
                // A surface container using the 'background' color from the theme
                Scaffold(
                    topBar = {
                        MyTopBar("App Theme", Icons.Default.ArrowBack)
                    },
                    containerColor = Color.Transparent
                ) {
                    ConfigScreen(modifier = Modifier.padding(it)) {
                        appState.appTheme = it ?: Theme.ORANGE_BLUE
                    }
                }
            }
        }
    }
}

