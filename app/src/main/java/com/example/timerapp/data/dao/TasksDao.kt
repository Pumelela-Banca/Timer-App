package com.example.timerapp.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete

import com.example.timerapp.data.entity.Tasks


@Dao
interface TasksDao {
    @Insert
    suspend fun insertStudent(task: Tasks)

    @Query("SELECT * FROM Tasks")
    suspend fun getAllStudents(): List<Tasks>

    @Delete
    suspend fun deleteStudent(task: Tasks)

}