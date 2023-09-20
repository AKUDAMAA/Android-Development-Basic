package com.example.belajarandoidactivity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class OpenCameraActivity : AppCompatActivity() {
    var ibCamera:ImageButton? = null
    var ivSample:ImageView? = null
    val pic_id = 999
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)
//        isi datanya dengan fungsi findVIewById
        ibCamera = findViewById(R.id.ibCamera)
        ivSample = findViewById(R.id.ivSample)

//        action
        ibCamera!!.setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }



    }
//    function kedua
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    if(requestCode == pic_id){
        val photo:Bitmap = data?.extras?.get("data") as Bitmap
        ivSample?.setImageBitmap(photo)
    }


    }



}

