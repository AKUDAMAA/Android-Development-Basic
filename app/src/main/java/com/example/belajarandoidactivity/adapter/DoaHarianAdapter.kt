package com.example.belajarandoidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandoidactivity.R
import com.example.belajarandoidactivity.model.DoaHarian

class DoaHarianAdapter(val data: ArrayList<DoaHarian>)
    :RecyclerView.Adapter<DoaHarianAdapter.DoaHarianViewHolder>()

{
    class DoaHarianViewHolder (view: View)
        :RecyclerView.ViewHolder(view)

    {
        val tvJudulDoa:TextView = view.findViewById(R.id.tvJudulDoa)
        val tvDoaArab:TextView = view.findViewById(R.id.tvDoaArab)
        val tvDoalatin:TextView = view.findViewById(R.id.tvDoaLatin)
        val rlIsidoa:RelativeLayout = view.findViewById(R.id.rlisiDoa)
        val ibColapse:ImageButton = view.findViewById(R.id.ibCollapse)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian,parent,false)
        return DoaHarianViewHolder(view)

    }


    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item = data.get(position)
        holder.tvJudulDoa.text = item.judul
        holder.tvDoaArab.text = item.textArab
        holder.tvDoalatin.text = item.textLatin
//        disini kita bisa baut collapse sama seperti di latihan website
        holder.ibColapse.setOnClickListener {
            if(holder.rlIsidoa.visibility == View.GONE){
                holder.rlIsidoa.visibility = View.VISIBLE
                holder.ibColapse.setBackgroundResource(R.drawable.baseline_arrow_downward_24)
            }else{
                holder.rlIsidoa.visibility = View.GONE
                holder.ibColapse.setBackgroundResource(R.drawable.baseline_arrow_forward_24)

            }
        }

    }


    override fun getItemCount(): Int{
        return data.size
    }
}