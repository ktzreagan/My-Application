package com.example.myapplication

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class ThingSelection : AppCompatActivity() {
    private lateinit var button: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_third)
        button = findViewById(R.id.imageButton4)
        button.setOnClickListener {

        }
    }
}