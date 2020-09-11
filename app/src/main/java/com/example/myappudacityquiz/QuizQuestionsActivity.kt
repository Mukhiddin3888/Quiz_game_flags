package com.example.myappudacityquiz

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.myappudacityquiz.R.id.*
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mcurrentPosition:Int = 1
    private var mQuestionsList: ArrayList<Questions>? = null
    private var mSelectedOptionPosition: Int  =0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

         mQuestionsList = Constants.getQuestions()
        setQuestion()
    }
    private fun setQuestion(){
        mcurrentPosition = 1
        val question = mQuestionsList!![mcurrentPosition -1]
        defaultOPtionsView()

        option_one.setOnClickListener(this)
        option_two.setOnClickListener(this)
        option_three.setOnClickListener(this)
        option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
        
        progress_bar.progress = mcurrentPosition
        progress_text.text ="$mcurrentPosition"+"/"+progress_bar.max

        questionId.text = question.question
        image.setImageResource(question.image)
        option_one.text = question.questionOne
        option_two.text = question.questionTwo
        option_three.text = question.questionThree
        option_four.text = question.questionFour
    }

    private fun optionSelectedView(tv:TextView, selectedOptionNumber:Int){

        defaultOPtionsView()

        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selected_options_border)
    }
   

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_one -> {
                optionSelectedView(option_one,1)
            }
            R.id.option_two ->{
                optionSelectedView(option_two,2)
            }
            R.id.option_three ->{
                optionSelectedView(option_three,3)
            }
            R.id.option_four ->{
                optionSelectedView(option_four,4)
            }
            R.id.btn_submit ->{

            }

        }
    }
}

 fun answerView(answer:Int, drawableView:Int){
    when(answer){
        1->{
            
        }
        2->{
        }

    }
}
private fun defaultOPtionsView(){
    val options = ArrayList<TextView>()

    options.add(0, option_one)
    options.add(1,option_two)
    options.add(2,option_three)
    options.add(3,option_four)

    for (i in options){
        i.setTextColor(Color.parseColor("#7A8089"))

        i.typeface = Typeface.DEFAULT
        i.background = ContextCompat.getDrawable(this,
            R.drawable.default_option_boder_bg)

    }

}