package com.wk.androidbasic.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "TaskTable")
data class Task(
    @PrimaryKey(autoGenerate = true) val taskId:Int,
    @ColumnInfo var taskTitle: String?,
    @ColumnInfo var taskDescription: String?,
    @ColumnInfo var taskTime: String?
)