package com.example.base_app.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.base_app.layout.AccountWrapperLayout
import com.example.base_app.layout.DrawerWrapperLayout
import com.example.base_app.screen.AccountScreen
import com.example.base_app.screen.AchievementsScreen
import com.example.base_app.screen.AttendanceScreen
import com.example.base_app.screen.BeltGradeScreen
import com.example.base_app.screen.CategoryScreen
import com.example.base_app.screen.ClassScheduleScreen
import com.example.base_app.screen.EventsScreen
import com.example.base_app.screen.FeesScreen
import com.example.base_app.screen.HomeScreen
import com.example.base_app.screen.HomeWorkScreen
import com.example.base_app.screen.NotificationScreen
import com.example.base_app.screen.PerformanceTrackingScreen
import com.example.base_app.screen.SplashScreen
import com.example.base_app.screen.auth.LoginScreen
import com.example.base_app.screen.auth.SignupScreen
import com.example.base_app.view.accounts.ChangePasswordPage
import com.example.base_app.view.accounts.GuardianProfilePage
import com.example.base_app.view.accounts.ManageNotificationPage
import com.example.base_app.view.accounts.MyProfilePage
import com.example.base_app.view.accounts.TermsConditionPage

@Composable
fun AppNavigation() {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {

        composable("splash") {
            SplashScreen(navController)
        }

        composable("login") {
            LoginScreen(navController)
        }
        composable("signup") {
            SignupScreen(navController)
        }


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
        composable("account") {
            DrawerWrapperLayout(navController = navController) {
                AccountScreen(navController)
            }
        }

        composable("category") {
            DrawerWrapperLayout(navController = navController) {
                CategoryScreen(navController)
            }
        }

        composable("profile") {
            AccountWrapperLayout(navController = navController) {
                MyProfilePage()
            }
        }
        composable("guardian-profile") {
            AccountWrapperLayout(navController = navController) {
                GuardianProfilePage()
            }
        }

        composable("manage-notification") {
            AccountWrapperLayout(navController = navController) {
                ManageNotificationPage()
            }
        }
        composable("change-password") {
            AccountWrapperLayout(navController = navController) {
                ChangePasswordPage(navController)
            }
        }
        composable("terms-condition") {
            AccountWrapperLayout(navController = navController) {
                TermsConditionPage()
            }
        }
    }
}

