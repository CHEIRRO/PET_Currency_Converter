package com.example.pet_currency_converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.pet_currency_converter.databinding.FragmentSecondActivityBinding

class SecondActivityFragment : Fragment() {
    lateinit var binding: FragmentSecondActivityBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondActivityBinding.inflate(inflater)
        return binding.root
    }

}