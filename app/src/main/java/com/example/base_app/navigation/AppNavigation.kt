package com.example.base_app.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.base_app.layout.DrawerWrapperLayout
import com.example.base_app.screen.AchievementsScreen
import com.example.base_app.screen.AttendanceScreen
import com.example.base_app.screen.BeltGradeScreen
import com.example.base_app.screen.ClassScheduleScreen
import com.example.base_app.screen.EventsScreen
import com.example.base_app.screen.FeesScreen
import com.example.base_app.screen.HomeScreen
import com.example.base_app.screen.HomeWorkScreen
import com.example.base_app.screen.NotificationScreen
import com.example.base_app.screen.PerformanceTrackingScreen
import com.example.base_app.view.BeltGradePage
import com.example.base_app.view.EventsPage
import com.example.base_app.view.HomePage
import com.example.base_app.view.HomeWorkPage
import com.example.base_app.view.NotificationPage

@Composable
fun AppNavigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            DrawerWrapperLayout(navController = navController) {
                HomeScreen(navController)
            }
        }
        composable("schedule") {
            DrawerWrapperLayout(navController = navController) {
                ClassScheduleScreen(navController)
            }
        }
        composable("attendance") {
            DrawerWrapperLayout(navController = navController) {
                AttendanceScreen(navController)
            }
        }
        composable("events") {
            DrawerWrapperLayout(navController = navController) {
                EventsScreen(navController)
            }
        }
        composable("performance") {
            DrawerWrapperLayout(navController = navController) {
                PerformanceTrackingScreen(navController)
            }
        }
        composable("achievements") {
            DrawerWrapperLayout(navController = navController) {
                AchievementsScreen(navController)
            }
        }
        composable("homework") {
            DrawerWrapperLayout(navController = navController) {
                HomeWorkScreen(navController)
            }
        }
        composable("beltgrade") {
            DrawerWrapperLayout(navController = navController) {
                BeltGradeScreen(navController)
            }
        }
        composable("events") {
            DrawerWrapperLayout(navController = navController) {
                EventsScreen(navController)
            }
        }
        composable("fees") {
            DrawerWrapperLayout(navController = navController) {
                FeesScreen(navController)
            }
        }
        composable("notification") {
            DrawerWrapperLayout(navController = navController) {
                NotificationScreen(navController)
            }
        }
    }
}

