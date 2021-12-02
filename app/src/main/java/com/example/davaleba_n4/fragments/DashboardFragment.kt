package com.example.davaleba_n4.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.davaleba_n4.R
import org.w3c.dom.Text

class DashboardFragment : Fragment(R.layout.fragment_deshboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).amount.toString()
    }
}