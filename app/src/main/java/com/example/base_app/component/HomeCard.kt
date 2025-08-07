package com.example.base_app.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeCard(iconRes: Int, label: String, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
            .background(color = Color.White)
            .shadow(4.dp, RoundedCornerShape(6.dp))
            .clip(RoundedCornerShape(6.dp))
            .border(width = 1.dp, color = Color.White, shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        onClick = onClick
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = label,
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = label,
                fontSize = 14.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                lineHeight = 18.sp,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


//@Composable
//fun HomeCard(iconRes: Int, label: String, onClick: () -> Unit) {
//    Box(
//        modifier = Modifier
//            .width(120.dp)
//            .height(120.dp)
//    ) {
//        // Red top border with rounded top corners
//        Box(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(6.dp)
//                .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
//                .background(Color.Red)
//                .align(Alignment.TopCenter)
//        )
//
//        Card(
//            onClick = onClick,
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(top = 3.dp) // Leave room for top border
//                .clip(RoundedCornerShape(16.dp))
//                .shadow(4.dp, RoundedCornerShape(16.dp)),
//            colors = CardDefaults.cardColors(containerColor = Color.White),
//        ) {
//            Column(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(12.dp),
//                verticalArrangement = Arrangement.Center,
//                horizontalAlignment = Alignment.CenterHorizontally
//            ) {
//                Image(
//                    painter = painterResource(id = iconRes),
//                    contentDescription = label,
//                    modifier = Modifier.size(32.dp)
//                )
//                Spacer(modifier = Modifier.height(8.dp))
//                Text(
//                    text = label,
//                    fontSize = 14.sp,
//                    color = Color.Black,
//                    textAlign = TextAlign.Center,
//                    lineHeight = 18.sp,
//                    modifier = Modifier.fillMaxWidth()
//                )
//            }
//        }
//    }
//}
//
