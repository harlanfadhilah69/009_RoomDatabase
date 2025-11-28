package com.example.room_database.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.room_database.repositori.RepositoriSiswa
import com.example.room_database.room.Siswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa): ViewModel()
    {
        /**
         * Berisi status siswa saat ini
         */
        var uiStateSiswa by mutableStateOf(UIStateSiswa))
            private set
        /* Fungsi untuk memvalidasi input */

    }