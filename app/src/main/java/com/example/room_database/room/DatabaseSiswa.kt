package com.example.room_database.room

import android.provider.CalendarContract
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Siswa::class], version = 1, exportSchema = false)
abstract class DatabaseSiswa: RoomDatabase(){
    abstract fun SiswaDao() : SiswaDao

    companion object{
        @Volatile
        private var Instance: DatabaseSiswa? = null
    }
}
data class DatabaseSiswa()
