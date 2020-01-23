package ge.edu.btu.oto3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_third.*

class ChoiceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        init()
    }

    private fun init() {
        moviesButton.setOnClickListener {
            val intent = Intent (this, MoviesActivity::class.java)
            startActivity(intent)
        }

        animationsButton.setOnClickListener {
            val intent = Intent (this, AnimationsActivity::class.java)
            startActivity(intent)
        }
    }
}

