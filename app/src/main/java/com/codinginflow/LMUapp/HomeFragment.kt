package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

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





    }

}