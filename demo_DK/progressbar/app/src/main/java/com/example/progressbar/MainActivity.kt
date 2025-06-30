package com.example.progressbar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    private var progressBar: ProgressBar? = null
    private var i = 0
    private var txtView: TextView? = null
    private val handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.progress)
// finding progressbar by its id
        progressBar = findViewById<ProgressBar>(R.id.progress_Bar) as ProgressBar
// finding textview by its id
        txtView = findViewById<TextView>(R.id.text_view)
// finding button by its id
        val btn = findViewById<Button>(R.id.show_button)// handling click on button
        btn.setOnClickListener {
// Before clicking the button the progress bar will invisible
// so we have to change the visibility of the progress bar to visible
// setting the progressbar visibility to visible
            progressBar!!.visibility = View.VISIBLE
            i = progressBar!!.progress
            Thread(Runnable {
// this loop will run until the value of i becomes 99
                while (i < 100) {
                    i += 1
// Update the progress bar and display the current value
                    handler.post(Runnable {
                        progressBar!!.progress = i
// setting current progress to the textview
                        txtView!!.text = i.toString() + "/" + progressBar!!.max
                    })
                    try {
                        Thread.sleep(100)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
// setting the visibility of the progressbar to invisible
// or you can use View.GONE instead of invisible
// View.GONE will remove the progressbar
                progressBar!!.visibility = View.INVISIBLE
            }).start()
        }
    }
}