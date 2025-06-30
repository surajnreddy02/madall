package com.example.pracimplicit

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val expli= Intent(this,secondactivity::class.java)
            startActivity(expli)
            finish()
        }

        val url="https://www.bmsce.ac.in"
        val but=findViewById<Button>(R.id.button2)
        but.setOnClickListener {
            val impl=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(impl)
        }
    }
}