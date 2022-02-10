package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_biblio2.*
import kotlinx.android.synthetic.main.fragment_home.*



class biblio2 : Fragment(R.layout.fragment_biblio2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        opac_bibliothek.setOnClickListener {
            SearchFragment.web_adress = "https://opac.ub.uni-muenchen.de/TouchPoint/start.do?View=sunrise"
            val action = biblio2Directions.actionBiblio2ToHomeToWeb2()
            findNavController().navigate(action)
        }

        bibliothek_platz_regiestrierung2.setOnClickListener {
            SearchFragment.web_adress = "https://reservierung.ub.uni-muenchen.de/index.php"
            val action = biblio2Directions.actionBiblio2ToHomeToWeb2()
            findNavController().navigate(action)
        }


        button_book_kotlin.setOnClickListener {
            SearchFragment.web_adress = "https://ebookcentral.proquest.com/lib/ub-lmu/detail.action?docID=5332136"
            val action = biblio2Directions.actionBiblio2ToHomeToWeb2()
            findNavController().navigate(action)
        }

        button_book_statistik.setOnClickListener {
            SearchFragment.web_adress = "https://link-springer-com.emedien.ub.uni-muenchen.de/book/10.1007/978-3-662-63840-8"
            val action = biblio2Directions.actionBiblio2ToHomeToWeb2()
            findNavController().navigate(action)
        }

        button_book_sample.setOnClickListener {
            SearchFragment.web_adress = "https://ebookcentral.proquest.com/lib/ub-lmu/detail.action?docID=5332136"
            val action = biblio2Directions.actionBiblio2ToHomeToWeb2()
            findNavController().navigate(action)
        }

        button_book_mm1.setOnClickListener {
            val action = biblio2Directions.actionBiblio2ToBookMm12()
            findNavController().navigate(action)
        }

        button_book_2.setOnClickListener {
            val action = biblio2Directions.actionBiblio2ToBook2()
            findNavController().navigate(action)
        }

        button_book_3.setOnClickListener {
            val action = biblio2Directions.actionBiblio2ToBook3()
            findNavController().navigate(action)
        }





    }

}