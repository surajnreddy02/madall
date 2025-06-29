package com.example.timepick
import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.myButton)

        myButton.setOnClickListener {
            val alertDialog = AlertDialog.Builder(this)
                .setTitle("Confirmation")
                .setMessage("Do you want to close the app?")
                .setPositiveButton("Yes") { _, _ ->
                    finish() // Closes the app
                }

                    .setNegativeButton("No") { _, _ ->
                    myButton.text = "Action Denied"
                        myButton.setTextColor(Color.parseColor("#FF0000")) // Red color using HEX code // Changes text color
                }
                .create()

            alertDialog.show()
        }
    }
}