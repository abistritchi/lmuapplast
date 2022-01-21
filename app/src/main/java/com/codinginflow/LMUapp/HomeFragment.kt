package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_search.*
import android.os.CountDownTimer
import android.widget.TextView
import com.codinginflow.LMUapp.databinding.FragmentHomeToWebBinding
import kotlin.system.measureTimeMillis


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        object : CountDownTimer(1000000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                val s = millisUntilFinished/20000
                if (button_weather_home!=null){
                    if ((s % 10).mod(2)!=0){
                        button_weather_home.setImageResource(R.drawable.weather)
                        SearchFragment.web_adress = "https://www.accuweather.com/en/de/munich/80331/weather-forecast/178086"
                    }
                    if ((s % 10).mod(2)==0) {
                        button_weather_home.setImageResource(R.drawable.lmu_building)
                        SearchFragment.web_adress = "https://www.lmu.de/de/index.html"
                    }
                }


            }

            override fun onFinish() {
                if (button_weather_home!=null) {
                    button_weather_home.setImageResource(R.drawable.weather)
                    SearchFragment.web_adress = "https://www.accuweather.com/en/de/munich/80331/weather-forecast/178086"
                }
            }
        }.start()

        button_uni2work.setOnClickListener {
            SearchFragment.web_adress = "https://uni2work.ifi.lmu.de"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }

        button_lsf.setOnClickListener {
            SearchFragment.web_adress = "https://lsf.verwaltung.uni-muenchen.de"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }

        button_moodle.setOnClickListener {
            SearchFragment.web_adress = "https://moodle.lmu.de/"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }


        button_raumfinder.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/raumfinder/#/"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_bibliothek.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToBibliothekAlgemain2()
            findNavController().navigate(action)
        }
        button_mensa.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMensaAlgemain2()
            findNavController().navigate(action)
        }
        button_lmuseite.setOnClickListener {
            SearchFragment.web_adress = "https://lmu.de"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_studentenwerk.setOnClickListener {
            SearchFragment.web_adress = "https://www.studentenwerk-muenchen.de/"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }

        button_friesten.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/die-lmu/struktur/fakultaeten/index.html"
            val action = HomeFragmentDirections.actionHomeFragmentToFriesten()
            findNavController().navigate(action)
        }

        button_anforderungen.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToAnforderungen()
            findNavController().navigate(action)
        }
        button_shop.setOnClickListener {
            SearchFragment.web_adress = "https://lmu-shop.de/"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }


        button_fakultaten.setOnClickListener {
            SearchFragment.web_adress = "https://www.lmu.de/de/die-lmu/struktur/fakultaeten/index.html"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }



        button_weather_home.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }

        button_HomeMap.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMapsFragment()
            findNavController().navigate(action)
        }



    }

}