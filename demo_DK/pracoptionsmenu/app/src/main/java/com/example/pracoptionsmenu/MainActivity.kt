package com.example.pracoptionsmenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//
//    override fun onCreateOptionsMenu(m: Menu?): Boolean {
//        menuInflater.inflate(R.menu.menu,m)
//        return super.onCreateOptionsMenu(m)
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        when(item.itemId){
//            R.id.about-> Toast.makeText(this,"about",Toast.LENGTH_SHORT).show()
//            R.id.settings-> Toast.makeText(this,"settings",Toast.LENGTH_SHORT).show()
//            R.id.exit-> Toast.makeText(this,"exit",Toast.LENGTH_SHORT).show()
//        }
//        return super.onOptionsItemSelected(item)
//    }
//}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.button)
        registerForContextMenu(btn)
        btn.setOnClickListener { v->openContextMenu(v) }
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.contextmenu,menu)

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.abc->Toast.makeText(this,"abc",Toast.LENGTH_SHORT).show()
            R.id.abc2->Toast.makeText(this,"abctwo",Toast.LENGTH_SHORT).show()
            R.id.abc3->Toast.makeText(this,"abc3",Toast.LENGTH_SHORT).show()
        }
        return super.onContextItemSelected(item)
    }



}


//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        val btn = findViewById<Button>(R.id.button)
//        btn.setOnClickListener {
//            val pop: PopupMenu = PopupMenu(this, btn)
//            pop.menuInflater.inflate(R.menu.menu, pop.menu)
//            pop.setOnMenuItemClickListener { item ->
//                when (item.itemId) {
//                    R.id.abc -> {
//                        Toast.makeText(this, "first", Toast.LENGTH_SHORT).show()
//                        true
//                    }
//                    R.id.abc2 -> {
//                        Toast.makeText(this, "second", Toast.LENGTH_SHORT).show()
//                        true
//                    }
//                    else -> false
//                }
//            }
//            pop.show()
//
//        }
//    }
//}