package com.example.filmlerapp.room

import androidx.room.Dao
import androidx.room.Query
import com.example.filmlerapp.data.entity.Filmler

@Dao
interface FilmlerDao {
    @Query("SELECT * FROM filmler")
    suspend fun filmleriYukle(): List<Filmler>
}