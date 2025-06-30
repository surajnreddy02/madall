package com.example.autocomplete

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView


class MainActivity : AppCompatActivity() {
    private lateinit var autoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fruits = arrayOf("Apple", "Banana", "Cherry", "Date", "Grapes", "Guava", "Mango", "Pear")

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView)

        val adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, fruits)
        autoCompleteTextView.setAdapter(adapter)
    }
}