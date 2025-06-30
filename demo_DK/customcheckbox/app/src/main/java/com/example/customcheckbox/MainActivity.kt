package com.example.customcheckbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var ckb3: CheckBox
    lateinit var ckb4: CheckBox
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.customcheck2)
        var btn=findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            var ckb3=findViewById<CheckBox>(R.id.checkBox)
            var ckb4=findViewById<CheckBox>(R.id.checkBox2)
            val sb = StringBuilder("") // create an empty string
            if (ckb3.isChecked)
                sb.append(" " + ckb3.text) //append the string with text message of checkbox given in layout file
            if (ckb4.isChecked)
                sb.append(" " + ckb4.text)
            Toast.makeText(this,sb,Toast.LENGTH_LONG).show()
        }
    }
}