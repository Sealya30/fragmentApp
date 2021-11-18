package com.sealya.cpctenapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomMenu=findViewById(R.id.bottom_menu)
        bottomMenu.setOnItemSelectedListener { item->
            when (item.itemId) {
                R.id.car -> {
                    val carFragment = CarFragment()
                    replaceFragment(carFragment)
                }
                R.id.walk -> {
                    val walkFragment = WalkFragment()
                    replaceFragment(walkFragment)
                }
                R.id.bus -> {
                    val busFragment = BusFragment()
                    replaceFragment(busFragment)
                }
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

    }
}