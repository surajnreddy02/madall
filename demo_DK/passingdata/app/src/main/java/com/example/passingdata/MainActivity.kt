package com.example.passingdata

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nameEt = findViewById<EditText>(R.id.nameEt)
        val emailEt = findViewById<EditText>(R.id.emailEt)
        val phoneEt = findViewById<EditText>(R.id.phoneEt)
        val saveBtn = findViewById<Button>(R.id.saveBtn)
        //handle button click
        saveBtn.setOnClickListener {
        //get text from edittexts
            val name = nameEt.text.toString()
            val email = emailEt.text.toString()
            val phone = phoneEt.text.toString()
        //intent to start activity
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("Name", name)
            intent.putExtra("Email", email)
            intent.putExtra("Phone", phone)
            startActivity(intent)
            finish()
        }
    }
}
