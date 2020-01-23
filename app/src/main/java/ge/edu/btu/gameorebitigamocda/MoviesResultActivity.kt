package ge.edu.btu.oto3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_filmebi.*
import kotlinx.android.synthetic.main.activity_filmebis__shedegebi.*

class MoviesResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filmebis__shedegebi)
        val bundle: Bundle? = intent.extras
        var message1 = bundle!!.getString("user_input")
        var message2 = bundle.getString("user_input2")
        rightAnswers.text = message1.toString()
        wrongAnswers.text = message2.toString()
    }
}
