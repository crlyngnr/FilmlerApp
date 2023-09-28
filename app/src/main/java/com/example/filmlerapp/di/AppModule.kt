package com.example.filmlerapp.di

import com.example.filmlerapp.data.datasource.FilmlerDataSource
import com.example.filmlerapp.data.repository.FilmlerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent :: class)
class AppModule {
    @Provides
    @Singleton
    fun provideFilmlerDataSource() : FilmlerDataSource{
        return FilmlerDataSource()
    }

    @Provides
    @Singleton
    fun provideFilmlerRepository(fds : FilmlerDataSource) : FilmlerRepository{
        return FilmlerRepository(fds)
    }
}