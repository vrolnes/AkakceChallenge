package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CircleShape(text: String) {
    Column(
        modifier = Modifier
            .wrapContentSize(Alignment.Center)
    ) {
        Box(
            modifier = Modifier
                .wrapContentSize()
                .clip(androidx.compose.foundation.shape.CircleShape)
                .background(Color.Red)
                .padding(8.dp)
        ) {
            Text(
                text = "%$text",
                color = Color.White,
                modifier = Modifier
            )
        }
    }
}