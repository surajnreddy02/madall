package com.example.checkbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener{
            val c1=findViewById<CheckBox>(R.id.checkBox)
            val c2=findViewById<CheckBox>(R.id.checkBox2)
            val sb = StringBuilder("")
            if(c2.isChecked){
                sb.append(" " + c2.text)
            }
            if(c1.isChecked){
                sb.append(" "+ c1.text)
            }
            Toast.makeText(this, sb, Toast.LENGTH_SHORT).show()
        }
    }
}