package com.example.textview

import android.annotation.SuppressLint
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var myText:TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myText=findViewById(R.id.textExample)
        myText.setTextColor(Color.BLACK)
        myText.setText("this is an example")
        myText.setOnClickListener{
            myText.setTextColor(Color.BLUE)
            myText.setBackgroundColor(Color.BLACK)
            myText.visibility=View.VISIBLE
    }
    }
}