package com.example.base_app.view.accounts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
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
import com.example.base_app.component.ForgotPasswordCard
import com.example.base_app.component.UserProfileCard

@Composable
fun MyProfilePage(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().padding(top = 24.dp).navigationBarsPadding()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(36.dp), // typical AppBar height
            contentAlignment = Alignment.Center
        ) {
            // Center Title
            Text(
                text = "My Profile",
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
                    onClick = { navController.popBackStack() },
                    modifier = Modifier.size(48.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.goback),
                        contentDescription = "logo",
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(8.dp))

        Column(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            UserProfileCard(
                profileImage = R.drawable.logo,
                fullName = "Soumya Biswas",
                email = "chatgptmatakijai@gmail.com"
            )
        }

    }

}