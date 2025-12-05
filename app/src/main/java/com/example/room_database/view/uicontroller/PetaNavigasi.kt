package com.example.room_database.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.room_database.view.DetailSiswaScreen
import com.example.room_database.view.EntrySiswaScreen
import com.example.room_database.view.HomeScreen
import com.example.room_database.view.route.DestinasiDetailSiswa
import com.example.room_database.view.route.DestinasiDetailSiswa.itemIdArg
import com.example.room_database.view.route.DestinasiEntry
import com.example.room_database.view.route.DestinasiHome

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController(),
             modifier: Modifier){
    HostNavigasi(navController = navController)
}

// ... imports

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(navController = navController, startDestination = DestinasiHome.route, modifier = Modifier)
    {
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
                navigateToItemUpdate = { id ->
                    // 7. Implementasi navigasi ke Detail/Update dengan membawa ID
                    navController.navigate("${DestinasiDetailSiswa.route}/$id")
                }
            )
        }
        // ... (composable lainnya tetap sama)
        composable(DestinasiEntry.route){
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }

        composable (
            route = DestinasiDetailSiswa.routeWithArgs,
            arguments = listOf(navArgument(name = DestinasiDetailSiswa.itemIdArg){
                type = NavType.IntType
            })
        ) {
            DetailSiswaScreen(
                navigateBack = { navController.navigateUp() }
            )
        }
    }
}