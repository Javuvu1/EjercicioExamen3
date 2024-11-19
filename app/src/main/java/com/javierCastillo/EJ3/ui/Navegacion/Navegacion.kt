package com.javierCastilloEJ3.ui.Navegacion

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.javierCastilloEJ3.ui.Pantallas.Pantalla1
import com.javierCastilloEJ3.ui.Pantallas.Pantalla2


@Composable
fun Navegacion() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "pantalla1") {
        composable("pantalla1") { Pantalla1(navController) }
        composable(
            "pantalla2/{mensaje}",
            arguments = listOf(navArgument("mensaje") { type = NavType.StringType })
        ) { backStackEntry ->
            val mensaje = backStackEntry.arguments?.getString("mensaje") ?: "Sin mensaje"
            Pantalla2(navController, mensaje)
        }
    }
}