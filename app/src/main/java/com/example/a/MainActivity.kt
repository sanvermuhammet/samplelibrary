package com.example.a


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.wawlabs.aisearch.Search


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = findViewById<TextView>(R.id.text)
        val map = hashMapOf("q" to "tv", "d" to "True", "f" to "True")
        Search.instance?.searchIo(this,params =  map) {
            Log.e("Muhammet response", it)
            text.text = it

        }
    }
}