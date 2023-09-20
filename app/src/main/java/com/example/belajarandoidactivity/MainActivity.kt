package com.example.belajarandoidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val judulForm:TextView = findViewById(R.id.judulForm)
        val labelName:TextView = findViewById(R.id.labelNama)
        val labelClass:TextView = findViewById(R.id.labelClass)
        val labelKode:TextView = findViewById(R.id.labelKode)


        val inputNama:EditText = findViewById(R.id.inputNama)
        val inputKelazzz:EditText = findViewById(R.id.inputClass)
        val inputKode:EditText = findViewById(R.id.masukanKode)

        val tampilkanNama:TextView = findViewById(R.id.tampilkanNama)
        val tampilkanKelas:TextView = findViewById(R.id.tampilkanKelas)
        val tampilkanBuku:TextView = findViewById(R.id.tampilkanBuku)
        val btnSubmit:Button = findViewById(R.id.submitButton)


        btnSubmit.setOnClickListener {
            Toast.makeText(this,"Hello ${inputNama.text}",
                Toast.LENGTH_LONG).show()
            tampilkanNama.text=inputNama.text
            tampilkanKelas.text=inputKelazzz.text
            val kodeBuku = inputKode.text.toString()
            when (kodeBuku){
                "123" -> tampilkanBuku.text = "Judul Buku : Harry Potter"

            }



        }
    }
}