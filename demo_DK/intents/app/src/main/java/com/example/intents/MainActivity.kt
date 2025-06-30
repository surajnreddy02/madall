package com.example.intents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val explicitbutton = findViewById<Button>(R.id.button)
        explicitbutton.setOnClickListener {
            Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
            val explicitIntent = Intent(this, secondactivity::class.java)
            startActivity(explicitIntent)
            //finish()
        }
        //Implicit Intent
        val url ="https://www.google.com"
        val ib = findViewById<Button>(R.id.button2)
        ib.setOnClickListener {
//Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
            val implicitIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(implicitIntent)
        }
    }
}