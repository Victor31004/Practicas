package com.example.practicas.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.practicas.Components.BodyText
import com.example.practicas.Components.MainIconButton
import com.example.practicas.Components.TitleBar
import com.example.practicas.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Baltimore_RavensView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(" ") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFF2C2E8C),
                )
                ,navigationIcon= {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        contentB_RView()
    }

}

@Composable
fun contentB_RView() {
    Column {
            Image(
                painter = painterResource(id = R.drawable.baltimore_ravens),
                contentDescription = "BalRav",
                modifier = Modifier
                    .size(700.dp)
                    .alpha(0.5f)
            )
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            BodyText(
                text = "EST. 1996",
                fontSize = 30.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(top = 160.dp, start = 20.dp)
            )
        }
        item {
            BodyText(
                text = "BALTIMORE",
                fontSize = 50.sp,
                color = Color(0xFF2C2E8C),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(top = 5.dp, start = 20.dp)
            )
        }
        item {
            BodyText(
                text = "RAVENS",
                fontSize = 50.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(top = 175.dp, start = 220.dp)
            )
        }
        item {
            BodyText(
                text = "¿LO SABÍAS?",
                fontSize = 25.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(top = 40.dp, start = 20.dp)
            )
        }
        item {
            BodyText(
                text = "El nombre del equipo actual se inspiró en el famoso poema de Edgar Allan Poe \"El cuervo\", que se redactó en Baltimore, Maryland.",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp)
            )
        }
    }
}
