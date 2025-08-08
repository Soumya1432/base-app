package com.example.base_app.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
@Composable

fun UserProfileCard(
    profileImage: Any, // Int (R.drawable.x) or String (URL)
    fullName: String,
    email: String,
    onEditClick: () -> Unit = {}
) {
    val gradient = Brush.horizontalGradient(
        colors = listOf(Color(0xFFFFC107), Color(0xFFFFE082))
    )

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            // IMPORTANT: clip the container so children cannot draw outside the rounded shape
            .clip(RoundedCornerShape(16.dp))
            .background(brush = gradient) // safe to set background after clip
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Choose an avatar size that fits the card height
        val avatarSize = 72.dp

        AsyncImage(
            model = profileImage,
            contentDescription = "Profile Image",
            contentScale = ContentScale.Crop, // fill & crop inside circle
            modifier = Modifier
                .size(avatarSize)
                .clip(CircleShape) // ensure the avatar is circular
                .border(3.dp, Color.White, CircleShape) // optional white ring
        )

        Spacer(modifier = Modifier.width(16.dp))

        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = fullName,
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 4.dp)
            )
            Text(
                text = email,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.DarkGray
            )
        }
    }
}
