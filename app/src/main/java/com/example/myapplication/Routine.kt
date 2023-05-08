package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Routine : AppCompatActivity() {
    private lateinit var floatingButton2: Button
    private lateinit var floatingButton3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first)
        floatingButton2 = findViewById(R.id.floatingActionButton2)
        floatingButton3 = findViewById(R.id.floatingActionButton3)
        floatingButton2.setOnClickListener {
            val i = Intent(applicationContext, EventSelect::class.java)
            startActivity(i)
        }
        floatingButton3.setOnClickListener {
            val i = Intent(applicationContext, ThingSelection::class.java)
            startActivity(i)
        }
    }
}