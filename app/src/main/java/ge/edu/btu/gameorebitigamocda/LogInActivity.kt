package ge.edu.btu.oto3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class LogInActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        auth = FirebaseAuth.getInstance()
    }

    private fun init() {
        readData()
        signUpButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }

        logInButton.setOnClickListener {
            if (emailEditText.text.isNotEmpty() && passwordEditText.text.isNotEmpty()){
                signIn()
            }
        }
    }

        private fun signIn() {
            auth.signInWithEmailAndPassword(emailEditText.text.toString(), passwordEditText.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d("LOGIN", "signInWithEmail:success", task.exception)
                        Toast.makeText(baseContext, "Authentication success.",
                            Toast.LENGTH_SHORT). show()
                        saveData()
                        val user = auth.currentUser
                        val intent = Intent(this, ChoiceActivity::class.java)
                        intent.putExtra("emaili", emailEditText.text.toString())
                        intent.putExtra("paroli", passwordEditText.text.toString())
                        startActivity(intent)
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w("LOGIN", "signInWithEmail:failure", task.exception)
                        Toast.makeText(baseContext, "Authentication failed.",
                            Toast.LENGTH_SHORT).show()
                    }
                }
        }

    private fun saveData(){
        val sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
        val edit = sharedPreferences.edit()

        edit.putString("e-mail", emailEditText.text.toString())
        edit.putString("secret", passwordEditText.text.toString())

        edit.commit()
    }
    private fun readData() {
        val sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)

        emailEditText.setText(sharedPreferences.getString("e-mail", ""))
        passwordEditText.setText(sharedPreferences.getString("secret", ""))

    }



}


