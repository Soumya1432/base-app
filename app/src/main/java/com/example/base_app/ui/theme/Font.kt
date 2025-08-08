package com.example.base_app.ui.theme

// imports
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font as GoogleFontFont

import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import com.example.base_app.R

@Composable
fun outfitFontFamily(): FontFamily {
    val context = LocalContext.current

    val provider = GoogleFont.Provider(
        providerAuthority = "com.google.android.gms.fonts",
        providerPackage= "com.google.android.gms",
        certificates = R.array.com_google_android_gms_fonts_certs
    )

    val outfitFont = GoogleFont("Outfit")

    return FontFamily(
        androidx.compose.ui.text.googlefonts.Font(googleFont = outfitFont, fontProvider = provider)
    )
}