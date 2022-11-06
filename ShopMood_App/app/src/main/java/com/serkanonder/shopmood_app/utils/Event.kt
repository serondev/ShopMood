package com.serkanonder.shopmood_app.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.net.NetworkInfo
import android.os.Build
import javax.inject.Inject

open class Event<out T>(private val content: T) {


    private var isContentHandled = false

    fun getContentIfNotHandled(): T? {
        return if (isContentHandled) null else {
            isContentHandled = true
            content
        }
    }

    /**
     * Returns the content, even if it's already been handled.
     */
    fun peekContent(): T = content
}