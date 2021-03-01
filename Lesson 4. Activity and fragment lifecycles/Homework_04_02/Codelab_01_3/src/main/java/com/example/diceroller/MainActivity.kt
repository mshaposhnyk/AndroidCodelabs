package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

const val FIRST_DICE = "FIRST_DICE"
const val SECOND_DICE = "SECOND_DICE"
class MainActivity : AppCompatActivity() {

    private lateinit var diceImageFirst: ImageView
    private lateinit var diceImageSecond: ImageView

    private var firstDiceRes = 0
    private var secondDiceRes = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState != null){
            firstDiceRes = savedInstanceState.getInt(FIRST_DICE)
            secondDiceRes = savedInstanceState.getInt(SECOND_DICE)
        }
        setContentView(R.layout.activity_main)
        diceImageFirst = findViewById(R.id.dice_image_first)
        diceImageSecond = findViewById(R.id.dice_image_second)

        diceImageFirst.setImageResource(if(firstDiceRes!=0) firstDiceRes else R.drawable.empty_dice)
        diceImageSecond.setImageResource(if(secondDiceRes!=0) secondDiceRes else R.drawable.empty_dice)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            firstDiceRes = getRandomDiceImage()
            secondDiceRes = getRandomDiceImage()
            diceImageFirst.setImageResource(firstDiceRes)
            diceImageSecond.setImageResource(secondDiceRes)}
        val clearButton = findViewById<Button>(R.id.clear_button)
        clearButton.setOnClickListener { diceImageFirst.setImageResource(R.drawable.empty_dice)
                                         diceImageSecond.setImageResource(R.drawable.empty_dice)}

    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()
        return getPictureID(randomInt)
    }

    private fun getPictureID(value: Int): Int {
        return when (value) {
            0 -> R.drawable.empty_dice
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(FIRST_DICE,firstDiceRes)
        outState.putInt(SECOND_DICE,secondDiceRes)
    }
}