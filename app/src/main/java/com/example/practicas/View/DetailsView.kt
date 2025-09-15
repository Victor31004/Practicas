package com.example.practicas.View

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.practicas.Components.MainButton
import com.example.practicas.Components.MainIconButton
import com.example.practicas.Components.Space
import com.example.practicas.Components.TextView
import com.example.practicas.Components.TitleBar

@Preview(showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsView(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("DetailsView") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                )
                ,navigationIcon = {
            MainIconButton(icon = Icons.Default.ArrowBack) {
            }
        }
    )
}){
        ContentDetailView()
    }}


@Composable
fun ContentDetailView(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextView(texto="Detail View")
        Space(espacio = 20)
        TextView (texto="ID")
        MainButton(
            name="Return Home",
            backColor = Color.Blue,
            color = Color.White
        ){ }
    }
}