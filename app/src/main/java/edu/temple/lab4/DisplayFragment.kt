package edu.temple.lab4

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class DisplayFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = requireActivity().intent

        requireView().findViewById<TextView>(R.id.label).text = intent.getStringExtra("label")
        val image = intent.getIntExtra("image", 0)

        requireView().findViewById<ImageView>(R.id.imageDisplayer).setImageResource(image)

//        this.actionBar?.title = getString(R.string.title_activity_image_info)
    }
}