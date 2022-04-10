package com.example.ieltsclone

 import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.ieltsclone.base.KotlinBaseActivity
import com.example.ieltsclone.databinding.ActivityMainBinding
 import com.example.ieltsclone.ui.Home
 import com.example.ieltsclone.viewmodel.LoginSignViewModel

class MainActivity : KotlinBaseActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: LoginSignViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
             openA(Home::class)
        },1000)
    }
}