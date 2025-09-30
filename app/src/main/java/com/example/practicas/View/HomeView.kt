package com.example.practicas.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.Navigator
import com.example.practicas.Components.ActionButton
import com.example.practicas.Components.MainButton
import com.example.practicas.Components.Space
import com.example.practicas.Components.TextView
import com.example.practicas.Components.TitleBar
import com.example.practicas.R


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(" ") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFF03911)
                )
            )
        },
        containerColor = Color(0xFF232870)

    ){
        ContentHomeView(navController)
    }
}

@Composable
fun ContentHomeView(navController: NavController) {
    val id = 10
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.size(500.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.estrellas),
                contentDescription = "Estrellas",
                modifier = Modifier.fillMaxSize()
            )
            Image(
                painter = painterResource(id = R.drawable.nfl),
                contentDescription = "Logo NFL",
                modifier = Modifier.size(265.dp)
            )
        }

        Space(espacio = 20)

        Row (
            horizontalArrangement = Arrangement.spacedBy(60.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            MainButton(
                name = "AFC",
                backColor = Color(0xFFF03911),
                color = Color.Black,
                modifier = Modifier.width(180.dp).height(70.dp),
                fontSize = 26.sp,
                imageRes = R.drawable.a
            ) {
                navController.navigate("AFC")
            }
            MainButton(
                name = "NFC",
                backColor = Color(0xFFF03911),
                color = Color.Black,
                modifier = Modifier.width(200.dp).height(70.dp),
                fontSize = 26.sp,
                imageRes = R.drawable.n
            ) {
                navController.navigate("NFC")
            }

        }
    }
}
