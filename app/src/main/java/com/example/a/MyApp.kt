package com.example.a
import android.app.Application
import com.wawlabs.aisearch.Search

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Search.instance?.init("https://teknosa.wawlabs.com/avx_wse?","Muhammet","Sanver")
    }
}