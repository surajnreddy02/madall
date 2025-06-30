package com.example.radiobutton

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var radioGroup: RadioGroup?=null
    lateinit var radioButton: RadioButton
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        title="radiogroup in kotlin"
        radioGroup=findViewById(R.id.rg)
        button=findViewById(R.id.button4)
        button.setOnClickListener {
            val selectedOption: Int = radioGroup!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)

            Toast.makeText(baseContext, radioButton.text, Toast.LENGTH_SHORT).show()
        }
    }
}