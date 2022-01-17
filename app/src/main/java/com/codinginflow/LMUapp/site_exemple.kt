package com.codinginflow.LMUapp

import android.os.Bundle
import com.codinginflow.LMUapp.site_exemple
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.codinginflow.LMUapp.R
import com.codinginflow.LMUapp.databinding.FragmentSiteExempleBinding
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_site_exemple.*

class site_exemple : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_hussman.setOnClickListener {
            val action = site_exempleDirections.actionSiteExempleToTutoriumEIP()
            findNavController().navigate(action)
        }
    }
}