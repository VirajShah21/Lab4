package edu.temple.lab4

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

class DisplayFragment : Fragment() {
    private val model = IconViewModel()


    fun update(icon: Int, label: String) {
        Log.i("DisplayFragment", "Updating with #" + icon + " (" + label + ")")
        model.iconResource.value = icon
        model.label.value = label
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView =
            inflater.inflate(edu.temple.lab4.R.layout.activity_image_info, container, false)

        val iconImageView = rootView.findViewById<ImageView>(R.id.imageDisplayer)
        val labelView = rootView.findViewById<TextView>(R.id.label)

        val iconResourceObserver = Observer<Int> { newIconResource ->
            Log.i("DisplayFragment", "Updating icon resource with " + newIconResource)
            iconImageView.setImageResource(newIconResource)
        }

        val labelObserver = Observer<String> { newLabel ->
            Log.i("DisplayFragment", "Updating label with " + newLabel)
            labelView.text = newLabel
        }

        model.iconResource.observe(viewLifecycleOwner, iconResourceObserver)
        model.label.observe(viewLifecycleOwner, labelObserver)

        return rootView
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


//        this.actionBar?.title = getString(R.string.title_activity_image_info)
    }
}