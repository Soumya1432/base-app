package com.example.base_app.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.base_app.R
import com.example.base_app.component.AccountCard
import com.example.base_app.component.CategoryCard

@Composable
fun AccountsPage(navController: NavController){
    LazyColumn {
        item {
            AccountCard(
                icon = R.drawable.profile,
                title = "My Profile",
                subTitle =  "View or update your profile info",
                onCLick = {navController.navigate("profile")}
            )
        }
        item {
            AccountCard(
                icon = R.drawable.lock,
                title = "Change Password",
                subTitle =  "Update your account password",
                onCLick = {navController.navigate("change-password")}
            )
        }
        item {
            AccountCard(
                icon = R.drawable.guardian,
                title = "View Guardian Info",
                subTitle =  "Linked Guardian Contact Details",
                onCLick = {navController.navigate("guardian-profile")}
            )
        }

        item {
            AccountCard(
                icon = R.drawable.notification,
                title = "Manage Notification",
                subTitle =  "Manage Notification Preferences",
                onCLick = {navController.navigate("manage-notification")}
            )
        }
          item {
              AccountCard(
                  icon = R.drawable.logout,
                  title = "Logout",
                  subTitle =  "logout from your account",
                  onCLick = {navController.navigate("")}
              )
          }

           item {
               AccountCard(
                   icon = R.drawable.accountdelete,
                   title = "Delete Account",
                   subTitle =  "Permanently delete your account",
                   onCLick = {navController.navigate("home")}
               )
           }
        item {
            AccountCard(
                icon = R.drawable.terms,
                title = "Terms & Conditions",
                subTitle =  "View the rules or condition to use app",
                onCLick = {navController.navigate("terms-condition")}
            )
        }




        }
    }


