package com.example.progressbar1

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var txtView: TextView
    private var i = 0
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progress_Bar)
        txtView = findViewById(R.id.text_view)
        val btn = findViewById<Button>(R.id.show_button)

        btn.setOnClickListener {
            progressBar.visibility = View.VISIBLE
            i = 0
            progressBar.progress = i

            Thread {
                while (i < 100) {
                    i += 1
                    handler.post {
                        progressBar.progress = i
                        txtView.text = "$i/${progressBar.max}"
                    }
                    try {
                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
                handler.post {
                    progressBar.visibility = View.INVISIBLE
                }
            }.start()
        }
    }
}
