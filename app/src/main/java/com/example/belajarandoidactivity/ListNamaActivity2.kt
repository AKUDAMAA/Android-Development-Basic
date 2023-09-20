    package com.example.belajarandoidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

    class ListNamaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama2)
//        defin array adapter
        val arrayAdapater:ArrayAdapter<*>
        val users = arrayOf(
            "Asep Rocky", "Jim Milton", "Dreamy Bull XXX","Micah Bell"
        )

        var mListView: ListView = findViewById(R.id.userlist)

        arrayAdapater = ArrayAdapter(this,
                                    android.R.layout.simple_list_item_1,
                                    users)

        mListView.adapter = arrayAdapater
    }
}