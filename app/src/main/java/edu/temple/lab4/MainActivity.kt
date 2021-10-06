package edu.temple.lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.gallery)
        recyclerView.layoutManager = GridLayoutManager(this, 3)
        recyclerView.adapter = ImageAdapter(
            arrayOf<Int>(
                R.drawable.amazon,
                R.drawable.assistant,
                R.drawable.canvas,
                R.drawable.chrome,
                R.drawable.contacts,
                R.drawable.facebook,
                R.drawable.netflix,
                R.drawable.mail,
                R.drawable.spotify,
                R.drawable.uber
            ),
            arrayOf(
                "Amazon Shopping",
                "Google Assistant",
                "Instructure Canvas",
                "Google Chrome",
                "Contacts",
                "Facebook",
                "Netflix",
                "EMail Client",
                "Spotify Music",
                "Uber Ride Share"
            )
        )

    }
}