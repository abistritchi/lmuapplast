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
                val s = millisUntilFinished/10000
                    if ((s % 10).mod(2)==0){
                        button_weather_home.setImageResource(R.drawable.weather)
                        SearchFragment.web_adress = "https://www.accuweather.com/en/de/munich/80331/weather-forecast/178086"
                    }
                    if ((s % 10).mod(2)!=0) {
                        button_weather_home.setImageResource(R.drawable.lmu_building)
                        SearchFragment.web_adress = "https://www.lmu.de/de/index.html"
                }


            }

            override fun onFinish() {
                    button_weather_home.setImageResource(R.drawable.weather)
                    SearchFragment.web_adress = "https://www.accuweather.com/en/de/munich/80331/weather-forecast/178086"
            }
        }.start()

        button_uni2work.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToUni2work()
            findNavController().navigate(action)
        }

        button_lsf.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLsf2()
            findNavController().navigate(action)
        }

        button_moodle.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMoodle()
            findNavController().navigate(action)
        }


        button_raumfinder.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToRaumfinder()
            findNavController().navigate(action)
        }
        button_bibliothek.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToBibliothekAlgemain()
            findNavController().navigate(action)
        }
        button_mensa.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMensaAlgemain()
            findNavController().navigate(action)
        }
        button_lmuseite.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToLmuseite()
            findNavController().navigate(action)
        }
        button_studentenwerk.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToStudentenwerk1()
            findNavController().navigate(action)
        }

        button_friesten.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToFriesten()
            findNavController().navigate(action)
        }
        button_anforderungen.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToAnforderungen()
            findNavController().navigate(action)
        }
        button_shop.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToShop()
            findNavController().navigate(action)
        }


        button_fakultaten.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToMainActivity1()
            findNavController().navigate(action)
        }

        button_fakultaten.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToFakultaten()
            findNavController().navigate(action)
        }


        button_weather_home.setOnClickListener {
            //SearchFragment.web_adress = "https://www.accuweather.com/en/de/munich/80331/weather-forecast/178086"
            val action = HomeFragmentDirections.actionHomeFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }



    }

}