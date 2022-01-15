package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class software : Fragment(R.layout.fragment_software) {
    companion object {
        @kotlin.jvm.JvmField
        var web_adress: String = "https://google.de"
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //button5.setOnClickListener {
        //    web_adress = "https://google.de/"
        //    val action = planDirections.actionPlanToPlanToWeb()
        //    findNavController().navigate(action)
        //}

    }
}