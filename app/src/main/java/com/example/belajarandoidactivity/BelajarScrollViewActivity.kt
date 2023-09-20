package com.example.belajarandoidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollViewActivity : AppCompatActivity() {
    var ivBackground: ImageView? = null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view)


        ivBackground = findViewById(R.id.ivBackground)
        Glide.with(this)
            .load(R.drawable.i_can_fix_u)
            .transform(BlurTransformation(25,3))
            .into(ivBackground!!)

    }
}