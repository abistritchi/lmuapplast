package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_field.*
import kotlinx.android.synthetic.main.fragment_home.*

class FieldFragment : Fragment(R.layout.fragment_field) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_news1.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToUni2work()
            findNavController().navigate(action)
        }


    }
}