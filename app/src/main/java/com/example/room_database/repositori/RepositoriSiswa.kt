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

