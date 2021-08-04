package com.example.a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.wawlabs.aisearch.Search


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, Search.instance?.searchIo(), Toast.LENGTH_LONG)
        Log.e("Muhammet", Search.instance?.searchIo() ?: "gelmedi")
    }
}