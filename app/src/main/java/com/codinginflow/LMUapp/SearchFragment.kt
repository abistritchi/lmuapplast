package com.codinginflow.LMUapp

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_search.*

class SearchFragment : Fragment(R.layout.fragment_search) {
    companion object {
        @kotlin.jvm.JvmField
        var web_adress: String = "https://google.de"
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_google.setOnClickListener {
            web_adress = "https://google.de/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_wolfram_alpha.setOnClickListener {
            web_adress = "https://www.wolframalpha.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_zoom.setOnClickListener {
            web_adress = "https://zoom.us/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_studocu.setOnClickListener {
            web_adress = "https://www.studocu.com/de"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_studydrive.setOnClickListener {
            web_adress = "https://www.studydrive.net/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_wikipedia.setOnClickListener {
            web_adress = "https://www.wikipedia.org/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_beck.setOnClickListener {
            web_adress = "https://beck-online.beck.de/Home"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_lmucast.setOnClickListener {
            web_adress = "https://https://cast.itunes.uni-muenchen.de/#/home"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_syncandshare.setOnClickListener {
            web_adress = "https://syncandshare.lrz.de/login"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_scholar.setOnClickListener {
            web_adress = "https://scholar.google.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_lmuchat.setOnClickListener {
            web_adress = "https://chat.portal.lmu.de/home"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_scribbr.setOnClickListener {
            web_adress = "https://www.scribbr.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_vhb.setOnClickListener {
            web_adress = "https://kurse.vhb.org/VHBPORTAL/kursprogramm/kursprogramm.jsp"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_acm.setOnClickListener {
            web_adress = "https://dl.acm.org/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_amboss.setOnClickListener {
            web_adress = "https://www.amboss.com/de/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_dbis.setOnClickListener {
            web_adress = "https://dbis-uni-regensburg-de.emedien.ub.uni-muenchen.de/fachliste.php?bib_id=ub_m"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_dejure.setOnClickListener {
            web_adress = "https://dejure.org/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_destatis.setOnClickListener {
            web_adress = "https://www-genesis.destatis.de/genesis/online"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_dropbox.setOnClickListener {
            web_adress = "https://www.dropbox.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_emedien.setOnClickListener {
            web_adress = "https://www.ub.uni-muenchen.de/ausleihe-online/e-medien-login/index.html"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_gateway_bayern.setOnClickListener {
            web_adress = "https://www.gateway-bayern.de/TouchPoint_touchpoint/start.do"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }


        button_geogebra.setOnClickListener {
            web_adress = "https://www.geogebra.org/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_gitlab.setOnClickListener {
            web_adress = "https://gitlab.com/users/sign_in"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_goodnotes.setOnClickListener {
            web_adress = "https://www.goodnotes.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_google_docs.setOnClickListener {
            web_adress = "https://docs.google.com/document"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_joplin.setOnClickListener {
            web_adress = "https://joplinapp.org/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_jstor.setOnClickListener {
            web_adress = "https://www.jstor.org/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_juracademy.setOnClickListener {
            web_adress = "https://www.juracademy.de/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_kahoot.setOnClickListener {
            web_adress = "https://kahoot.it/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_lawdroid.setOnClickListener {
            web_adress = "https://lawdroid.de/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_linguee.setOnClickListener {
            web_adress = "https://www.linguee.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_lmuworkspace.setOnClickListener {
            web_adress = "https://www.lmu.de/de/workspace-fuer-studierende/index.html"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_benutzerkonto.setOnClickListener {
            web_adress = "https://www.portal.uni-muenchen.de/benutzerkonto/#!/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_mailbox.setOnClickListener {
            web_adress = "https://mailbox.portal.uni-muenchen.de/webmail/webmail/ui/MainPage.html"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_printservice.setOnClickListener {
            web_adress = "https://www.printservice.uni-muenchen.de/login.cfm?dest=index.cfm&"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_intranet.setOnClickListener {
            web_adress = "https://www.intranet.verwaltung.uni-muenchen.de/index.html"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_lmuteams.setOnClickListener{
            web_adress = "https://www.teams.portal.uni-muenchen.de"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_lehrevaluation.setOnClickListener{
            web_adress = "https://www.lehrevaluation.uni-muenchen.de/evasys/indexeva.php"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_studentenkanzlei.setOnClickListener{
            web_adress = "https://qissos.verwaltung.uni-muenchen.de/qisserversos/rds?state=user&type=0&application=lsf"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_cms.setOnClickListener{
            web_adress = "https://www.lmu.de/lmu-intern/angebote-beschreibung/cms-fiona/index.html"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_serviceportal.setOnClickListener{
            web_adress = "https://www.serviceportal.verwaltung.uni-muenchen.de/index.html"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_nextcloud.setOnClickListener{
            web_adress = "https://nextcloud.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_microsoft_to_do.setOnClickListener{
            web_adress = "https://www.microsoft.com/de-de/microsoft-365/microsoft-to-do-list-app?rtc=1"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_overleaf.setOnClickListener{
            web_adress = "https://www.overleaf.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_outlook.setOnClickListener{
            web_adress = "https://outlook.live.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_padlet.setOnClickListener{
            web_adress = "https://padlet.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_pruefungsaemter.setOnClickListener{
            web_adress = "https://www.lmu.de/de/studium/wichtige-kontakte/pruefungsaemter/index.html"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_quizlet.setOnClickListener{
            web_adress = "https://quizlet.com"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_rocket_chat.setOnClickListener{
            web_adress = "https://rocket.chat/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_sci_hub.setOnClickListener{
            web_adress = "https://sci-hub.mksa.top/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_slido.setOnClickListener{
            web_adress = "https://www.sli.do/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_stackoverflow.setOnClickListener{
            web_adress = "https://stackoverflow.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_zotero.setOnClickListener{
            web_adress = "https://www.zotero.org/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_zulip.setOnClickListener{
            web_adress = "https://zulip.com/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_studysmarter.setOnClickListener{
            web_adress = "https://www.studysmarter.de/en/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }

        button_videoonline.setOnClickListener{
            web_adress = "https://videoonline.edu.lmu.de/de"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_xournalpp.setOnClickListener{
            web_adress = "https://xournalpp.github.io/"
            val action = SearchFragmentDirections.actionSearchFragmentToSearchToWeb()
            findNavController().navigate(action)
        }
        button_to_sowtfare.setOnClickListener{
            val action = SearchFragmentDirections.actionSearchFragmentToSoftware()
            findNavController().navigate(action)
        }





    }
}