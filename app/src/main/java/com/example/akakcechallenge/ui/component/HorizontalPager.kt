package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HorizontalScroll(modifier: Modifier, listItems: List<Any>){
    Column(modifier = modifier) {
        val pagerState = rememberPagerState()
        HorizontalPager(
            count = listItems.size,
            state = pagerState,
            contentPadding = PaddingValues(horizontal = 32.dp),
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
        ) { page ->
            Text(text = listItems[page].toString())
        }

        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
        )
    }
}