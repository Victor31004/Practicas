package com.example.practicas.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.foundation.background
import com.example.practicas.Components.Space

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Arizona_CardinalsView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar(" ") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFFFFFB612),
                )
                ,navigationIcon= {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        contentA_CView()
    }

}

@Composable
fun contentA_CView() {
    Column {
        Image(
            painter = painterResource(id = R.drawable.arizona_cardinals),
            contentDescription = "BalRav",
            modifier = Modifier
                .size(500.dp)
                .alpha(0.5f)
                .padding(top = 200.dp)
        )
    }
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.Start
    ) {
        item {
            BodyText(
                text = "EST. 1921",
                fontSize = 30.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Normal,
                modifier = Modifier.padding(top = 160.dp, start = 20.dp)
            )
        }
        item {
            BodyText(
                text = "ARIZONA",
                fontSize = 50.sp,
                color = Color(0xFFFFFB612),
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(top = 5.dp, start = 20.dp)
            )
        }
        item {
            BodyText(
                text = "CARDINALS",
                fontSize = 50.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                modifier = Modifier.padding(top = 175.dp, start = 145.dp)
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
                text = "La franquicia de los Cardinals data de 1898," +
                        " lo que la convierte en el club de fútbol" +
                        " americano profesional más antiguo de la NFL.",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Normal,
                fontStyle = FontStyle.Normal,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(top = 10.dp, start = 15.dp, end = 15.dp)
            )
        }
        item {
            LazyRow {
                item {
                    Row {
                        Box(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                                .height(200.dp)
                                .width(400.dp)
                                .background(Color(0XFFF97233F), shape = RoundedCornerShape(16.dp))
                                .border(
                                    width = 3.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(16.dp)
                                )
                                .padding(top = 20.dp)
                                .padding(start = 10.dp)
                        ) {
                            BodyText(
                                text = "Estadio State Farm",
                                fontSize = 25.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 10.dp)
                            )
                            BodyText(
                                text = "Glendale, AZ",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Normal,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 40.dp)
                            )
                            BodyText(
                                text = "Año de construcción: 2006",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 70.dp)
                            )
                            BodyText(
                                text = "Capacidad: 63,400",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 100.dp)
                            )
                            BodyText(
                                text = "Superficie: Hierba Natural",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 130.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                                .height(200.dp)
                                .width(400.dp)
                                .background(Color(0XFFF97233F), shape = RoundedCornerShape(16.dp))
                                .border(
                                    width = 3.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(16.dp)
                                )
                                .padding(20.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.estadioac),
                                contentDescription = "EstadioAC",
                                modifier = Modifier
                                    .size(1000.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                                .height(200.dp)
                                .width(400.dp)
                                .background(Color(0XFFF97233F), shape = RoundedCornerShape(16.dp))
                                .border(
                                    width = 3.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(16.dp)
                                )
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                        ) {
                            BodyText(
                                text = "CIUDAD DEL EQUIPO",
                                fontSize = 25.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 10.dp)
                            )
                            BodyText(
                                text = "Phoenix, AZ",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Normal,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 40.dp)
                            )
                            BodyText(
                                text = "POBLACIÓN DE LA CIUDAD",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 70.dp)
                            )
                            BodyText(
                                text = "1,644,409 (2022)",
                                fontSize = 20.sp,
                                color = Color.Black,
                                fontWeight = FontWeight.Normal,
                                fontStyle = FontStyle.Normal,
                                textAlign = TextAlign.Justify,
                                modifier = Modifier.padding(top = 100.dp)
                            )
                        }
                        Box(
                            modifier = Modifier
                                .padding(top = 30.dp)
                                .padding(start = 10.dp)
                                .height(200.dp)
                                .width(400.dp)
                                .background(Color(0XFFF97233F), shape = RoundedCornerShape(16.dp))
                                .border(
                                    width = 3.dp,
                                    color = Color.Black,
                                    shape = RoundedCornerShape(16.dp)
                                )
                                .padding(20.dp)
                        ){
                            Image(
                                painter = painterResource(id = R.drawable.ciudadac),
                                contentDescription = "CiudadAC",
                                modifier = Modifier
                                    .size(1000.dp)
                            )
                        }
                    }
                }
            }
        }
        item {
            Space(espacio = 40)
        }
    }
}