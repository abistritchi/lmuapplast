package com.codinginflow.LMUapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_anforderungen.*

class Anforderungen : Fragment(R.layout.fragment_anforderungen) {


    var urlAdress: String = ""

    fun NewUrl(urlAdress: String) {
        this.urlAdress = urlAdress
    }


    fun setURl(urlAdress: String) {
        this.urlAdress = urlAdress
    }

    fun getURL(): String {
        return urlAdress
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setURl("https://google.de")

        bewerbung_zulassung_immatrikulation.setOnClickListener {
            setURl("https://www.lmu.de/de/studium/internationale-vollzeit-studierende/voraussetzungen/index.html")
            val action = AnforderungenDirections.actionAnforderungenToHomeFragment()
            findNavController().navigate(action)
        }

        button2.setOnClickListener {
            setURl("https://www.lmu.de/de/workspace-fuer-studierende/career-service/persoenliche-beratungsangebote/index.html")
            val action = AnforderungenDirections.actionAnforderungenToHomeFragment()
            findNavController().navigate(action)
        }


    }

}