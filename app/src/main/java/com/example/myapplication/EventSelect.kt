package com.example.myapplication

import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
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
import java.util.Locale

class EventSelect : AppCompatActivity() {
    lateinit var textView: TextView
    private var hour = 0
    private var minute = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_second)
        textView = findViewById(R.id.editText)
        val text = "The time is Time"
        val ss = SpannableString(text)
        val fcsBlack = ForegroundColorSpan(Color.BLACK)
        ss.setSpan(fcsBlack, 12, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = ss
        val clickableSpan: ClickableSpan = object : ClickableSpan() {
            override fun onClick(view: View) {
                popTimePicker()
            }
        }
        ss.setSpan(clickableSpan, 12, 16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        textView.text = ss
        textView.movementMethod = LinkMovementMethod.getInstance()
    }

    fun popTimePicker() {
        val onTimeSetListener = OnTimeSetListener { timePicker, selectedHour, selectedMinute ->
            hour = selectedHour
            minute = selectedMinute
            textView.text = String.format(Locale.getDefault(), "%02d:%02d", hour, minute)
        }

        // int style = AlertDialog.THEME_HOLO_DARK;
        val timePickerDialog =
            TimePickerDialog(this,  /*style,*/onTimeSetListener, hour, minute, true)
        timePickerDialog.setTitle("Select Time")
        timePickerDialog.show()
    }
}