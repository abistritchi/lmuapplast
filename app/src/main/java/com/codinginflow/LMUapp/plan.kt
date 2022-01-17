package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_plan.*

class plan : Fragment(R.layout.fragment_plan) {
    companion object {
        @kotlin.jvm.JvmField
        var web_adress: String = "https://google.de"
        var text_auswahl: String = ""
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button5.setOnClickListener {
            //web_adress = "https://www.medien.ifi.lmu.de/lehre/ws2021/eip/"
            //val action = planDirections.actionPlanToSiteExemple()
            findNavController().navigate(planDirections.actionPlanToSiteExemple())
        }

        button171.setOnClickListener {
            web_adress = "https://uni2work.ifi.lmu.de/course/W21/MI/Ana1"
            val action = planDirections.actionPlanToPlanToWeb()
            findNavController().navigate(action)
        }

        button179.setOnClickListener {
            text_auswahl = "Lineare Algebra 2:\nhttps://www.mathematik.uni-muenchen.de/~frei/la2.php\n\n\nTopologie und Differentialrechnung mehrerer Variablen\nhttps://www.mathematik.uni-muenchen.de/~diening/ss14/ana2/index.php"
            val action = planDirections.actionPlanToAuswahlVonVorlesungen()
            findNavController().navigate(action)
        }

        button1713.setOnClickListener {
            text_auswahl = "Softwareentwicklungspraktikum :\nhttps://www.mathematik.uni-muenchen.de/~frei/la2.php\n\n\nSystempraktikum \nhttps://www.mathematik.uni-muenchen.de/~diening/ss14/ana2/index.php"
            val action = planDirections.actionPlanToAuswahlVonVorlesungen()
            findNavController().navigate(action)
        }
    }
}