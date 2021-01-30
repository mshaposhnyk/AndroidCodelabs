package com.example.constraintlayoutwlayouteditor_02_03

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun makeColored(view: View) {

        when ((1..10).random()) {/*
            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button -> findViewById<TextView>(R.id.box_three_text).setBackgroundResource(R.color.my_red)
            R.id.yellow_button ->  findViewById<TextView>(R.id.box_four_text).setBackgroundResource(R.color.my_yellow)
            R.id.green_button ->  findViewById<TextView>(R.id.box_five_text).setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)*/
            /*
            //Code challenge 1
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.one)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.two)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.three)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.four)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.five)
            else -> view.setBackgroundResource(R.drawable.ic_launcher_background)*/

            //Code challenge 2
            1 -> view.setBackgroundColor(Color.DKGRAY)
            2 -> view.setBackgroundColor(Color.GRAY)
            3 -> view.setBackgroundColor(Color.BLUE)
            4 -> view.setBackgroundColor(Color.MAGENTA)
            5 -> view.setBackgroundColor(Color.BLUE)
            6 -> view.setBackgroundResource(R.color.my_red)
            7 ->  view.setBackgroundResource(R.color.my_yellow)
            8 ->  view.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
/*
        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)*/

        //Code challeng 2
        val redTextView = findViewById<TextView>(R.id.red_textView)
        val greenTextView = findViewById<TextView>(R.id.green_textView)
        val yellowTextView = findViewById<TextView>(R.id.yellow_textView)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText,
                        boxFourText, boxFiveText, rootConstraintLayout,
                        redTextView, greenTextView, yellowTextView
                )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}