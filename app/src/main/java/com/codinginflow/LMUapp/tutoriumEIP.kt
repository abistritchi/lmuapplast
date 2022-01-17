package com.codinginflow.LMUapp

import android.os.Bundle
import com.codinginflow.LMUapp.tutoriumEIP
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codinginflow.LMUapp.R
import kotlinx.android.synthetic.main.fragment_site_exemple.*
import kotlinx.android.synthetic.main.fragment_tutorium_e_i_p.*


class tutoriumEIP : Fragment(R.layout.fragment_tutorium_e_i_p) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_backtolecture.setOnClickListener {
            val action = tutoriumEIPDirections.actionTutoriumEIPToSiteExemple()
            findNavController().navigate(action)
        }
    }
}