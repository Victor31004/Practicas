package com.example.practicas.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicas.Components.MainButton
import com.example.practicas.Components.MainButtonDos
import com.example.practicas.Components.MainIconButton
import com.example.practicas.Components.Space
import com.example.practicas.Components.TextView
import com.example.practicas.Components.TitleBar
import com.example.practicas.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsView(navController: NavController,id:Int){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(" ") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFFFF8000),
                )
                ,navigationIcon= {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentDetailView(navController,id)
    }

}

@Composable
fun ContentDetailView(navController: NavController,id: Int) {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.End
    ){
        Text(text = "SELECT A TEAM BELOW",
            fontSize = 20.sp,
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 120.dp))
    }
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.a),
                contentDescription = "AFC",
                modifier = Modifier
                    .size(270.dp)
                    .padding(top = 140.dp)
                    .padding(start = 10.dp),
                )
            Text(
                text = "AFC",
                fontSize = 50.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(top = 170.dp)
            )
        }
        Row (){
            Text(
                text = "NORTH",
                fontSize = 20.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(start = 10.dp)
            )
        }
        Row {
            MainButtonDos(
                name = "Baltimore Ravens",
                backColor = Color.White,
                pressedColor = Color(0xFFF402C5E),
                textColor = Color.Black,
                pressedTextColor = Color.White,
                modifier = Modifier
                    .width(415.dp)
                    .height(120.dp)
                    .padding(top = 5.dp)
                    .padding(start = 10.dp),
                fontSize = 30.sp,
                imageRes = R.drawable.baltimore_ravens,
                borderColor = Color.Black,
                borderWidth = 3.dp,
                onClick = {
                    navController.navigate("Detail/${id}")
                }
            )
        }
        Row() {
                Text(
                    text = "EAST",
                    fontSize = 20.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .padding(top = 10.dp)
                        .padding(start = 360.dp)
                )
            }
        Row {
            MainButtonDos(
                name = "Miami Dolphins",
                backColor = Color.White,
                pressedColor = Color(0xFFF80F9FF),
                textColor = Color.Black,
                pressedTextColor = Color.Yellow,
                modifier = Modifier
                    .width(415.dp)
                    .height(120.dp)
                    .padding(top = 5.dp)
                    .padding(start = 10.dp),
                fontSize = 30.sp,
                imageRes = R.drawable.miami_dolphins,
                borderColor = Color.Black,
                borderWidth = 3.dp,
                onClick = {
                    navController.navigate("Detail/${id}")
                }
            )
        }
        Row() {
            Text(
                text = "WEST",
                fontSize = 20.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(start = 10.dp)
            )
        }
        Row {
            MainButtonDos(
                name = "Denver Broncos",
                backColor = Color.White,
                pressedColor = Color(0xFFFE02400),
                textColor = Color.Black,
                pressedTextColor = Color(0Xfff0006A8),
                modifier = Modifier
                    .width(415.dp)
                    .height(130.dp)
                    .padding(top = 5.dp)
                    .padding(start = 10.dp),
                fontSize = 30.sp,
                imageRes = R.drawable.denver_broncos,
                borderColor = Color.Black,
                borderWidth = 3.dp,
                onClick = {
                    navController.navigate("Detail/${id}")
                }
            )
        }
        Row() {
            Text(
                text = "SOUTH",
                fontSize = 20.sp,
                color = Color.Gray,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier
                    .padding(top = 10.dp)
                    .padding(start = 340.dp)
            )
        }
        Row {
            MainButtonDos(
                name = "Jacksonville Jaguars",
                backColor = Color.White,
                pressedColor = Color(0xFFF04C736),
                textColor = Color.Black,
                pressedTextColor = Color(0XFFFC77204),
                modifier = Modifier
                    .width(415.dp)
                    .height(120.dp)
                    .padding(top = 5.dp)
                    .padding(start = 10.dp),
                fontSize = 30.sp,
                imageRes = R.drawable.jacksonville_jaguars,
                borderColor = Color.Black,
                borderWidth = 3.dp,
                onClick = {
                    navController.navigate("Detail/${id}")
                }
            )
        }
    }
}

