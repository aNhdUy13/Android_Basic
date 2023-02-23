package com.wk.androidbasic.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wk.androidbasic.database.AppDatabase
import com.wk.androidbasic.database.repository.TaskRepository
import com.wk.androidbasic.models.Task
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TaskViewModels(app: Application) : AndroidViewModel(app) {
    val getAllTask:LiveData<List<Task>>
    val taskRepository:TaskRepository

    init {
        val taskDAO = AppDatabase.getInstance(app).getTaskDAO()
        taskRepository = TaskRepository(taskDAO)
        getAllTask = taskRepository.getAllTask

    }
    fun insertTask(task:Task) = viewModelScope.launch(Dispatchers.IO) {
        taskRepository.insertTask(task)
    }

    fun updateTask(task: Task) = viewModelScope.launch(Dispatchers.IO) {
        taskRepository.updateTask(task)
    }

    fun deleteTask(task: Task) = viewModelScope.launch(Dispatchers.IO) {
        taskRepository.deleteTask(task)
    }

}