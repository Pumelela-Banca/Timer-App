package com.example.timerapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

import com.example.timerapp.data.entity.Tasks


@Dao
interface StudentDao {
    @Insert
    suspend fun insertStudent(Task: Tasks)

    @Query("SELECT * FROM Tasks")
    suspend fun getAllStudents(): List<Tasks>
}