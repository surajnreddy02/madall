package com.example.buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a=findViewById<EditText>(R.id.textView3)
        var b=findViewById<EditText>(R.id.textView)
        var add=findViewById<Button>(R.id.button)
        var res=findViewById<TextView>(R.id.textView4)
        add.setOnClickListener {
            res.text="result"+(a.text.toString().toInt()+b.text.toString().toInt()).toString()
        }
    }
}