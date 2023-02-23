package com.wk.androidbasic.database.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.wk.androidbasic.database.AppDatabase
import com.wk.androidbasic.database.dao.TaskDAO
import com.wk.androidbasic.models.Task

class TaskRepository(private var taskDAO:TaskDAO) {

    fun insertTask(task:Task) {
        taskDAO.insertTask(task)
    }
    fun updateTask(task: Task) {
        taskDAO.updateTask(task)
    }
    fun deleteTask(task: Task) {
        taskDAO.deleteTask(task)
    }

    val getAllTask :LiveData<List<Task>> = taskDAO.getAllTask()
}