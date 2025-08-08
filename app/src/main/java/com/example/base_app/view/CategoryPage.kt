package com.example.base_app.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.base_app.R
import com.example.base_app.component.CategoryCard

@Composable
fun CategoryPage(){
    val eventList = listOf(
        com.example.base_app.dataclass.CategoryCardDataClass(
            imageRes = R.drawable.adultskarate,
            title = "Championship",
            description = "It used dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem..."
        ),
        com.example.base_app.dataclass.CategoryCardDataClass(
            imageRes = R.drawable.kidskarate,
            title = "Kids Katate",
            description = "It used dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem..."
        ),
        com.example.base_app.dataclass.CategoryCardDataClass(
            imageRes = R.drawable.selfdefence,
            title = "Self Defence",
            description = "It used dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem..."
        )

    )

    LazyColumn {
        items(eventList){ card ->
            CategoryCard(
                category = card,
            )

        }
    }
}