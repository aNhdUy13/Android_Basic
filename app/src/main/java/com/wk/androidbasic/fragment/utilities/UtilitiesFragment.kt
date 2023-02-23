package com.wk.androidbasic.fragment.utilities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wk.androidbasic.databinding.FragmentUtilitiesBinding

class UtilitiesFragment : Fragment() {

    private lateinit var binding: FragmentUtilitiesBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentUtilitiesBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

}