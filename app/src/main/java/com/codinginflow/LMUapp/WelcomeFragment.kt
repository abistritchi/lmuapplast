package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_field.*
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment : Fragment(R.layout.fragment_welcome) {

    private val args: WelcomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //text_view_username.text = args.username
        //text_view_password.text = args.password

        button_ok.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToAccountFragment()
            findNavController().navigate(action)
        }
        button_lmucard.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/LMUcard/manage/dashboard"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_passwort.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/password-change"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_sicherheits.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/recovery-password"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_infodienst.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/lmu-info"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_teams.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/lmu-teams"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_berechtigungen.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/permissions"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_email.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/mailbox"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_microsift.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/microsoft365"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_confluence.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/confluence"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_lmu_chat.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/rocket-chat"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
        button_adobeid.setOnClickListener {
            SearchFragment.web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/adobe"
            val action = FieldFragmentDirections.actionFieldFragmentToHomeToWeb2()
            findNavController().navigate(action)
        }
    }
}