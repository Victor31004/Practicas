package com.example.practicas.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import com.example.practicas.R
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.practicas.Components.MainButton
import com.example.practicas.Components.Space
import com.example.practicas.Components.TextView
import androidx.compose.foundation.Image


@Composable
fun ContentFirstView(navController: NavController){
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
            navController.navigate("First/${id}")
        }
    }
}