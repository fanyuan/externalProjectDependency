package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.extlib1.Lib1Util
import com.example.extlib2.Lib2Util

class MainActivity : AppCompatActivity() {
    companion object{
        const val TAG = "MainActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tv)
        tv.append("\n\n")
        tv.append(Lib1Util.getName())
        tv.append("\n\n")
        tv.append(Lib2Util.getName())

        Log.d(TAG,Lib1Util.getName())
        Log.d(TAG,Lib2Util.getName())
    }
}