package com.wk.androidbasic.fragment.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.wk.androidbasic.databinding.FragmentHomeBinding
import com.wk.androidbasic.fragment.home.TaskHandler.AddTask

class HomeFragment : Fragment() {
    val TAG = "HomeFragmentTag"
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.imgAdd.setOnClickListener {
            requireActivity().startActivity(Intent(activity, AddTask::class.java))
        }

        return binding.root
    }


    override fun onPause() {
        super.onPause()

        Log.e(TAG, "onPause fragment")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume fragment")

    }
}