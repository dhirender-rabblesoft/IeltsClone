package com.example.ieltsclone.base

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.appcompat.app.AppCompatActivity
import com.example.ieltsclone.listner.KotlinBaseListener
import com.example.ieltsclone.navigator.Navigator
import kotlin.reflect.KClass

open class KotlinBaseActivity(@IdRes private val container: Int = 0) : AppCompatActivity(),
    KotlinBaseListener {


    private val navigator: Navigator by lazy { Navigator(this, container) }
    override fun openA(kClass: KClass<out AppCompatActivity>, extras: Bundle?) {
        navigator.openA(kClass, extras)
    }

}