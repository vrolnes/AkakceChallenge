package com.example.akakcechallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.akakcechallenge.feature.detailScreen.DetailScreen
import com.example.akakcechallenge.feature.detailScreen.DetailViewModel
import com.example.akakcechallenge.feature.mainScreen.MainScreen
import com.example.akakcechallenge.feature.mainScreen.MainViewModel
import com.example.akakcechallenge.ui.theme.AkakceChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainViewModel: MainViewModel by viewModels()
        val detailViewModel: DetailViewModel by viewModels()
        setContent {
            val navController = rememberNavController()
            AkakceChallengeTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NavHost(navController = navController, startDestination = "mainScreen") {
                        composable("mainScreen") {
                            MainScreen(
                                onItemClicked = {
                                    navController.navigate("detailScreen/$it")
                                },
                                mainViewModel
                            )
                        }
                        composable(
                            "detailScreen/{code}",
                            arguments = listOf(navArgument("code") { type = NavType.StringType })
                        ) { backStackEntry ->
                            DetailScreen(
                                backStackEntry.arguments?.getString("code"),
                                detailViewModel
                            )
                        }
                    }
                }
            }
        }
    }
}