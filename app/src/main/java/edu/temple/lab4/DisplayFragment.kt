package edu.temple.lab4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

class DisplayFragment : Fragment(R.layout.activity_image_info) {
    private val model = IconViewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.activity_image_info, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val intent = requireActivity().intent

        val iconImageView = view?.findViewById<ImageView>(R.id.imageDisplayer)
        val labelView = view?.findViewById<TextView>(R.id.label)

//        labelView.text = intent.getStringExtra("label")
//
//        val image = intent.getIntExtra("image", 0)
//        iconImageView.setImageResource(image)

        val iconResourceObserver = Observer<Int> { newIconResource ->
            iconImageView?.setImageResource(newIconResource)
        }

        val labelObserver = Observer<String> { newLabel ->
            labelView?.text = newLabel
        }

        model.iconResource.observe(this, iconResourceObserver)
        model.label.observe(this, labelObserver)

//        this.actionBar?.title = getString(R.string.title_activity_image_info)
    }
}