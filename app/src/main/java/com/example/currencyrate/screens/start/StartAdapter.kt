package com.example.currencyrate.screens.start

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.R
import com.example.currencyrate.model.cash.CashModelItem
import kotlinx.android.synthetic.main.item_layout.view.*

class StartAdapter: RecyclerView.Adapter<StartAdapter.StartViewHolder>() {


    var listStart = emptyList<CashModelItem>()

    class StartViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StartViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return StartViewHolder(view)
    }

    override fun onBindViewHolder(holder: StartViewHolder, position: Int) {
        holder.itemView.item_name.text = listStart[position].ccy
        holder.itemView.item_buy.text = listStart[position].buy
        holder.itemView.item_sale.text = listStart[position].sale

    }

    override fun getItemCount(): Int {
        return listStart.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun listSet(list: List<CashModelItem>) {
        listStart = list
        notifyDataSetChanged()


    }
}