package com.example.room_database.repositori

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.room_database.room.Siswa
import com.example.room_database.room.SiswaDao
import com.example.room_database.view.DetailSiswaScreen
import com.example.room_database.view.EditSiswaScreen
import com.example.room_database.view.EntrySiswaScreen
import com.example.room_database.view.HomeScreen
import com.example.room_database.view.route.DestinasiDetailSiswa
import com.example.room_database.view.route.DestinasiEditSiswa
import com.example.room_database.view.route.DestinasiEntry
import com.example.room_database.view.route.DestinasiHome
import kotlinx.coroutines.flow.Flow

@Composable
fun SiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController, modifier = modifier)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        // Rute untuk HomeScreen
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) },
                navigateToItemUpdate = { id ->
                    navController.navigate("${DestinasiDetailSiswa.route}/${id}")
                }
            )
        }

        // Rute untuk EntrySiswaScreen
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(navigateBack = { navController.popBackStack() })
        }

        // Rute untuk DetailSiswaScreen (dengan argumen ID)
        composable(
            route = DestinasiDetailSiswa.routeWithArgs,
            arguments = listOf(navArgument(name = DestinasiDetailSiswa.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            DetailSiswaScreen(
                navigateToEditItem = { navController.navigate("${DestinasiEditSiswa.route}/${it}") },
                navigateBack = { navController.navigateUp() }
            )
        }

        // Rute untuk EditSiswaScreen (dengan argumen ID)
        composable(
            route = DestinasiEditSiswa.routeWithArgs,
            arguments = listOf(navArgument(name = DestinasiEditSiswa.itemIdArg) {
                type = NavType.IntType
            })
        ) {
            EditSiswaScreen(
                navigateBack = { navController.popBackStack() },
                onNavigateUp = { navController.navigateUp() }
            )
        }
    }
}
