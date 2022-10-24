package com.example.simondice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var simon: ImageView

    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val empezar:Button = findViewById(R.id.startButton)
        empezar.setOnClickListener {

        }
        //Todo: convertir imagen a .xml
        simon = findViewById(R.drawable.simonStart)
        simon.setImageResource(R.drawable.simonStart)
    }
}