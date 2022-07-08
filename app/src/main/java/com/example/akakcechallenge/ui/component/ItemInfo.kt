package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ItemInfo(modifier: Modifier, item: Any) {
    Column(modifier = modifier) {
        Text(text = "iPhone 13 128 GB", color = Color.Blue)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = "20.567,00 TL")
        Text(text = "131 satıcı >")
        Text(text = "3.000 takip")
    }
}