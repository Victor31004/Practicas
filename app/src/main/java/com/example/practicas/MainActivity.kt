package com.example.practicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import com.example.practicas.ui.theme.PracticasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticasTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Calculadora()
                }
            }
        }
    }
}
@Composable
fun Calculadora() {
    var expresion by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(200.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = expresion,
                fontSize = 32.sp,
                fontWeight = FontWeight.Light,
                maxLines = 1
            )
            Text(
                text = resultado,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { expresion += "7" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("7", fontSize = 22.sp) }

            Button(
                onClick = { expresion += "8" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("8", fontSize = 22.sp) }

            Button(
                onClick = { expresion += "9" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("9", fontSize = 22.sp) }

            Button(
                onClick = { expresion += " / " },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.White
                )
            ) { Text("/", fontSize = 22.sp) }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { expresion += "4" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("4", fontSize = 22.sp) }

            Button(
                onClick = { expresion += "5" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("5", fontSize = 22.sp) }

            Button(
                onClick = { expresion += "6" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("6", fontSize = 22.sp) }

            Button(
                onClick = { expresion += " x " },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.White
                )
            ) { Text("x", fontSize = 22.sp) }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { expresion += "1" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("1", fontSize = 22.sp) }

            Button(
                onClick = { expresion += "2" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("2", fontSize = 22.sp) }

            Button(
                onClick = { expresion += "3" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("3", fontSize = 22.sp) }

            Button(
                onClick = { expresion += " - " },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.White
                )
            ) { Text("-", fontSize = 22.sp) }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = { expresion += "0" },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("0", fontSize = 22.sp) }

            Button(
                onClick = { expresion += "." },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text(".", fontSize = 22.sp) }

            Button(
                onClick = {
                    try {
                        val res = operaciones(expresion.replace("x", "*"))
                        resultado = res.toString()
                    } catch (e: Exception) {
                        resultado = "Error"
                    }
                },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("=", fontSize = 22.sp) }

            Button(
                onClick = { expresion += " + " },
                modifier = Modifier.size(80.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Yellow,
                    contentColor = Color.White
                )
            ) { Text("+", fontSize = 22.sp) }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Button(
                onClick = {
                    if (expresion.isNotEmpty()) {
                        expresion = expresion.dropLast(1)
                    }
                },
                modifier = Modifier.size(87.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("DEL", fontSize = 22.sp) }

            Button(
                onClick = {
                    expresion = ""
                    resultado = ""
                },
                modifier = Modifier.size(87.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Gray,
                    contentColor = Color.White
                )
            ) { Text("AC", fontSize = 22.sp) }
        }
    }
}

fun operaciones(exp: String): String {
    val partes = exp.split(" ")
    if (partes.size < 3) return exp

    var resultado = partes[0].toDouble()
    var posicion = 1
    while (posicion < partes.size - 1) {
        val operador = partes[posicion]
        val numero = partes[posicion + 1].toDouble()
        if (operador == "+") resultado += numero
        else if (operador == "-") resultado -= numero
        else if (operador == "*") resultado *= numero
        else if (operador == "/") resultado /= numero

        posicion += 2
    }

    return resultado.toString()
}



