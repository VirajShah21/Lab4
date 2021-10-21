package edu.temple.lab4

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectionFragment : Fragment() {
    companion object {
         fun newInstance(_icons: IntArray, _labels: Array<String>) = SelectionFragment().apply {
             arguments = Bundle().apply {
                 putIntArray("icons", _icons)
                 putStringArray("labels", _labels)
             }
         }
    }

    lateinit var icons: IntArray

    lateinit var labels: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initializeRecyclerView()
    }

    private fun initializeRecyclerView() {
        val recyclerView = requireView().findViewById<RecyclerView>(R.id.gallery)
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = ImageAdapter(
            iconsAsArrayOfInt(), labels
        )
    }

    private fun iconsAsArrayOfInt(): Array<Int> {
        val res = arrayOfNulls<Int>(icons.size)
        for (i in 1..icons.size) res[i] = icons[i]
        return res as Array<Int>
    }
}