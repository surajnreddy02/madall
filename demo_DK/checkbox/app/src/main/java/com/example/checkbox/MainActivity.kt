package com.example.checkbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var pizza:CheckBox
    lateinit var coffee:CheckBox
    lateinit var burger:CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        pizza=findViewById(R.id.pizza)
        coffee=findViewById(R.id.coffee)
        burger=findViewById(R.id.burger)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int=0
            val result=StringBuilder()
            result.append("selected items")
            if(pizza.isChecked){
                result.append("pizza 100rs  ")
                totalAmount+=100
            }
            if (coffee.isChecked){
                result.append("coffee 50rs  ")
                totalAmount+=50
            }
            if (burger.isChecked){
                result.append("burger 70rs  ")
                totalAmount+=70
            }
            result.append("Total"+totalAmount+"rs")
            Toast.makeText(applicationContext,result.toString(),Toast.LENGTH_SHORT).show()

        }
    }
}