package com.example.navigationlab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationlab.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding : FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container,false)
        val root: View = binding.root
        val firstButton = binding.firstButton.setOnClickListener { navigateFirstButton(root) }
        val secondButton = binding.secondButton.setOnClickListener { navigateSecondButton(root) }

        return root
    }

    private fun navigateFirstButton(root: View) {
        Navigation.findNavController(root).navigate(R.id.action_firstFragment_to_secondFragment)
    }


    private fun navigateSecondButton(root: View) {
        Navigation.findNavController(root).navigate(R.id.action_firstFragment_to_thirdFragment)
    }

}