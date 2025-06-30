package com.example.animations

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun donut(view: View) {
        Toast.makeText(this, "Donut clicked!", Toast.LENGTH_SHORT).show()
    }
    fun choco(view: View) {
        Toast.makeText(this, "Chocolate clicked!",
        Toast.LENGTH_SHORT).show()
    }
    fun ice(view: View) {
        Toast.makeText(this, "IceCream clicked!",
        Toast.LENGTH_SHORT).show()
    }
}