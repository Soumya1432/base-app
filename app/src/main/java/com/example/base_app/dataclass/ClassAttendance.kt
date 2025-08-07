package com.example.base_app.dataclass

data class ClassAttendance(
    var classTiming : String,
    var classLocation:String,
    val isPresent : Boolean,
    var classStartTimer: String
)
