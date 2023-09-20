package com.example.belajarandoidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvNumber:TextView = findViewById(R.id.tvNumber)
        val button:TextView = findViewById(R.id.buttonCount)
        val buttonDec:TextView = findViewById(R.id.buttonMinus)
        val buttonRes:TextView = findViewById(R.id.buttonReset)

        tvNumber.text = "0"
//        getText = mengambil text
        println(tvNumber.text)

        Log.d("number", "Hasilnya: ${tvNumber.text}")

        button.setOnClickListener{
            var countInteger : Int = tvNumber.text.toString().toInt()

            countInteger++
            tvNumber.text=countInteger.toString()
        }



        Log.d("number", "Hasilnya: ${tvNumber.text}")

        buttonDec.setOnClickListener{
            var decInteger : Int = tvNumber.text.toString().toInt()

            decInteger--
            tvNumber.text=decInteger.toString()
        }

        Log.d("number", "Hasilnya: ${tvNumber.text}")

        buttonRes.setOnClickListener{
            var resInteger : Int = tvNumber.text.toString().toInt()

            resInteger=0
            tvNumber.text=resInteger.toString()
        }




    }
}