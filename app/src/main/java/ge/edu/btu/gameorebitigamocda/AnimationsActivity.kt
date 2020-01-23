package ge.edu.btu.oto3

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_animaciebi.*

class AnimationsActivity : AppCompatActivity() {
    private var answer = "1"
    private var countingQuestions = 1
    private var rightAns = 0
    private var wrongAns = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animaciebi)
        question1()
    }


    private fun question1() {
        A.setOnClickListener {
            checkAnswer(A)
            showAnswer(A)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(A)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(A)
        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion2()
            question2()
        }
    }

    private fun checkAnswer(button: Button) {
        if (button.text == answer) {
            Toast.makeText(getApplicationContext(), "CORRECT!", Toast.LENGTH_SHORT).show();
            button.setTextColor(Color.GREEN)
            countingRightAnswers()
        } else {
            Toast.makeText(getApplicationContext(), "WRONG!", Toast.LENGTH_SHORT).show();
            button.setTextColor(Color.RED)
            countingWrongAnswers()
        }
        A.isClickable = false
        B.isClickable = false
        C.isClickable = false
    }

    private fun showAnswer (button: Button) {
        button.setTextColor(Color.GREEN)
    }

    private fun changeTextQuestion2() {
        kitxva.text ="ანიმაციიდან სიმპსონები, რა ჰქვია მამა სიმპსონს?"
        A.text = "ბარტი"
        B.text = "ფლანდერსი"
        C.text = "ჰომერი"
    }

    private fun  question2() {
        answer = "ჰომერი"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(C)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(C)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(C)
        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion3()
            question3()
        }
    }

    private fun changeTextQuestion3() {
        kitxva.text ="რა ჰქვია ალადინის მაიმუნს?"
        A.text = "ჯაფარი"
        B.text = "აბუ"
        C.text = "იაგო"
    }

    private fun  question3() {
        answer = "აბუ"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(B)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(B)
        }
        C.setOnClickListener {
            checkAnswer(B)
            showAnswer(B)

        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion4()
            question4()
        }
    }

    private fun changeTextQuestion4() {
        kitxva.text ="ვინ არის შრეკის მეგობრის,მოლაპარაკე ვირის შეყვარებული?"
        A.text = "ცხენი"
        B.text = "ვირი"
        C.text = "დრაკონი"
    }

    private fun  question4() {
        answer = "დრაკონი"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(C)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(C)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(C)

        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion5()
            question5()
        }
    }

    private fun changeTextQuestion5() {
        kitxva.text ="ანიმაციიდან რიკი და მორტი,რა გვარისაა რიკი?"
        A.text = "სმიტი"
        B.text = "სანჩესი"
        C.text = "ჯონსონი"
    }

    private fun  question5() {
        answer = "სანჩესი"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(B)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(B)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(B)

        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion6()
            question6()
        }
    }

    private fun changeTextQuestion6() {
        kitxva.text ="დაასახელეთ ბაგს ბანის საუკეთესო მეგობარი?"
        A.text = "პორკი ფიგი"
        B.text = "ლოლა"
        C.text = "დაფი დაკი"
    }

    private fun  question6() {
        answer = "დაფი დაკი"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(C)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(C)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(C)

        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion7()
            question7()
        }
    }

    private fun changeTextQuestion7() {
        kitxva.text ="ვის გაჰყვება ალისა საოცრებათა ქვეყანაში?"
        A.text = "კურდღელს"
        B.text = "თაგვს"
        C.text = "კატას"
    }

    private fun  question7() {
        answer = "კურდღელს"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(A)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(A)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(A)

        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion8()
            question8()
        }
    }

    private fun changeTextQuestion8() {
        kitxva.text ="ანიმაციაში მეფე ლომი,რა ჯიშის ცხოველია ტიმონი?"
        A.text = "ლომი"
        B.text = "ტახი"
        C.text = "მანგუსტი"
    }

    private fun  question8() {
        answer = "მანგუსტი"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(C)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(C)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(C)

        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion9()
            question9()
        }
    }

    private fun changeTextQuestion9() {
        kitxva.text ="რის გამო დაკარგა კაპიტანმა კაუჭამ მარცხენა ხელი?"
        A.text = "ნიანგის"
        B.text = "ზვიგენის"
        C.text = "პიტერ პენის"
    }

    private fun  question9() {
        answer = "ნიანგის"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(A)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(A)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(A)

        }
        NEXT.setOnClickListener {
            resetButtons()
            countingQuestions()
            changeTextQuestion10()
            question10()
        }
    }

    private fun changeTextQuestion10() {
        kitxva.text ="რომელია სკუბი დუს ჯგუფში ყველაზე ჭკვიანი?"
        A.text = "დაფნი"
        B.text = "ველმა"
        C.text = "ფრედი"
    }

    private fun  question10() {
        answer = "ველმა"
        A.setOnClickListener{
            checkAnswer(A)
            showAnswer(B)
        }
        B.setOnClickListener {
            checkAnswer(B)
            showAnswer(B)
        }
        C.setOnClickListener {
            checkAnswer(C)
            showAnswer(B)

        }
        NEXT.setOnClickListener {
            val message1: String = RIGHT.text.toString()
            val message2: String = WRONG.text.toString()
            val intent = Intent(this, AnimationsResultActivity::class.java)
            intent.putExtra("user_input", message1)
            intent.putExtra("user_input2", message2)
            startActivity(intent)
        }
    }





    private fun resetButtons() {
        A.isClickable = true
        B.isClickable = true
        C.isClickable = true
        A.setTextColor(Color.BLACK)
        B.setTextColor(Color.BLACK)
        C.setTextColor(Color.BLACK)
    }




    private fun countingRightAnswers() {
        rightAns += 1
        RIGHT.text = "Right- " + rightAns
    }

    private fun countingWrongAnswers() {
        wrongAns += 1
        WRONG.text = "Wrong- " + wrongAns
    }

    private fun countingQuestions() {
        countingQuestions += 1
        counter.text = "" + countingQuestions + "/10"
    }


}
