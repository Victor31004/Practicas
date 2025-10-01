package com.example.practicas.Components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    image: Painter,
    durationMillis: Long = 3000,
    onTimeout: () -> Unit
) {
    var isVisible by remember { mutableStateOf(true) }

    LaunchedEffect(key1 = true) {
        delay(durationMillis)
        isVisible = false
        onTimeout()
    }

    if (isVisible) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = image,
                contentDescription = "SplashScreen",
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}