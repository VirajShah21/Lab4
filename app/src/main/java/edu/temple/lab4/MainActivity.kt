package edu.temple.lab4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var activity: MainActivity
    }

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

        supportFragmentManager.beginTransaction().add(R.id.displayFragment, displayFragment)
            .add(R.id.selectionFragment, selectionFragment).commit()


        activity = this
    }
}