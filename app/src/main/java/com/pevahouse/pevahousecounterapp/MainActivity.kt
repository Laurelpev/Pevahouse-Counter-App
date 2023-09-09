package com.pevahouse.pevahousecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var countertxt : TextView
    private lateinit var buttonclick : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countertxt = findViewById(R.id.counter_txt)
        buttonclick = findViewById(R.id.btn_click)

        var clicked = 0

        buttonclick.setOnClickListener {
            clicked += 1

            countertxt.text = clicked.toString()
        }

    }
}
