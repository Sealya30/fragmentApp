package com.sealya.cpctenapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class CarFragment : Fragment() {

    private lateinit var anyWayButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_car, container, false)

        anyWayButton=view.findViewById(R.id.any_way_button)

        val walkFragment=WalkFragment()
        anyWayButton.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container, walkFragment)
                ?.commit()
        }
        return view
    }
}