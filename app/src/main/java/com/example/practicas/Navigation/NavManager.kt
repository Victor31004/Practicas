package com.example.practicas.Navigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.practicas.View.AFCView
import com.example.practicas.View.Arizona_CardinalsView
import com.example.practicas.View.Baltimore_RavensView
import com.example.practicas.View.Denver_BroncosView
import com.example.practicas.View.Green_Bay_PackersView
import com.example.practicas.View.HomeView
import com.example.practicas.View.Jacksonville_JaguarsView
import com.example.practicas.View.Miami_DolphinsView
import com.example.practicas.View.NFCView
import com.example.practicas.View.New_Orleans_SaintsView
import com.example.practicas.View.Washington_CommandersView

@Composable
fun AppNavigation(navController: NavController) {
    // Pantalla inicial: Splash
    SplashScreen(
        image = painterResource(id = R.drawable.mi_logo),
        durationMillis = 3000
    ) {
        // Cuando termine el splash, navega a Home
        navController.navigate("home") {
            popUpTo("splash") { inclusive = true }
        }
    }
}

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
        composable("M_D") {
            Miami_DolphinsView(navController)
        }
        composable("D_B") {
            Denver_BroncosView(navController)
        }
        composable("JV_J") {
            Jacksonville_JaguarsView(navController)
        }
        composable("GB_P") {
            Green_Bay_PackersView(navController)
        }
        composable("W_C") {
            Washington_CommandersView(navController)
        }
        composable("A_C") {
            Arizona_CardinalsView(navController)
        }
        composable("N_O_S") {
            New_Orleans_SaintsView(navController)
        }
    }
}