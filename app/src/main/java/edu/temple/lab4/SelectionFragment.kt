package edu.temple.lab4

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


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
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =
            inflater.inflate(edu.temple.lab4.R.layout.fragment_selection_view, container, false)

        arguments?.let {
            icons = it.getIntArray("icons")!!
            labels = it.getStringArray("labels")!!
        }

        val recyclerView = rootView.findViewById<RecyclerView>(R.id.gallery)
        Log.w("Icons", Arrays.toString(iconsAsArrayOfInt()))
        val adapter = ImageAdapter(iconsAsArrayOfInt(), labels)

        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = adapter
//        adapter.notifyDataSetChanged()

        return rootView
    }


    private fun iconsAsArrayOfInt(): Array<Int> {
        val res = arrayOfNulls<Int>(icons.size)
        for (i in 0 until icons.size) res[i] = icons[i]
        return res as Array<Int>
    }
}