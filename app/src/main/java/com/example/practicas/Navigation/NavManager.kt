package com.example.practicas.Navigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practicas.View.AFCView
import com.example.practicas.View.Baltimore_RavensView
import com.example.practicas.View.HomeView
import com.example.practicas.View.NFCView


@Composable
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }
        composable("AFC") {
            AFCView(navController)
        }
        composable("NFC") {
            NFCView(navController)
        }
        composable("B_R") {
            Baltimore_RavensView(navController)
        }
    }
}