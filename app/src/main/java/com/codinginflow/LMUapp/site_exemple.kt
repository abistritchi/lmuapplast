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
import android.graphics.PorterDuff

import android.graphics.drawable.LayerDrawable
import android.graphics.Color

import android.widget.RatingBar




class site_exemple : Fragment(R.layout.fragment_site_exemple) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val ratingBar = R.id.rating_eip as RatingBar
        //val stars = ratingBar.progressDrawable as LayerDrawable
        //stars.getDrawable(2).setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP)

        button_eip_to_tutorium.setOnClickListener {
            val action = site_exempleDirections.actionSiteExempleToTutoriumEIP()
            findNavController().navigate(action)
        }
    }
}