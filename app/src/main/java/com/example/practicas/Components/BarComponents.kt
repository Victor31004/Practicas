package com.example.practicas.Components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp

@Composable
fun TitleBar(name:String){
    Text(text=name, fontSize = (25.sp),
        color= Color.White)
}

@Composable
fun ActionButton(
    onClick: () -> Unit,
    containerColor: Color = Color.Red,
    contentColor: Color = Color.White,
    icon: ImageVector = Icons.Default.Home,
    contentDescription: String = "Action"
) {
    FloatingActionButton(
        onClick = onClick,
        containerColor = containerColor,
        contentColor = contentColor
    ) {
        Icon(
            imageVector = icon,
            contentDescription = contentDescription
        )
    }
}


@Composable
fun MainIconButton(icon: ImageVector, onClick: () -> Unit) {
    IconButton(onClick = onClick) {
        Icon(
            imageVector = icon,
            contentDescription = "Botón",
            tint = Color.White
        )
    }
}