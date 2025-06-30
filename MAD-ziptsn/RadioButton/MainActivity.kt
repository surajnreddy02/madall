package com.example.animations

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize the RadioGroup and Submit Button
        val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
        val submitButton: Button = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            // Get the ID of the selected radio button
            val selectedRadioButtonId: Int = radioGroup.checkedRadioButtonId

            if (selectedRadioButtonId != -1) { // Check if a radio button is selected
                // Find the selected radio button
                val selectedRadioButton: RadioButton = findViewById(selectedRadioButtonId)

                // Display a Toast with the selected subject
                val selectedSubject = selectedRadioButton.text.toString()
                Toast.makeText(this, "Selected Subject: $selectedSubject", Toast.LENGTH_SHORT).show()
            } else {
                // If no subject is selected, show a Toast for error
                Toast.makeText(this, "Please select a subject!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


