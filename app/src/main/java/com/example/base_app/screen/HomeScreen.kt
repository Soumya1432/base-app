package com.example.base_app.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.example.base_app.view.HomePage
import com.example.base_app.viewmodel.HomeViewModel

@Composable
fun HomeScreen(navController: NavController){
//    val homeViewModel = ViewModelProvider(owner = this)[HomeViewModel::class]

//    HomePage(modifier = Modifier.padding(innerPadding), homeViewModel)
    HomePage(navController)

}