package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment


class vorlesung_beispiel : Fragment(R.layout.fragment_auswahl_von_vorlesungen) {
    companion object {
        @kotlin.jvm.JvmField
        var web_adress: String = "https://google.de"
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}