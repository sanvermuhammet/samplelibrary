package com.example.a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wawlabs.aisearch.Search


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Search.search
    }
}