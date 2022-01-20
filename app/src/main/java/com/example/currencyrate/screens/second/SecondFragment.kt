package com.example.currencyrate.screens.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyrate.R
import com.example.currencyrate.screens.start.StartAdapter
import com.example.currencyrate.screens.start.StartViewModel
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_start.view.*

class SecondFragment : Fragment() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: SecondAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewmodel = ViewModelProvider(this).get(SecondViewModel::class.java)
        val v = inflater.inflate(R.layout.fragment_second, container, false)
        recyclerView = v.secondFragmetnRecyclerView
        adapter = SecondAdapter()
        recyclerView.adapter = adapter
        viewmodel.getCashlessMoney()
        viewmodel.moneyList.observe(viewLifecycleOwner,{list ->
            list.body()?.let { adapter.listSet(it) }
        })

        return v

    }

}