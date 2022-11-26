package com.example.simplefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()
        val btnFragment1: Button = findViewById(R.id.btnFragment1)
        val btnFragment2: Button = findViewById(R.id.btnFragment2)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            addToBackStack(null)
            commit()
        }

        btnFragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                addToBackStack(null)
                commit()
            }
        }

        btnFragment2.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                commit()
            }
        }
    }
}