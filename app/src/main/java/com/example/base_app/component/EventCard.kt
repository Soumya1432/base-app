package com.example.base_app.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.base_app.dataclass.EventCardDetails

@Composable
fun EventCard(
    event: EventCardDetails,
    onReadMoreClick: () -> Unit,
    onRegisterClick: () -> Unit,
    ) {

    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.fillMaxWidth().padding(12.dp)
            .border(1.dp, Color.LightGray, RoundedCornerShape(12.dp)),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {

        Column(modifier = Modifier.padding(12.dp)) {
            Image(
                painter = painterResource(id = event.imageRes),
                contentDescription = "Event Image",
                modifier = Modifier.fillMaxWidth().height(200.dp).clip(RoundedCornerShape(8.dp))
            )

            Spacer(
                modifier = Modifier
                    .fillMaxWidth(0.3f)
                    .height(6.dp)
                    .padding(start = 8.dp, top = 6.dp)
                    .background(Color.White, shape = RoundedCornerShape(4.dp))
            )
//            description
            Text(
                text = event.description,
                modifier = Modifier.padding(12.dp),
                fontSize = 14.sp,
                lineHeight = 18.sp,
                color = Color.DarkGray
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    onClick = onRegisterClick,
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF6C63FF) // Light purple
                    ),
                    modifier = Modifier.padding(end = 8.dp)
                ) {
                    Text("Open for Registration", color = Color.White)
                }

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .clickable { onReadMoreClick() }
                        .padding(4.dp)
                ) {
                    Text("Read more...", color = Color.Gray)
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = "Read more",
                        tint = Color.Gray
                    )
                }
            }
        }
    }
}