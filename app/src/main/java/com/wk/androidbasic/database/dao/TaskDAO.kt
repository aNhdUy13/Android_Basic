package com.wk.androidbasic.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.wk.androidbasic.models.Task

@Dao
interface TaskDAO {

    @Query("SELECT * FROM TaskTable")
    fun getAllTask():LiveData<List<Task>>

    @Insert
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteTask(task: Task)
}