package com.example.ieltsclone.navigator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass


class Navigator (val activity: AppCompatActivity, val container:Int) {

    fun openA(kClass: KClass<out AppCompatActivity>,bundle: Bundle? = Bundle())
    {
        val intent =Intent(activity,kClass.java)
        intent.putExtras(bundle?:Bundle())
        activity.startActivity(intent)
    }
}