package edu.temple.lab4

import android.os.Bundle
import android.text.Selection
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    companion object {
        lateinit var activity: MainActivity
    }

    lateinit var displayFragment: DisplayFragment
    lateinit var selectionFragment: SelectionFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         displayFragment = DisplayFragment()
         selectionFragment = SelectionFragment.newInstance(
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
        this.actionBar?.title = getString(R.string.main_title)
    }
}