package com.example.timepicker

import android.annotation.SuppressLint
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.widget.DatePicker
import android.widget.TimePicker
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer=findViewById<TimePicker>(R.id.time1)
        timer.setOnTimeChangedListener{_,hour,minute->
            var am_pm=""
            val hour=if(hour<10) "0"+hour else hour
            val min=if(minute<10) "0"+minute else minute
            val msg="time is $hour:$min $am_pm"
            Toast.makeText(this@MainActivity,msg,Toast.LENGTH_SHORT).show();
        }
    }
}