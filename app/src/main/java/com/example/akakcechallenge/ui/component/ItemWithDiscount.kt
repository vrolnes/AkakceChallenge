package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ItemWithDiscountCard(contentAlignment: Alignment){
    Box(
        modifier = Modifier.wrapContentWidth()
            .padding(16.dp),
        contentAlignment = contentAlignment
    ) {
        AsyncImage(
            modifier = Modifier.wrapContentWidth().padding(32.dp),
            imageUrl = "https://cdn.akakce.com/x/apple/iphone-13.jpg"
        )
        CircleShape(text = "10")
    }
}