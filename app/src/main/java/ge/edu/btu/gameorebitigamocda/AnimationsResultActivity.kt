package ge.edu.btu.oto3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_animaciis__shedegebi.*

class AnimationsResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animaciis__shedegebi)
        init()
    }
    private fun init(){
        val bundle: Bundle? = intent.extras
        var saboloo = bundle!!.getString("user_input")
        var saboloo2 = bundle.getString("user_input2")
        rightAnswer.text = saboloo.toString()
        wrongAnswer.text = saboloo2.toString()



    }
}
