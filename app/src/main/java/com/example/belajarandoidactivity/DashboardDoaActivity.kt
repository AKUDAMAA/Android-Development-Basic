package com.example.belajarandoidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandoidactivity.adapter.DoaAdapter
import com.example.belajarandoidactivity.adapter.LanguageAdapter
import com.example.belajarandoidactivity.model.Doa
import com.example.belajarandoidactivity.model.DoaHarian
import com.example.belajarandoidactivity.model.Language

class DashboardDoaActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)

        val rvDoa: RecyclerView =
            findViewById(R.id.rvDoa)

        val data = arrayListOf<Doa>(
            Doa("Dzikir dan Doa Sunnah Setelah Shalat", R.drawable.doa_harian2) ,
            Doa("Dzikir dan Doa Sunnah Setelah Shalat", R.drawable.doa_harian2) ,
            Doa("Dzikir dan Doa Sunnah Setelah Shalat", R.drawable.doa_harian2) ,
            Doa("Dzikir dan Doa Sunnah Setelah Shalat", R.drawable.doa_harian2) ,
            Doa("Dzikir dan Doa Sunnah Setelah Shalat", R.drawable.doa_harian2) ,
            Doa("Dzikir dan Doa Sunnah Setelah Shalat", R.drawable.doa_harian2)

        )
//        buat variabel untuk menampung data
        val adapter = DoaAdapter(data)
//          gunakan adapter kita pada recyler view
        rvDoa.adapter = adapter
        //        atur layout agar vertical
        rvDoa.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false)


        val cvSelengkapnya:CardView = findViewById(R.id.cvSelengkapnya)
        cvSelengkapnya.setOnClickListener{
            val intent = Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }







    }
}