package com.example.base_app.layout

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun AccountLayout(
    navController: NavController,
    onMenuClick: () ->Unit,
    content: @Composable () -> Unit
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 32.dp)
            .navigationBarsPadding()
    ){
        Box(
            modifier = Modifier
                .weight(1f)
                .navigationBarsPadding()
        ) {
            content()
        }
    }
}