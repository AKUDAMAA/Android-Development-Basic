package com.example.belajarandoidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandoidactivity.R
import com.example.belajarandoidactivity.model.Doa

class DoaAdapter(val data:ArrayList<Doa>)
    : RecyclerView.Adapter<DoaAdapter.DoaViewHolder>()
{
    class DoaViewHolder(view: View) :
        RecyclerView.ViewHolder(view) {
        val tvDoa: TextView = view.findViewById(R.id.tvDoa)
        val ivDoa: ImageView = view.findViewById(R.id.ivDoa)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_doa, parent, false)
        return DoaViewHolder(view)
    }

    override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {

        val item = data.get(position)
        holder.tvDoa.text = item.name
        holder.ivDoa.setImageResource(item.image)
    }

    override fun getItemCount(): Int = data.size

}