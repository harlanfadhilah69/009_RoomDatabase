package com.example.room_database.viewmodel

import androidx.compose.runtime.LongState
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
        var uiStateSiswa by mutableStateOf(UIStateSiswa())
            private set
        /* Fungsi untuk memvalidasi input */
        private fun  validasiInput(uiState: DetailSiswa = uiStateSiswa.detailSiswa
        ): Boolean {
            return with(uiState) {
                nama.isNotBlank() && alamat.isNotBlank() && telepon.isNotBlank()
            }
        }

        fun updateUIState(detailSiswa: DetailSiswa) {
            uiStateSiswa=
                UIStateSiswa(detailSiswa = detailSiswa, isEntryValid =
                validasiInput(detailSiswa))
        }

        suspend fun saveSiswa() {
            if (validasiInput()) {
                repositoriSiswa.insertSiswa(uiStateSiswa.detailSiswa.toSiswa())
            }
        }
    }

data class UIStateSiswa(
    val detailSiswa: DetailSiswa = DetailSiswa(),
    val isEntryValid: Boolean = false
)
