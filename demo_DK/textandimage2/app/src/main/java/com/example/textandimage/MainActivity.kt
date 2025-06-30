package com.example.textandimage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun donut(view : View){
        Toast.makeText(this,"froyo!",Toast.LENGTH_SHORT).show()
    }
    fun waffle(view : View){
        Toast.makeText(this,"chocolates!",Toast.LENGTH_SHORT).show()
    }
    fun cupcake(view : View){
        Toast.makeText(this,"doughnuts!",Toast.LENGTH_SHORT).show()
    }
}