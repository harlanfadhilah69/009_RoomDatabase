package com.example.room_database.repositori

import com.example.room_database.room.Siswa
import com.example.room_database.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>
    suspend fun insertSiswa(siswa: Siswa)
}

class OfflineRepositoriSisw(
    private val siswaDao: SiswaDao
);