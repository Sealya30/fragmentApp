package com.sealya.cpctenapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class BusFragment : Fragment() {

    private lateinit var elseButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_bus, container, false)

        elseButton=view.findViewById(R.id.else_button)

        val walkFragment=WalkFragment()
        elseButton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, walkFragment)
                ?.commit()
        }
        return view
    }

}