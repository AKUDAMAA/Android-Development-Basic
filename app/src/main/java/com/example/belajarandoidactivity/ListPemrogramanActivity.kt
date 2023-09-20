package com.example.belajarandoidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandoidactivity.adapter.LanguageAdapter
import com.example.belajarandoidactivity.model.Language

class ListPemrogramanActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pemrograman)

        val rvBahasaPemrograman:RecyclerView =
            findViewById(R.id.rvBahasaPemrograman)

        val data = arrayListOf<Language>(
            Language("Golang", R.drawable.golang) ,
            Language("C++", R.drawable.siplesples) ,
            Language("Python", R.drawable.piton) ,
            Language("Golang", R.drawable.golang) ,
            Language("C++", R.drawable.siplesples) ,
            Language("Python", R.drawable.piton)

        )
//        buat variabel untuk menampung data
        val adapter = LanguageAdapter(data)
//          gunakan adapter kita pada recyler view
        rvBahasaPemrograman.adapter = adapter
        //        atur layout agar vertical
        rvBahasaPemrograman.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false)
    }
}