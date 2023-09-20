package com.example.belajarandoidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

//        pnanggil object handler dari package OS
//        PostDelay untuk menjalankan action katika
//        waktu yang ditentukan selesai
        Handler().postDelayed({
            val intent = Intent(this,
                DashboardDoaActivity::class.java)
            startActivity(intent)
        },5000)

    }
}