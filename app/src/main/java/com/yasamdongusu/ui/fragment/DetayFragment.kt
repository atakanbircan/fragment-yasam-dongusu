package com.yasamdongusu.ui.fragment

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.yasamdongusu.R
import com.yasamdongusu.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding : FragmentDetayBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetayBinding.inflate(inflater, container, false)

        binding.btnDetay.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.transitionMainPage)
        }

        return binding.root
    }


}