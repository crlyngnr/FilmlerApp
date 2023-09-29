package com.example.filmlerapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.filmlerapp.data.entity.Filmler

@Database(entities = [Filmler::class], version = 1)
abstract class Veritabani : RoomDatabase() {
    abstract fun getFilmlerDao() :FilmlerDao
}