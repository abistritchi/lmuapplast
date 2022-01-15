package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_account.*

class AccountFragment : Fragment(R.layout.fragment_account) {
    companion object {
        @kotlin.jvm.JvmField
        var web_adress: String = "https://google.de"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_login.setOnClickListener {
            val action = AccountFragmentDirections.actionAccountFragmentToLoginFragment()
            findNavController().navigate(action)
        }

        button_studienplan.setOnClickListener {
            val action = AccountFragmentDirections.actionAccountFragmentToPlan()
            findNavController().navigate(action)
        }

        //button_google.setOnClickListener {
        //    SearchFragment.web_adress = "https://google.de/"
        //    val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
        //    findNavController().navigate(action)
        //}

    }
}