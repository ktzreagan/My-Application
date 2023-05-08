package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ContentMain : AppCompatActivity() {
    private lateinit var floatingButton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main)
        floatingButton2 = findViewById(R.id.floatingActionButton2)
        floatingButton2.setOnClickListener {
            val i = Intent(applicationContext, FirstFragment::class.java)
            startActivity(i)
        }
    }
}