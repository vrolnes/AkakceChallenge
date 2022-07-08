package com.example.akakcechallenge.feature.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.akakcechallenge.ui.component.HorizontalScroll
import com.example.akakcechallenge.ui.component.VerticalGrid


@Composable
fun MainScreen(navController: NavHostController, test: List<String>, onItemClicked: (String) -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalScroll(modifier = Modifier.fillMaxWidth(), listItems = test, onItemClicked)
        VerticalGrid(gridItems = test + test)
    }
}