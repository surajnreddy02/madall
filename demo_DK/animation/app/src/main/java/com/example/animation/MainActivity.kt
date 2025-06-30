package com.example.animation

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image=findViewById<TextView>(R.id.textView)
        findViewById<Button>(R.id.fade_in).setOnClickListener {
            val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            image.startAnimation(animationFadeIn)
        }
        findViewById<Button>(R.id.fade_out).setOnClickListener {
            val animationFadeOut = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            image.startAnimation(animationFadeOut)
        }
        findViewById<Button>(R.id.zoom_in).setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            image.startAnimation(animationZoomIn)
        }
        findViewById<Button>(R.id.zoom_out).setOnClickListener {
            val animationZoomOut = AnimationUtils.loadAnimation(this,
                R.anim.zoom_out)
            image.startAnimation(animationZoomOut)
        }
        findViewById<Button>(R.id.slide_up).setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this,
               R.anim.slide_up)
            image.startAnimation(animationZoomIn)
        }
        findViewById<Button>(R.id.slide_down).setOnClickListener {
            val animationZoomIn = AnimationUtils.loadAnimation(this,
                R.anim.slide_down)
            image.startAnimation(animationZoomIn)
        }
        val bounceAnimation = AnimationUtils.loadAnimation(this,
            R.anim.bounce)
        findViewById<Button>(R.id.bounce).setOnClickListener {
            image.startAnimation(bounceAnimation)
        }
        findViewById<Button>(R.id.rotate).setOnClickListener {
            image.animate().apply {
                duration=1000
                rotationXBy(360f)
            }.start()
        }
    }
}