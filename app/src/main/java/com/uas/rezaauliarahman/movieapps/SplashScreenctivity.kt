package com.uas.rezaauliarahman.movieapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uas.rezaauliarahman.movieapps.MainActivity
import com.uas.tripandusatria.movieapps.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreenctivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screenctivity)

        supportActionBar?.hide()
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500L)
            startActivity(Intent(this@SplashScreenctivity, MainActivity::class.java))
            finish()
        }
    }
}