package com.example.ieltsclone.base

import android.app.Application
import android.content.Context
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel


open class AppViewModel:AndroidViewModel
{
    internal lateinit var toast: Toast
    constructor(application: Application):super(application)
    {
        initToast()

    }

    fun initToast()
    {
        toast = Toast.makeText(getContext(), "", Toast.LENGTH_LONG)
    }

    fun getContext():Context{
        return(getApplication() as Application).applicationContext
    }


}