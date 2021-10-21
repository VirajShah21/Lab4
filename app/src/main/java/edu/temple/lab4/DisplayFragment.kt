package edu.temple.lab4

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer

class DisplayFragment : Fragment() {
    private val model = IconViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val intent = requireActivity().intent

        val iconImageView = requireView().findViewById<ImageView>(R.id.imageDisplayer)
        val labelView = requireView().findViewById<TextView>(R.id.label)

//        labelView.text = intent.getStringExtra("label")
//
//        val image = intent.getIntExtra("image", 0)
//        iconImageView.setImageResource(image)

        val iconResourceObserver = Observer<Int> { newIconResource ->
            iconImageView.setImageResource(newIconResource)
        }

        val labelObserver = Observer<String> { newLabel ->
            labelView.text = newLabel
        }

        model.iconResource.observe(this, iconResourceObserver)
        model.label.observe(this, labelObserver)

//        this.actionBar?.title = getString(R.string.title_activity_image_info)
    }
}