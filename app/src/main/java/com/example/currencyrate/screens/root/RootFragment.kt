package com.example.currencyrate.screens.root

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.currencyrate.R
import com.example.currencyrate.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_root.view.*


class RootFragment : Fragment() {

    private var ctx: Context ?= null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        ctx = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_root, container, false)
        view.viewPager.adapter = ViewPagerAdapter(ctx as FragmentActivity)
        view.tab_layout.tabIconTint = null
        TabLayoutMediator(view.tab_layout, view.viewPager) {
            tab, pos ->
            when (pos) {
                0 -> {
                    tab.setIcon(R.drawable.sell_icon)
                }
                1-> {
                    tab.setIcon(R.drawable.buy_icon)
                }
            }


        }.attach()
        return view
    }

}