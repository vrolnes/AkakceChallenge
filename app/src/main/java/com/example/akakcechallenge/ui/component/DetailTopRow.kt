package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.gowtham.ratingbar.RatingBar

@Composable
fun DetailTopRow(){
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
            Text(text = "Apple", color = Color.Blue)
            Text(text = "iPhone 13 128 GB")
            Text(text = "En Popüler Cep Telefonu", modifier = Modifier.background(Color.Yellow))
        }
        RatingBar(value = 4F, onValueChange = {}, onRatingChanged = {})
    }
}