package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.method.LinkMovementMethod
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActionSelect : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_second)
        textView = findViewById(R.id.editText)
        val text = "Enter your notification text here"
        val ss = SpannableString(text)
        val fcsBlack = ForegroundColorSpan(Color.BLACK)
        ss.setSpan(fcsBlack, 29, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = ss
        val clickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(view: View) {}
        }
        ss.setSpan(clickableSpan, 29, 33, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = ss
        textView.movementMethod = LinkMovementMethod.getInstance()
    }
}