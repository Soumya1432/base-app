package com.example.base_app.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.base_app.component.ClassScheduleCard
import com.example.base_app.dataclass.ClassSchedule

@Composable
fun ClassSchedulePage(navController: NavController){
    val scheduleList = listOf(
        ClassSchedule("Mon", "Room 101", "10:00 AM"),
        ClassSchedule("Tue", "Room 102", "11:00 AM"),
        ClassSchedule("Wed", "Room 103", "12:00 PM"),
        ClassSchedule("Thu", "Room 104", "01:00 PM"),
        ClassSchedule("Fri", "Room 105", "02:00 PM"),
        ClassSchedule("Sat", "Room 106", "03:00 PM"),
        ClassSchedule("Sun", "Room 107", "04:00 PM"),
        ClassSchedule("Mon", "Room 108", "05:00 PM"),
    )
    LazyColumn (modifier = Modifier.padding(top = 8.dp)) {
        items(scheduleList) { schedule ->
            ClassScheduleCard(schedule = schedule)
        }
    }
    Spacer(modifier = Modifier.height(16.dp))
    Column(modifier = Modifier.padding(8.dp)) {
            Image(painter = painterResource(id= com.example.base_app.R.drawable.classoff),
                contentDescription = "Class Off",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(bottom = 16.dp)
            )
    }

}