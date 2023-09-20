package com.example.belajarandoidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class homeActivity2 : AppCompatActivity() {
    var buttonShare:MaterialButton?=null
    var buttonPindah:MaterialButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)


        buttonPindah = findViewById(R.id.buttonPindah)
        buttonShare = findViewById(R.id.buttonShare)


        buttonPindah!!.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }

        buttonShare!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT, "Saya Pesan Matcha Latte!")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent, "share to"))
        }


    }
}