package com.example.base_app.ui.theme


import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun AppTypography(): Typography {
    val outfit = outfitFontFamily()

    return Typography(
        bodyLarge = TextStyle(
            fontFamily = outfit,
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp,
            lineHeight = 24.sp,
            letterSpacing = 0.5.sp
        ),
        titleLarge = TextStyle(
            fontFamily = outfit,
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        ),
        labelSmall = TextStyle(
            fontFamily = outfit,
            fontWeight = FontWeight.Medium,
            fontSize = 11.sp
        )
        // Add more styles as needed
    )
}