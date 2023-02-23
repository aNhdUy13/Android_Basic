package com.wk.androidbasic.fragment.home.TaskHandler

import android.annotation.SuppressLint
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.wk.androidbasic.R
import com.wk.androidbasic.databinding.ActivityAddTaskBinding
import java.text.SimpleDateFormat
import java.util.Calendar

class AddTask : AppCompatActivity() {

    lateinit var binding: ActivityAddTaskBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFunc()
    }

    private fun initFunc() {
        val actionOnClickListener = View.OnClickListener {
            if (it == binding.imgBack) {
                finish()
            }
            if (it == binding.imgTimePicker) {
                timePicker()
            }
            if (it == binding.imgAddTask) {

            }
        }
        binding.imgBack.setOnClickListener(actionOnClickListener)
        binding.imgTimePicker.setOnClickListener(actionOnClickListener)
        binding.imgAddTask.setOnClickListener(actionOnClickListener)
    }

    @SuppressLint("SimpleDateFormat", "SetTextI18n")
    private fun timePicker() {
        val calendar = Calendar.getInstance()

        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { timePicker, hourOfDay, minute ->
                calendar.set(Calendar.HOUR_OF_DAY, hourOfDay)
                calendar.set(Calendar.MINUTE, minute)

                binding.txtTimeSelected.text = "$hourOfDay:$minute"

            },
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            true
        )

        timePickerDialog.show()

    }
}