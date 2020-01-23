package ge.edu.btu.oto3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_filmebi.*

class MoviesActivity : AppCompatActivity() {
    private var answer = "5"
    private var countingQuestions = 1
    private var rightAns = 0
    private var wrongAns = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_filmebi)
        question1()
    }


    private fun question1() {
        answerA.setOnClickListener {
            checkAnswer(answerA)
            showAnswer(answerB)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerB)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerB)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion2()
            question2()

        }
    }

    private fun checkAnswer(button: Button) {
        if (button.text == answer) {
            Toast.makeText(applicationContext, "CORRECT!", Toast.LENGTH_SHORT).show()
            button.setTextColor(Color.GREEN)
            countingRightAnswers()
        } else {
            Toast.makeText(applicationContext, "WRONG!", Toast.LENGTH_SHORT).show()
            button.setTextColor(Color.RED)
            countingWrongAnswers()
        }
        answerA.isClickable = false
        answerB.isClickable = false
        answerC.isClickable = false
    }

    private fun showAnswer (button: Button) {
        button.setTextColor(Color.GREEN)
    }

    private fun changeTextQuestion2() {
        questionTextView.text ="შურისმაძიებლების ფილმში End game, ვინ გაწირავს თავს სამყაროს გადასარჩენად?"
        answerA.text = "რკინის კაცი"
        answerB.text = "თორი"
        answerC.text = "კაპიტანი ამერიკა"
    }

    private fun  question2() {
        answer = "რკინის კაცი"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerA)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerA)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerA)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion3()
            question3()
        }
    }


    private fun changeTextQuestion3() {
        questionTextView.text ="რა ერქვა ჰარი პოტერის ნათლიას?"
        answerA.text = "სევერუს სნეიპი"
        answerB.text = "ავგუსტ დამბულდორი"
        answerC.text = "სირიუს ბლექი"
    }

    private fun  question3() {
        answer = "სირიუს ბლექი"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerC)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerC)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerC)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion4()
            question4()
        }
    }

    private fun changeTextQuestion4() {
        questionTextView.text ="ბეჭდების მბრძანებელში რა ერქვა მას ვისაც ბეჭედი დროებით ჰქონდა ჩაბარებული?"
        answerA.text = "ფროდო"
        answerB.text = "სმაუგი"
        answerC.text = "გენდალფი"
    }

    private fun  question4() {
        answer = "ფროდო"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerA)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerA)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerA)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion5()
            question5()
        }
    }

    private fun changeTextQuestion5() {
        questionTextView.text ="რომელი მანქანის მოდელს იყენებს ყველაზე ხშირად პოლ ვოკერი ფილმში ფორსაჟი?"
        answerA.text = "ტოიტა სუპრას"
        answerB.text = "დოჯი ჩარჯერს"
        answerC.text = "ნისან სკაილაინს"
    }

    private fun  question5() {
        answer = "ნისან სკაილაინს"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerC)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerC)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerC)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion6()
            question6()
        }
    }

    private fun changeTextQuestion6() {
        questionTextView.text ="რა დაუტოვეს ჯეკ-ბეღურას როცა კუნძულზე მარტო დატოვეს?"
        answerA.text = "დამბაჩა ერთი ტყვიით"
        answerB.text = "საჭმელ-სასმელი"
        answerC.text = "ნავი"
    }

    private fun  question6() {
        answer = "დამბაჩა ერთი ტყვიით"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerA)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerA)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerA)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion7()
            question7()
        }
    }

    private fun changeTextQuestion7() {
        questionTextView.text ="ფილმში ავატარი,სად ვითარდება მოქმედება?"
        answerA.text = "სატურნზე"
        answerB.text = "პანდორაზე"
        answerC.text = "იუპიტერზე"
    }

    private fun  question7() {
        answer = "პანდორაზე"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerB)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerB)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerB)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion8()
            question8()
        }
    }

    private fun changeTextQuestion8() {
        questionTextView.text ="ფილმში ტიტანიკი,როგორ მოიგებს დიკაბრიო ბილეთებს?"
        answerA.text = "სანაძლეოში"
        answerB.text = "ჯოკერში"
        answerC.text = "პოკერში"
    }

    private fun  question8() {
        answer = "პოკერში"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerC)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerC)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerC)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion9()
            question9()
        }
    }

    private fun changeTextQuestion9() {
        questionTextView.text ="ფილმში თვითმკვლელთა რაზმი,ვის დაიჭერს ბეტმენი ლამბორჯინის მანქანაში?"
        answerA.text = "ჰარლი ქვინს"
        answerB.text = "დედშოტს"
        answerC.text = "ბუმერანგს"
    }

    private fun  question9() {
        answer = "ჰარლი ქვინს"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerA)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerA)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerA)
        }
        nextButton.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion10()
            question10()
        }
    }

    private fun changeTextQuestion10() {
        questionTextView.text ="რა ჰქვია ჯიმ ქერის პერსონაჟს რომელიც ცხოველების დეტექტივია?"
        answerA.text = "სტენლი იპკისი"
        answerB.text = "ლოიდ ქრისმასი "
        answerC.text = "ეის ვენტურა"
    }

    private fun  question10() {
        answer = "ეის ვენტურა"
        answerA.setOnClickListener{
            checkAnswer(answerA)
            showAnswer(answerC)
        }
        answerB.setOnClickListener {
            checkAnswer(answerB)
            showAnswer(answerC)
        }
        answerC.setOnClickListener {
            checkAnswer(answerC)
            showAnswer(answerC)
        }
        nextButton.setOnClickListener {
            val message1: String = RIGHTans.text.toString()
            val message2: String = WRONGans.text.toString()
            val intent = Intent(this, MoviesResultActivity::class.java)
            intent.putExtra("user_input", message1)
            intent.putExtra("user_input2", message2)
            startActivity(intent)
        }
    }




    private fun resetButtons() {
        answerA.isClickable = true
        answerB.isClickable = true
        answerC.isClickable = true
        answerA.setTextColor(Color.BLACK)
        answerB.setTextColor(Color.BLACK)
        answerC.setTextColor(Color.BLACK)
    }




    private fun countingRightAnswers() {
        rightAns += 1
        RIGHTans.text = "Right- " + rightAns
    }

    private fun countingWrongAnswers() {
        wrongAns += 1
        WRONGans.text = "Wrong- " + wrongAns
    }

    private fun countingQuestions() {
        countingQuestions += 1
        damtvleli.text = "" + countingQuestions + "/10"
    }



}
