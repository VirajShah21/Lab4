package edu.temple.lab4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var displayFragment = DisplayFragment()
        var selectionFragment = SelectionFragment.newInstance(
            intArrayOf(
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
            ), resources.getStringArray(R.array.icons)
        )

//        findViewById<FragmentContainerView>(R.id.displayFragment).


    }
}