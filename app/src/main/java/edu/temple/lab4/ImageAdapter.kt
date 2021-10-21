package edu.temple.lab4


import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.annotations.NotNull

class ImageAdapter(_images: Array<Int>, _names: Array<String>) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    private val images = _images
    private val names = _names

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val itemLayoutView = LayoutInflater.from(parent.context)
            .inflate(R.layout.image_item, null)

        val viewHolder = ViewHolder(itemLayoutView)
        return viewHolder
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, @NotNull position: Int) {
        val image = images[position]
        viewHolder.imageView.setImageResource(image)
        viewHolder.imageView.setOnClickListener {
            MainActivity.activity.displayFragment.update(images[position], names[position])
        }
    }

    class ViewHolder(itemLayoutView: View) :
        RecyclerView.ViewHolder(itemLayoutView) {
        val imageView = itemLayoutView.findViewById<ImageView>(R.id.image)
    }

    override fun getItemCount(): Int {
        return images.size
    }
}
