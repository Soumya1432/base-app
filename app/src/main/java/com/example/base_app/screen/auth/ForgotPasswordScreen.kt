package com.example.base_app.screen.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.base_app.R


@Composable
fun ForgotPasswordScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp), // typical AppBar height
            contentAlignment = Alignment.Center
        ) {
            // Center Title
            Text(
                text = "Forgot Password",
                fontSize = 20.sp
            )
            // Back Icon on the left
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = { "" },
                    modifier = Modifier.size(48.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.logo),
                        contentDescription = "logo"
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Your content here

    }
}