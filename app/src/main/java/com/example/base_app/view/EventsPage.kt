package com.example.base_app.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.base_app.R
import com.example.base_app.component.EventCard
import com.example.base_app.dataclass.EventCardDetails
@Composable
fun EventsPage(navController: NavController){
  val eventList = listOf(
      EventCardDetails(
          imageRes = R.drawable.hostevent,
          title = "Championship",
          date = "2025-08-12",
          placeName = "National Stadium",
          description = "It used dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem..."
      ),
      EventCardDetails(
          imageRes = R.drawable.hostevent,
          title = "Championship",
          date = "2025-08-12",
          placeName = "National Stadium",
          description = "It used dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem..."
      ),
      EventCardDetails(
          imageRes = R.drawable.classoff,
          title = "Championship",
          date = "2025-08-12",
          placeName = "National Stadium",
          description = "It used dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem..."
      )
  )
    LazyColumn {
        items(eventList){ event ->
            EventCard(
                event=event,
                onReadMoreClick = {
                    // TODO: Navigate to details
                },
                onRegisterClick = {
                    // TODO: Open registration
                }
            )
        }
    }
}

