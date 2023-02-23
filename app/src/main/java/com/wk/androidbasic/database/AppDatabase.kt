package com.wk.androidbasic.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.wk.androidbasic.models.Task
import com.wk.androidbasic.database.dao.TaskDAO


@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getTaskDAO(): TaskDAO

    companion object {

        @Volatile // @Volatile :
        private var INSTANCE: AppDatabase? = null

        @Synchronized
        fun getInstance(context: Context): AppDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "ToDoTask.database"
                ).build()
            }

            return INSTANCE as AppDatabase
        }

    }
}