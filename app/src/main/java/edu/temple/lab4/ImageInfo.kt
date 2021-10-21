package edu.temple.lab4

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import edu.temple.lab4.databinding.FragmentDisplayBinding

class ImageInfo : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: FragmentDisplayBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FragmentDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)


        findViewById<TextView>(R.id.label).text = intent.getStringExtra("label")
        val image = intent.getIntExtra("image", 0)

        findViewById<ImageView>(R.id.imageDisplayer).setImageResource(image)
    }
}


