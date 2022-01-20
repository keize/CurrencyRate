package com.example.currencyrate.screens.second

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.R
import com.example.currencyrate.model.cash.CashModelItem
import com.example.currencyrate.model.cashless.CashlessModelItem
import kotlinx.android.synthetic.main.item_layout.view.*

class SecondAdapter: RecyclerView.Adapter<SecondAdapter.SecondViewHolder>() {


    var listSecond = emptyList<CashlessModelItem>()

    class SecondViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        holder.itemView.item_name.text = listSecond[position].ccy
        holder.itemView.item_buy.text = listSecond[position].buy
        holder.itemView.item_sale.text = listSecond[position].sale

    }

    override fun getItemCount(): Int {
        return listSecond.size

    }

    @SuppressLint("NotifyDataSetChanged")
    fun listSet(list: List<CashlessModelItem>) {
        listSecond = list
        notifyDataSetChanged()


    }
}
