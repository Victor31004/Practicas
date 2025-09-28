package com.example.practicas.Components

import androidx.annotation.IdRes
import androidx.annotation.Size
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TextView(texto:String){
    Text(text = texto,
        fontSize = 40.sp,
        fontWeight = FontWeight.Bold,
        color = Color.Black,)
}

@Composable
fun Space(espacio:Int){
    Spacer(modifier = Modifier.height(espacio.dp))
}
@Composable
fun MainButton(name:String,backColor:Color,
               color: Color, modifier: Modifier, fontSize: TextUnit,
               imageRes: Int? = null,
               onClick:() -> Unit){
    Button(onClick=onClick,
        colors = ButtonDefaults.buttonColors(
            contentColor = color,
            containerColor = backColor
    ), modifier = modifier){

            if (imageRes != null) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = "icono",
                    modifier = Modifier
                        .size(24.dp),
                )
                Spacer(modifier = Modifier.width(8.dp))
            }
        Text(text = name,
            fontSize = fontSize)
    }
}
@Composable
fun MainButtonDos(
    name: String,
    backColor: Color,
    pressedColor: Color,
    color: Color,
    modifier: Modifier = Modifier,
    fontSize: TextUnit = 16.sp,
    imageRes: Int? = null,
    borderColor: Color = Color.Black,
    borderWidth: Dp = 2.dp,
    onClick: () -> Unit
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Button(
        onClick = onClick,
        interactionSource = interactionSource,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isPressed) pressedColor else backColor,
            contentColor = color
        ),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(borderWidth, borderColor),
        modifier = modifier
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (imageRes != null) {
                Image(
                    painter = painterResource(id = imageRes),
                    contentDescription = "icono",
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.height(8.dp))
            }

            Text(
                text = name,
                fontSize = fontSize,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
        }
    }
}
