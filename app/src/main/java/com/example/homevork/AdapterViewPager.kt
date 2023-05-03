package com.example.homevork

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AdapterViewPager(fm :FragmentActivity) : FragmentStateAdapter(fm){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ButonsFragment()
            1 -> ChekFragment()
            2 -> HistoryFragment()
            else -> ButonsFragment()
        }
    }
}