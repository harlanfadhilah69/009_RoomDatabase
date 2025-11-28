package com.example.room_database.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.room_database.repositori.AplikasiSiswa
import com.example.room_database.viewmodel.EntryViewModel
import com.example.room_database.viewmodel.HomeViewModel

object PenyediaViewModel {
    val Factory = viewModelFactory{
       initializer {
           HomeViewModel(aplikasiSiswa().container.repositoriSiswa)
       }

        initializer {
            EntryViewModel(aplikasiSiswa().container.repositoriSiswa)
        }
    }
}

