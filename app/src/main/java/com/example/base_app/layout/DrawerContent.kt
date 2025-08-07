package com.example.base_app.layout



import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.base_app.R

@Composable
fun DrawerContent(
    onDestinationClick :(route:String) -> Unit
){
    Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
       // Text("NotesApp", style = MaterialTheme.typography.titleLarge, color = Color.Blue, modifier = Modifier.padding(bottom = 16.dp))
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Event Image",
            modifier = Modifier.fillMaxWidth().height(100.dp).clip(RoundedCornerShape(8.dp))
        )

        DrawerItem("My Profile",Icons.Default.Person,"profile",onDestinationClick)
        DrawerItem("Manage Notification",Icons.Default.Notifications,"managenotification",onDestinationClick)
        DrawerItem("Fees",Icons.Default.Refresh,"profile",onDestinationClick)
        DrawerItem("Settings",Icons.Default.Settings,"profile",onDestinationClick)
        DrawerItem("Support",Icons.Default.Info,"support",onDestinationClick)
        DrawerItem("Logout",Icons.Default.ExitToApp,"profile",onDestinationClick)

    }

}

@Composable
fun DrawerItem(
    label:String,
    icon:androidx.compose.ui.graphics.vector.ImageVector,
    route: String,
    onClick: (String) -> Unit
){
    Row(
        modifier = Modifier.fillMaxWidth().clickable { onClick(route) }.padding(12.dp),
        horizontalArrangement = Arrangement.Start

    ) {

        Icon(imageVector = icon, contentDescription = label)
        Spacer(modifier = Modifier.width(16.dp))
        Text(text = label)
    }
}