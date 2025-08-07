package com.example.base_app.component

data class HomeCardItem(
    val iconRes: Int,
    val label: String,
    val onClick: () -> Unit
)
