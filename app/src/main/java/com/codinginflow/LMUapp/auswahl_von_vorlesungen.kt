package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

import kotlinx.android.synthetic.main.fragment_auswahl_von_vorlesungen.*


class auswahl_von_vorlesungen : Fragment(R.layout.fragment_auswahl_von_vorlesungen) {
    companion object {
        @kotlin.jvm.JvmField
        var web_adress: String = "https://google.de"
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        text_auswahl_2.text = plan.text_auswahl
        //button5.setOnClickListener {
        //    web_adress = "https://google.de/"
        //    val action = planDirections.actionPlanToPlanToWeb()
        //    findNavController().navigate(action)
        //}

    }
}