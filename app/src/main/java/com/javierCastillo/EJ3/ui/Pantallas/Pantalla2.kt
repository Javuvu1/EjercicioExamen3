package com.javierCastilloEJ3.ui.Pantallas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Pantalla2(navController: NavController, mensaje: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text("Pantalla 2")
        Text("Mensaje recibido: $mensaje")
        Button(onClick = { navController.navigateUp() }) {
            Text("Volver a Pantalla 1")
        }
    }
}
