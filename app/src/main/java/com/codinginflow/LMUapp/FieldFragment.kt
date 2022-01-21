package com.codinginflow.LMUapp

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_field.*
import kotlinx.android.synthetic.main.fragment_home.*
import java.io.InputStream
import java.lang.Exception
import java.net.URL
import java.util.concurrent.Executors

class FieldFragment : Fragment(R.layout.fragment_field) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




        button_news1.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/newsroom/newsuebersicht/news/auf-immerwiedersehen.html"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_news2.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/newsroom/newsuebersicht/news/statistik-neuartiges-verfahren-an-der-lmu-verbessert-datengrundlage-fuer-umfragen.html"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_news3.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/newsroom/newsuebersicht/news/lmu-forscher-dmitri-efetov-exotische-physik-in-der-zweiten-dimension.html"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_news4.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/newsroom/newsuebersicht/news/selbstorganisation-komplexer-strukturen-ein-blick-auf-die-uhr.html"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_news5.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/newsroom/newsuebersicht/news/ki-lecture-datengestuetzte-politische-entscheidungen.html"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_news6.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/newsroom/newsuebersicht/news/mum-und-einsichten-lmu-magazine-starten-leserbefragung.html"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }


        Picasso.get().load("https://cms-cdn.lmu.de/media/newsroom-content-hub/photos/newyork_ferry_picture_alliance_mary_evans_picture_library_paul_brown_3_2_format_s.jpg").into(button_news1);
        Picasso.get().load("https://cms-cdn.lmu.de/media/newsroom-content-hub/photos/newsroom_stock/umfrage_imago-panthermedia_xandreypopovx_3_2_format_s.jpg").into(button_news2);
        Picasso.get().load("https://cms-cdn.lmu.de/media/newsroom-content-hub/photos/newsroom_stock/16_11_18-icfo-2-do-dia_dima-efetov_studio_5747_3_2_format_s.jpg").into(button_news3);
        Picasso.get().load("https://cms-cdn.lmu.de/media/newsroom-content-hub/photos/stoppuhr_3_2_format_s.jpg").into(button_news4);
        Picasso.get().load("https://cms-cdn.lmu.de/media/newsroom-content-hub/photos/ki_lecture_web_3_2_format_s.jpg").into(button_news5);
        Picasso.get().load("https://cms-cdn.lmu.de/media/newsroom-content-hub/photos/studierende__hightechcampus_id1904_3_2_format_s.jpg").into(button_news6);

    }
}

