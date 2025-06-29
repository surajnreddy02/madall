package com.example.shared

import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeTextView = findViewById<TextView>(R.id.timeTextView)
        val pickTimeButton = findViewById<Button>(R.id.pickTimeButton)

        pickTimeButton.setOnClickListener {
            val calendar = Calendar.getInstance()
            val hour = calendar.get(Calendar.HOUR_OFDAY)
            val minute = calendar.get(Calendar.MINUTE)

            TimePickerDialog(this, { , selectedHour, selectedMinute ->
                val amPm = if (selectedHour >= 12) "PM" else "AM"
                val hourFormatted = if (selectedHour % 12 == 0) 12 else selectedHour % 12
                val minFormatted = String.format("%02d", selectedMinute)
                timeTextView.text = "Time is: $hourFormatted:$minFormatted $amPm"
            }, hour, minute, false).show()
        }
    }
}