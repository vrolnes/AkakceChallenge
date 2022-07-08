package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.akakcechallenge.data.Product

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun VerticalGrid(gridItems: List<Product>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),

        // content padding
        contentPadding = PaddingValues(
            start = 12.dp,
            top = 16.dp,
            end = 12.dp,
            bottom = 16.dp
        )
    ) {
        items(gridItems.size) { index ->
            VerticalGridItem(scrollItem = gridItems[index])
        }
    }
}

@Composable
fun VerticalGridItem(scrollItem: Product) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
    ) {
        ItemWithDiscountImage(
            scrollItem.imageUrl.toString(),
            scrollItem.dropRatio.toString(), contentAlignment = Alignment.TopEnd
        )
        ItemInfo(modifier = Modifier.wrapContentSize(), item = scrollItem)
    }
}