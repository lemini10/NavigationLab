package com.example.navigationlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationlab.databinding.FragmentFirstBinding
import com.example.navigationlab.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {


    private var _binding : FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container,false)
        val root: View = binding.root
        val firstButton = binding.thirdButton.setOnClickListener { navigateFirstButton(root) }

        return root
    }

    private fun navigateFirstButton(root: View) {
        Navigation.findNavController(root).navigate(R.id.action_secondFragment_to_fourthFragment)
    }

}