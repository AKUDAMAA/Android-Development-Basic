package com.example.belajarandoidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibCall: ImageButton? = null
    var ibNavigate: ImageButton? = null
    var ibShare: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)
        ibCall?.setOnClickListener {
//            parameter intent untuk telpon.Action_Dial
            val phoneNumber = "0823578"
            val phoneIntent = Intent(Intent.ACTION_DIAL,
                Uri.parse("tel: $phoneNumber"))
            startActivity(phoneIntent)
        }


        ibNavigate?.setOnClickListener {
            val mapIntent = Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:17.084541738180366, 120.90031418473468")
            )
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }



    }
}