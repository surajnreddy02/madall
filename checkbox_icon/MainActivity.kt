package com.example.custom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.button1)
        btn.setOnClickListener {
            var ckb3 = findViewById<CheckBox>(R.id.checkBox3)
            var ckb4 = findViewById<CheckBox>(R.id.checkBox4)
            val sb = StringBuilder("") // create an empty string
            if (ckb3.isChecked)
                sb.append(" " + ckb3.text) //append the string with text message of checkbox given in layout file
            if (ckb4.isChecked)
                sb.append(" " + ckb4.text)
            Toast.makeText(this, sb, Toast.LENGTH_LONG).show()
        }
    }
}