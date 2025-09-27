package com.example.practicas.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
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
                title = { TitleBar("HomeView") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Red
                )
            )
        },
        floatingActionButton = {
            ActionButton()
        },
        containerColor = Color(0xFF232870)

    ){
        ContentHomeView(navController)
    }
}
/*@Composable
fun ContentHomeView(navController: NavController){
    val id=10;
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextView("Home View")
        Space(espacio = 20)
        MainButton(
            name="Detail View",
            backColor = Color.Red,
            color = Color.White
        ){
            navController.navigate("Detail/${id}")
        }
    }
}*/

@Composable
fun ContentHomeView(navController: NavController){
    val id=10;
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.nfl),
            contentDescription = "Logo"
        )
        TextView("Home View")
        Space(espacio = 20)
        MainButton(
            name="Detail View",
            backColor = Color.Red,
            color = Color.White
        ){
            navController.navigate("Details/${id}")
        }
    }
}