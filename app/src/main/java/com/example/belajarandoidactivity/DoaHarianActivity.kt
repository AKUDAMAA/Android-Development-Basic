package com.example.belajarandoidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandoidactivity.adapter.DoaHarianAdapter
import com.example.belajarandoidactivity.model.DoaHarian


class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val rvDoaHarian: RecyclerView =
            findViewById(R.id.rvDoaHarian)


        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru")  ,
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru"),
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru")
        )
//        buat variabel untuk menampung data
        val adapter = DoaHarianAdapter(data)
//          gunakan adapter kita pada recyler view
        rvDoaHarian.adapter = adapter
        //        atur layout agar vertical
        rvDoaHarian.layoutManager =
            LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false)

    }
}