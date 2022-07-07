package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.layout.*
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
fun HorizontalScroll(modifier: Modifier, listItems: List<Any>) {
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
        HorizontalScrollItem(scrollItem = listItems[page])
        }
        HorizontalPagerIndicator(
            pagerState = pagerState,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
        )
    }
}

@Composable
fun HorizontalScrollItem(scrollItem: Any) {
    Row(modifier = Modifier.wrapContentSize()) {
        ItemWithDiscountCard(contentAlignment = Alignment.TopEnd)
    }
}