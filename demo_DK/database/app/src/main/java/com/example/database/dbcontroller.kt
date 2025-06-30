package com.example.database

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.TextView

class dbcontroller(context: Context, name: String, factory: SQLiteDatabase.CursorFactory?, version: Int) :
    SQLiteOpenHelper(context, "std.db", factory, version) {
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE STUDENT(FNAME TEXT,LNAME TEXT);")
    }

    override fun onUpgrade(db: SQLiteDatabase, i: Int, i1: Int) {
        db.execSQL("DROP TABLE IF EXISTS STUDENT")
        onCreate(db)
    }
    fun insert(a: String, b: String) {
        val cv = ContentValues()
        cv.put("FNAME", a)
        cv.put("LNAME", b)
        this.writableDatabase.insert("STUDENT",null,cv)

    }

    fun delete(a: String) {
        this.writableDatabase.delete("STUDENT", "FNAME='$a'", null)
    }
    fun update(a: String, aa: String) {
        this.writableDatabase.execSQL("UPDATE STUDENT SET FNAME = '$aa' WHERE FNAME = '$a';")
    }
    fun list(tv: TextView?) {
        if (tv != null) {
            tv.text = ""
        }
        val c = this.readableDatabase.rawQuery("SELECT * FROM STUDENT", null)
        while (c.moveToNext()) {
            tv?.append(
                """${c.getString(0)} ${c.getString(1)}"""
            )
        }
    }
}
