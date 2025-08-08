package com.example.base_app.layout

import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun AccountWrapperLayout(
    navController: NavController,
    content: @Composable () -> Unit
){
    AccountLayout(
        navController = navController,
        onMenuClick = { /* Handle menu click */ },
        content = content
    )

}