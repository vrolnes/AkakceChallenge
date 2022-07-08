package com.example.akakcechallenge.feature.detailScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.akakcechallenge.ui.component.AsyncImage
import com.example.akakcechallenge.ui.component.DetailTopRow
import com.example.akakcechallenge.ui.component.ItemDetailInfo
import com.example.akakcechallenge.ui.component.StorageRow

@Composable
fun DetailScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        DetailTopRow()
        AsyncImage(
            modifier = Modifier.fillMaxWidth(),
            imageUrl = "https://cdn.akakce.com/x/apple/iphone-13.jpg"
        )
        StorageRow()
        ItemDetailInfo(modifier = Modifier.fillMaxWidth(), item = "")
    }
}