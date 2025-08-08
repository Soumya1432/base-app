package com.example.base_app.dataclass

data class EventCardDetails(
    val imageRes: Int, // drawable resource ID
    var title: String,
    var date: String,
//    var time: String,
    var placeName: String,
    var description: String
)
