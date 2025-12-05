package com.example.room_database.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.room_database.repositori.AplikasiSiswa
import com.example.room_database.repositori.RepositoriSiswa

class EditViewModel(
    SavedStateHandle: SavedStateHandle,
    private val repositoriSiswa: RepositoriSiswa): ViewModel() {

        var uiStateSiswa by mutableStateOf(UIStateSiswa())
            private set

}