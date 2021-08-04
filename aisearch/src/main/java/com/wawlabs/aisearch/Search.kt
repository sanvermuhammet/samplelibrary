package com.wawlabs.aisearch

class Search {
    companion object {
        var search: Search? = null
        val instance: Search?
            get() = if (search != null) search else {
                Search()
            }
    }
    fun search(): String {
        return "Muhammet"
    }
}
