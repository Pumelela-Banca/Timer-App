package com.example.timerapp.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Index

@Entity(

    tableName="Timings",
    foreignKeys = [
        androidx.room.ForeignKey(
            entity = Tasks::class,
            parentColumns = ["id"],
            childColumns = ["taskId"],
            onDelete = androidx.room.ForeignKey.CASCADE
        )],
    indices = [Index("taskId")]


)
data class Timings(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val startTime: Long,
    val endTime: Long,
    val taskId: Int
)
