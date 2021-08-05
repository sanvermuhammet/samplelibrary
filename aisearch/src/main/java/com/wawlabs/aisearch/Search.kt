package com.wawlabs.aisearch

import android.content.Context
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class Search {
    companion object {
        var search: Search? = null
        val instance: Search?
            get() = if (search != null) search else Search()

    }


    fun searchIo(
        context: Context,
        d: String?=null,
        f: String?=null,
        q: String,
        listener: ((String) -> (Unit))
    ) {
        val queue = Volley.newRequestQueue(context)
        val url = "https://teknosa.wawlabs.com/avx_wse?d=$d&f=$f&q=$q"

// Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String> { response ->
                // Display the first 500 characters of the response string.
                listener.invoke(response)
            },
            Response.ErrorListener {
                listener.invoke(it.message ?: "")

            })
        queue.add(stringRequest)
    }
}
