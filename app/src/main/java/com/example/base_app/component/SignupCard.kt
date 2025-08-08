package com.example.base_app.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SignupCard(navController: NavController){
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var newPassword by remember { mutableStateOf("") }
    var newPasswordVisible by remember { mutableStateOf(false) }
    var isChecked by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = fullName,
            onValueChange = { fullName=it},
            label = { Text("Full Name", color = Color.Black) },
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.SemiBold),
            singleLine = true
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email,
            onValueChange = { email=it},
            label = { Text("Email", color = Color.Black) },
            textStyle = TextStyle(color = Color.Black, fontWeight = FontWeight.SemiBold),
            singleLine = true
        )
        PasswordField(
            label = "New Password",
            password = newPassword,
            onPasswordChange = { newPassword = it },
            passwordVisible = newPasswordVisible,
            onVisibilityToggle = { newPasswordVisible = !newPasswordVisible }
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Left side: Checkbox + Remember Me
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = isChecked,
                    onCheckedChange = { isChecked = it },
                    colors = CheckboxDefaults.colors(
                        checkedColor = Color(0xFF6200EE),
                        uncheckedColor = Color.Gray
                    )
                )
                Text(
                    text = "Remember me",
                    color = Color.Black,
                    modifier = Modifier.padding(start = 1.dp)
                )
            }

            // Right side: Forgot Password
            Text(
                text = "Forgot Password?",
                color = Color(0xFF6200EE),
                modifier = Modifier.clickable {
                    // Navigate to Forgot Password Screen or perform action
                }
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "have an account?",
                color = Color.Black,
            )

            Text(
                text = "Login now",
                textDecoration = TextDecoration.Underline,
                color = Color(0xFF6200EE),
                modifier = Modifier.clickable {
                    navController.navigate("login")
                }
            )
        }

        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = { navController.navigate("login") },
            modifier = Modifier.fillMaxWidth().size(48.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE53935)),
            shape = RoundedCornerShape(50),

            ) {
            Text(text = "Signup", color = Color.White)
        }
    }
}