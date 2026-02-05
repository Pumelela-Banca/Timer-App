package com.example.timerapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

import com.example.timerapp.data.dao.TasksDao
import com.example.timerapp.data.dao.TimingsDao
import com.example.timerapp.data.entity.Tasks
import com.example.timerapp.data.entity.Timings

@Database(entities = [Tasks::class, Timings::class], version = 1,  exportSchema = false)

abstract class AppDataBase: RoomDatabase() {
    abstract fun tasksDao(): TasksDao
    abstract fun timingsDao(): TimingsDao

    companion object {
        private const val DATABASE_NAME = "timer_app_database"

        @Volatile
        private var INSTANCE: AppDataBase? = null
        fun getInstance(context: Context): AppDataBase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    DATABASE_NAME).build()
                INSTANCE = instance
                instance
            }
        }


    }

}