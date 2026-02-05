package com.example.timerapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete

import com.example.timerapp.data.entity.Timings

@Dao
interface TimingsDao {

    @Insert
    suspend fun insertTiming(timing: Timings)

    @Query("SELECT * FROM Timings")
    suspend fun getAllTimings(): List<Timings>

    @Delete
    suspend fun deleteTiming(timing: Timings)

}