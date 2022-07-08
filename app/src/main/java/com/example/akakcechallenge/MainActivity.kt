package com.example.akakcechallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.akakcechallenge.ui.component.HorizontalScroll
import com.example.akakcechallenge.ui.component.VerticalGrid
import com.example.akakcechallenge.ui.theme.AkakceChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val test = listOf("A", "B", "C")
        setContent {
            AkakceChallengeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen(test)
                }
            }
        }
    }
}

@Composable
fun MainScreen(test: List<String>) {
    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalScroll(modifier = Modifier.fillMaxWidth(), listItems = test)
        VerticalGrid(gridItems = test + test)
    }
}