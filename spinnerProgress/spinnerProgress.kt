package com.example.spinnerprogress

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var spinnerProgress: ProgressBar
    private lateinit var startButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerProgress = findViewById(R.id.spinner_progress)
        startButton = findViewById(R.id.start_button)

        startButton.setOnClickListener {
            // Show spinner
            spinnerProgress.visibility = View.VISIBLE
            startButton.isEnabled = false

            // Simulate loading for 3 seconds
            Handler(Looper.getMainLooper()).postDelayed({
                spinnerProgress.visibility = View.GONE
                startButton.isEnabled = true
            }, 3000)
        }
    }
}
