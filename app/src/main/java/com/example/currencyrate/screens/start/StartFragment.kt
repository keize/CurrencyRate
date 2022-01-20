package com.example.currencyrate.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.R
import kotlinx.android.synthetic.main.fragment_start.view.*


class StartFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: StartAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewmodel = ViewModelProvider(this).get(StartViewModel::class.java)
        var v = inflater.inflate(R.layout.fragment_start, container, false)
        recyclerView = v.startFragmetnRecyclerView
        adapter = StartAdapter()
        recyclerView.adapter = adapter
        viewmodel.getCashMoney()
        viewmodel.moneyList.observe(viewLifecycleOwner,{list ->
            list.body()?.let { adapter.listSet(it) }
        })

        return v

    }

}