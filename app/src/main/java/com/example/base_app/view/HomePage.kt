package com.example.base_app.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.base_app.R
import com.example.base_app.component.HomeCard
import com.example.base_app.component.HomeCardItem
import com.example.base_app.layout.FooterItem
import com.example.base_app.viewmodel.HomeViewModel

@Composable
//fun HomePage(modifier: Modifier = Modifier,viewModel: HomeViewModel)
fun HomePage(navController: NavController)
{

   val items= listOf(
       HomeCardItem(R.drawable.classschedule,"Class Schedule") {
           navController.navigate("schedule")
       },
       HomeCardItem(R.drawable.attendance,"Attendance") {
           navController.navigate("attendance")
       },
       HomeCardItem(R.drawable.performance,"Performance Tracking") {
           navController.navigate("performance")
       },
       HomeCardItem(R.drawable.achievements,"Achievements") {
           navController.navigate("achievements")
       },
       HomeCardItem(R.drawable.homework,"HomeWork") {
           navController.navigate("homework")
       },
       HomeCardItem(R.drawable.beltgrade,"Belt Grade Reports") {
           navController.navigate("beltgrade")
       },
       HomeCardItem(R.drawable.fees,"Fees") {
           navController.navigate("fees")
       },
       HomeCardItem(R.drawable.events,"Events") {
           navController.navigate("events")
       },
       HomeCardItem(R.drawable.notification,"Notification") {
           navController.navigate("notification")
       },
   )
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(items.size) { index ->
            val item = items[index]
            HomeCard(
                iconRes = item.iconRes,
                label = item.label,
                onClick = item.onClick
            )
        }
    }

//    val userData  = viewModel.userData.observeAsState()
//    val isLoading = viewModel.isLoading.observeAsState()


//        Button(onClick = {
//            viewModel.getUserData()
//        }) {
//            Text(text = "get Data")
//        }
//
//        if(isLoading.value==true){
//            CircularProgressIndicator()
//        }
//        else
//        {
//            userData.value?.name?.let {
//                Text(text = "NAME $it")
//            }
//            userData.value?.age?.let {
//                Text(text = "AGE $it")
//            }
//        }

    }
