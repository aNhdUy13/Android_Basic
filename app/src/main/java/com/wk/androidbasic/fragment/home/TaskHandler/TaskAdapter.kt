package com.wk.androidbasic.fragment.home.TaskHandler

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.wk.androidbasic.databinding.ItemTaskBinding
import com.wk.androidbasic.models.Task

class TaskAdapter(
    val context: Context,
    val listTask : List<Task>,
    val taskClickInterface: TaskClickInterface
) : RecyclerView.Adapter<TaskAdapter.TaskHolder>() {


    inner class TaskHolder(val itemViewBinding: ItemTaskBinding) : RecyclerView.ViewHolder(itemViewBinding.root)
    {
        fun bind(task: Task)
        {
            itemViewBinding.txtTaskTitle.text = task.taskTitle
            itemViewBinding.txtTaskTime.text = task.taskTime

            itemViewBinding.itemTaskContainer.setOnClickListener {
                taskClickInterface.onTaskClickListener(task)
            }
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskHolder {
        val viewBinding = ItemTaskBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task, parent, false)
        return TaskHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: TaskHolder, position: Int) {
        holder.bind(listTask[position])

    }

    override fun getItemCount(): Int {
        return listTask.size
    }
}

interface TaskClickInterface{
    fun onTaskClickListener(task: Task)
}