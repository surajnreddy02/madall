package com.example.animations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Grape", "Kiwi", "Mango", "Pear")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"

        val autoTextView: AutoCompleteTextView = findViewById(R.id.text)
        val adapter: ArrayAdapter<String> = ArrayAdapter(
            this,
            android.R.layout.select_dialog_item,
            fruits
        )

        autoTextView.threshold = 1
        autoTextView.setAdapter(adapter)
    }
}


