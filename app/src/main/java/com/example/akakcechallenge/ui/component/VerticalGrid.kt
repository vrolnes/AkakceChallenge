package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalGrid(gridItems: List<Any>){
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),

        // content padding
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        ),
        content = {
            items(gridItems.size) { index ->
                VerticalGridItem(scrollItem = "")
            }
        }
    )
}

@Composable
fun VerticalGridItem(scrollItem: Any) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
    ) {
        ItemWithDiscountImage(contentAlignment = Alignment.TopStart)
        ItemInfo(modifier = Modifier.wrapContentSize(), item = "")
    }
}