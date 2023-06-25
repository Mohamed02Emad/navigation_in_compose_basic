package com.navigation.navigationincompose.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation(myModifier: Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            MainScreen(modifier = myModifier, navController)
        }

        composable("second_screen/{number}",
            arguments = listOf(navArgument("number") {
                type = NavType.IntType
                defaultValue = 5
                nullable = false
            })
        ) { entry ->
            SecondScreen(number = entry.arguments?.getInt("number") ?: 5 ,modifier = myModifier, navController)
        }
    }
}