package com.example.practicas.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.example.practicas.R
import com.example.practicas.View.SplashScreen
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
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "Splash"){
        composable("Home"){
            HomeView(navController)
        }
        composable("AFC") {
            AFCView(navController)
        }
        composable("NFC") {
            NFCView(navController)
        }

        //SPLASHSCREEN DE LA AFC
        composable("splash_baltimore") {
            SplashScreen(
                image = painterResource(id = R.drawable.baltimore_ravens),
                backgroundColor = Color(0xFF232870),
                durationMillis = 2000
            ) {
                navController.navigate("B_R") {
                    popUpTo("splash_baltimore") { inclusive = true }
                }
            }
        }
        composable("splash_MiamiDolphins") {
            SplashScreen(
                image = painterResource(id = R.drawable.miami_dolphins),
                backgroundColor = Color(0xFFF80F9FF),
                durationMillis = 2000
            ) {
                navController.navigate("M_D") {
                    popUpTo("splash_MiamiDolphins") { inclusive = true }
                }
            }
        }
        composable("splash_DenverBroncos") {
            SplashScreen(
                image = painterResource(id = R.drawable.denver_broncos),
                backgroundColor = Color(0xFFFFC4C02),
                durationMillis = 2000
            ) {
                navController.navigate("D_B") {
                    popUpTo("splash_DenverBroncos") { inclusive = true }
                }
            }
        }
        composable("splash_JacksonvilleJaguars") {
            SplashScreen(
                image = painterResource(id = R.drawable.jacksonville_jaguars),
                backgroundColor = Color(0xFFF006778),
                durationMillis = 2000
            ) {
                navController.navigate("JV_J") {
                    popUpTo("splash_JacksonvilleJaguars") { inclusive = true }
                }
            }
        }

        //SPLASHSCREEN DE LOS NFC
        composable("splash_GreenBayPackers") {
            SplashScreen(
                image = painterResource(id = R.drawable.green_bay_packers),
                backgroundColor = Color(0xFFF203731),
                durationMillis = 2000
            ) {
                navController.navigate("GB_P") {
                    popUpTo("splash_GreenBayPackers") { inclusive = true }
                }
            }
        }
        composable("splash_WashingtonCommanders") {
            SplashScreen(
                image = painterResource(id = R.drawable.washington_commanders),
                backgroundColor = Color(0xFFF5A1414),
                durationMillis = 2000
            ) {
                navController.navigate("W_C") {
                    popUpTo("splash_WashingtonCommanders") { inclusive = true }
                }
            }
        }
        composable("splash_ArizonaCardinals") {
            SplashScreen(
                image = painterResource(id = R.drawable.arizona_cardinals),
                backgroundColor = Color(0xFFFFFB612),
                durationMillis = 2000
            ) {
                navController.navigate("A_C") {
                    popUpTo("splash_ArizonaCardinals") { inclusive = true }
                }
            }
        }
        composable("splash_NewOrleansSaints") {
            SplashScreen(
                image = painterResource(id = R.drawable.new_orleans_saints),
                backgroundColor = Color(0XFFFC8B273),
                durationMillis = 2000
            ) {
                navController.navigate("N_O_S") {
                    popUpTo("splash_NewOrleansSaints") { inclusive = true }
                }
            }
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
        composable("Splash") {
            SplashScreen(
                image = painterResource(id = R.drawable.dorado),
                backgroundColor = Color(0xFF232870),
                durationMillis = 3000
            ) {
                navController.navigate("home") {
                    popUpTo("splash") { inclusive = true }
                }
            }

        }

    }
}