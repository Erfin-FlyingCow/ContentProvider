package com.example.contentprovidergetcontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView


class KontakAdapter(private val kontak: List<DataKontak>) :
    RecyclerView.Adapter<KontakAdapter.DataKontakViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataKontakViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycle_layout, parent, false)
        return DataKontakViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataKontakViewHolder, position: Int) {
        val kontak = kontak[position]
        holder.name.text = kontak.name
        holder.phone.text = kontak.phone
    }

    override fun getItemCount() = kontak.size


    class DataKontakViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name: TextView= itemView.findViewById(R.id.name)
        val phone: TextView= itemView.findViewById(R.id.phone)
    }

}