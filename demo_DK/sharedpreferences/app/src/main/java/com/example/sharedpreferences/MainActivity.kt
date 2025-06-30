package com.example.sharedpreferences

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = findViewById<EditText>(R.id.ed1)
        val password = findViewById<EditText>(R.id.ed2)
        val save = findViewById<Button>(R.id.b1)
        val load = findViewById<Button>(R.id.b2)
        val clear = findViewById<Button>(R.id.b3)
        val del = findViewById<Button>(R.id.b4)
        val sharedPref = getSharedPreferences("addName", Context.MODE_PRIVATE)
        var edit = sharedPref.edit()
        save.setOnClickListener {
            edit.putString("name",name.text.toString())
            edit.putString("password", password.text.toString())
            edit.commit()
            Toast.makeText(this, "Data Saved", Toast.LENGTH_LONG).show()
        }
        load.setOnClickListener {
            val getname = sharedPref.getString("name", "default value")
            val getpass = sharedPref.getString("password","default value")
            Toast.makeText(this,getname+" "+getpass,Toast.LENGTH_LONG).show()
        }
        clear.setOnClickListener {
            name.text.clear()
            password.text.clear()
            Toast.makeText(this, "Fields Cleared", Toast.LENGTH_SHORT).show()
        }


        del.setOnClickListener {
            val edit = sharedPref.edit()
            edit.clear()
            edit.apply() // or commit()
            Toast.makeText(this, "All Data Deleted", Toast.LENGTH_SHORT).show()
        }
    }
}
