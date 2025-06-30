package com.example.datepicker

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.DatePicker
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val datePicker=findViewById<DatePicker>(R.id.datePicker1)
        datePicker.setOnDateChangedListener{datePicker1,i,i2,i3->val i2=i2+1
        Toast.makeText(applicationContext,"date is: $i3/$i2/$i", Toast.LENGTH_SHORT).show();
        }
    }
}