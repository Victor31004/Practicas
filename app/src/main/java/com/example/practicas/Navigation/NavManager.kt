package com.example.practicas.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun NavManager(){
    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = "HomeView")
}