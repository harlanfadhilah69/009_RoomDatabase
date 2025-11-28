package com.example.room_database.view.uicontroller

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.room_database.view.EntrySiswaScreen
import com.example.room_database.view.HomeScreen
import com.example.room_database.view.route.DestinasiEntry
import com.example.room_database.view.route.DestinasiHome

@Composable
fun SiswaApp(navController: NavHostController = rememberNavController(),
             modifier: Modifier){
    HostNavigasi(navController = navController)
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
){

}