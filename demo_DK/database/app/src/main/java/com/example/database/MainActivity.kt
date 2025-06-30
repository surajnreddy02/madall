package com.example.database

import android.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var fname: EditText? = null
    var lname: EditText? = null
    var list: TextView? = null
    var dbc: dbcontroller? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fname = findViewById(R.id.fname)
        lname = findViewById(R.id.lname)
        list = findViewById(R.id.textView)
        dbc = dbcontroller(this, "", null, 1)
    }
    fun btn_click(v: View) {
        when (v.id) {
            R.id.btnadd -> dbc?.insert(fname!!.text.toString(), lname!!.text.toString())
            R.id.btndel -> dbc?.delete(fname!!.text.toString())

            R.id.btnupd -> {
                val dialog = AlertDialog.Builder(this@MainActivity)
                dialog.setTitle("Enter Firstname")
                val newFname = EditText(this)
                dialog.setView(newFname)
                dialog.setPositiveButton(
                    "OK"
                ) { dialog, which -> dbc?.update(fname!!.text.toString(), newFname!!.text.toString()) }
                dialog.show()
            }

            R.id.btnlis -> dbc?.list(list)
        }
    }
}
