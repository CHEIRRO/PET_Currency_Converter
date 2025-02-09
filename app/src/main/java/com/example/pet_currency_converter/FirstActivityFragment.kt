package com.example.pet_currency_converter

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.pet_currency_converter.databinding.FragmentFirstActivityBinding

class FirstActivityFragment : Fragment() {
    private lateinit var binding: FragmentFirstActivityBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstActivityBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonToSecondActivity.setOnClickListener {
            findNavController().navigate(R.id.action_firstActivityFragment_to_secondActivityFragment)
        }
        binding.button123.setOnClickListener {
            findNavController().navigate(R.id.action_firstActivityFragment_to_secondActivityFragment)
        }
    }
}