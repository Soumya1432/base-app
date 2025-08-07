package com.example.base_app.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.base_app.layout.DrawerWrapperLayout
import com.example.base_app.screen.HomeScreen
import com.example.base_app.view.HomePage

@Composable
fun AppNavigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            DrawerWrapperLayout(navController = navController) {
                HomeScreen(navController)
            }
        }
    }
}

