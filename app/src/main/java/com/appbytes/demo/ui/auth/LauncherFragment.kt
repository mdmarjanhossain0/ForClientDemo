package com.appbytes.demo.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.appbytes.demo.R
import kotlinx.android.synthetic.main.fragment_launcher.*

class LauncherFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return layoutInflater.inflate(R.layout.fragment_launcher ,container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        login.setOnClickListener {
            navLogin()
        }

        register.setOnClickListener {
            naveRegistration()
        }

        forgot_password.setOnClickListener {
            navForgotPassword()
        }

    }

    private fun navForgotPassword() {
        findNavController().navigate(R.id.action_launcherFragment_to_forgotPasswordFragment)
    }

    private fun naveRegistration() {
        findNavController().navigate(R.id.action_launcherFragment_to_registrationFragment)
    }

    private fun navLogin() {
        findNavController().navigate(R.id.action_launcherFragment_to_logniFragment)
    }
}