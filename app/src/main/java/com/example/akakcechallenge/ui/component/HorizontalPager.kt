package com.example.akakcechallenge.ui.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.akakcechallenge.models.HorizontalProduct
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.rememberPagerState

@OptIn(ExperimentalPagerApi::class)
@Composable
fun HorizontalScroll(
    modifier: Modifier,
    listItems: List<HorizontalProduct>,
    onItemClicked: (String) -> Unit
) {
    Column(modifier = modifier) {
        val pagerState = rememberPagerState()
        HorizontalPager(
            count = listItems.size,
            state = pagerState,
            modifier = Modifier
                .fillMaxWidth(),
        ) { page ->
            HorizontalScrollItem(scrollItem = listItems[page], onItemClicked)
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
fun HorizontalScrollItem(scrollItem: HorizontalProduct, onItemClicked: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 4.dp)
            .clickable {
                onItemClicked(scrollItem.code.toString())
            },
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        ItemWithDiscountImage(
            scrollItem.imageUrl.toString(),
            scrollItem.dropRatio.toString(), contentAlignment = Alignment.TopEnd
        )
        ItemInfo(modifier = Modifier.wrapContentSize(), item = scrollItem)
    }
}