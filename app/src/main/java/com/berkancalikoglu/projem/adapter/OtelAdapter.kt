package com.berkancalikoglu.projem.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.berkancalikoglu.projem.R
import com.berkancalikoglu.projem.databinding.ItemOtelBinding
import com.berkancalikoglu.projem.model.Otel

class OtelAdapter(val otelList: ArrayList<Otel>): RecyclerView.Adapter<OtelAdapter.OtelViewHolder>() {

    class OtelViewHolder(var view: ItemOtelBinding) : RecyclerView.ViewHolder(view.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OtelViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemOtelBinding>(inflater,R.layout.item_otel,parent,false)
        return OtelViewHolder(view)
    }

    override fun getItemCount(): Int {
        return otelList.size
    }

    override fun onBindViewHolder(holder: OtelViewHolder, position: Int) {

        holder.view.otel = otelList[position]
    }

    fun updateOtelList(newOtelList: List<Otel>) {
        otelList.clear()
        otelList.addAll(newOtelList)
        notifyDataSetChanged()
    }
}