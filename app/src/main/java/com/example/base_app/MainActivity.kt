package com.example.base_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowInsetsControllerCompat
import androidx.lifecycle.ViewModelProvider
import com.example.base_app.layout.Footer
import com.example.base_app.navigation.AppNavigation
import com.example.base_app.ui.theme.BaseappTheme
import com.example.base_app.view.HomePage
import com.example.base_app.viewmodel.HomeViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class]
        setContent {
            BaseappTheme {
                SetStatusBarColor(Color.White)
                    AppNavigation()
            }
        }
    }
}
@Composable
fun SetStatusBarColor(color: Color) {
    val view = LocalView.current
    SideEffect {
        val window = (view.context as ComponentActivity).window
        window.statusBarColor = color.toArgb()
        // Set dark icons for light background
        val insetsController = WindowInsetsControllerCompat(window, view)
        insetsController.isAppearanceLightStatusBars = true
    }
}

