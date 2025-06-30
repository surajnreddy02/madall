package com.example.canvas
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bitmap: Bitmap = Bitmap.createBitmap(700, 1000,
            Bitmap.Config.ARGB_8888)
        val canvas: Canvas = Canvas(bitmap)
        // rectangle positions
        val left = 100
        val top = 100
        val right = 600
        val bottom = 400
        // draw rectangle shape to canvas
        var shapeDrawable: ShapeDrawable = ShapeDrawable(RectShape())
        shapeDrawable.setBounds( left, top, right, bottom)
        shapeDrawable.paint.color = Color.parseColor("#009944")
        shapeDrawable.draw(canvas)
// draw oval shape to canvas
        shapeDrawable = ShapeDrawable(OvalShape())
        shapeDrawable.setBounds( 100, 500, 600, 800)
        shapeDrawable.paint.color = Color.parseColor("#009191")
        shapeDrawable.draw(canvas)
        val iv = findViewById<ImageView>(R.id.imageV)
// now bitmap holds the updated pixels
// set bitmap as background to ImageView
        iv.background = BitmapDrawable(getResources(), bitmap)
    }
}