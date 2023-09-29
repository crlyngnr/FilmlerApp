package com.example.filmlerapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable
@Entity(tableName = "filmler")
data class Filmler(@PrimaryKey(autoGenerate = true)
                   @ColumnInfo("id") @NotNull var id:Int,
                   @ColumnInfo("ad") @NotNull var ad:String,
                   @ColumnInfo("resim") @NotNull var resim:String,
                   @ColumnInfo("fiyat") @NotNull var fiyat:Int) : Serializable {

}