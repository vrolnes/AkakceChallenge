package com.example.akakcechallenge.ui.feature.mainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.akakcechallenge.ui.component.HorizontalScroll
import com.example.akakcechallenge.ui.component.VerticalGrid


@Composable
fun MainScreen(
    onItemClicked: (String) -> Unit,
    mainViewModel: MainViewModel
) {
    mainViewModel.getMainScreen()?.let {
        Column(modifier = Modifier.fillMaxSize()) {
            it.result?.horizontalProducts?.let { it1 ->
                HorizontalScroll(
                    modifier = Modifier.fillMaxWidth(),
                    listItems = it1,
                    onItemClicked
                )
            }
            it.result?.products?.let { it1 -> VerticalGrid(gridItems = it1, onItemClicked) }
        }
    }
}