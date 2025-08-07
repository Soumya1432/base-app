package com.example.base_app.layout


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.base_app.R
@Composable
fun Footer(navController: NavController, onMenuClick: ()-> Unit) {
    val context = androidx.compose.ui.platform.LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .navigationBarsPadding() // ✅ This pushes the footer content *above* system bar
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        FooterItem(R.drawable.home, "Home") { /* navController.navigate(...) */ }
        FooterItem(R.drawable.search, "Search") { /* navController.navigate(...) */ }
        FooterItem(R.drawable.category, "Category") { /* navController.navigate(...) */ }
        FooterItem(R.drawable.account, "Account") { /* navController.navigate(...) */ }
    }

    }



@Composable
fun FooterItem(iconRes: Int, label: String, onClick: () -> Unit) {
    IconButton(onClick = onClick,  modifier = Modifier.width(72.dp).height(64.dp)) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.wrapContentHeight()
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = label,
                modifier = Modifier.size(24.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = label,
                fontSize = 12.sp,
                color = Color.Black,
                maxLines = 1,
                textAlign = TextAlign.Center,

            )
        }
    }
}
