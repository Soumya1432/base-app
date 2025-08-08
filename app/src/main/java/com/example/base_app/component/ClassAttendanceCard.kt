package com.example.base_app.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.base_app.dataclass.ClassAttendance

@Composable
fun ClassAttendance(attendance: ClassAttendance){
    val statusColor = if(attendance.isPresent) Color.Green else Color.Red
    val statusIcons = if(attendance.isPresent) Icons.Default.Check else Icons.Default.Close
 Card(
     modifier = Modifier
         .fillMaxWidth()
         .padding(8.dp),
     shape = RoundedCornerShape(12.dp),
     colors = CardDefaults.cardColors(containerColor = Color.White),
     elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
 ){
     Row(verticalAlignment = Alignment.CenterVertically,
         modifier = Modifier.padding(12.dp)
         ){

     }
 }
}