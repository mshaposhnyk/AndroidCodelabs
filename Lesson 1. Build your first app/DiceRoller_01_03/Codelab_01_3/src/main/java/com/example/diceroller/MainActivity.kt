package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImageFirst: ImageView
    private lateinit var diceImageSecond: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImageFirst = findViewById(R.id.dice_image_first)
        diceImageSecond = findViewById(R.id.dice_image_second)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { diceImageFirst.setImageResource(getRandomDiceImage())
                                        diceImageSecond.setImageResource(getRandomDiceImage())}
        val clearButton = findViewById<Button>(R.id.clear_button)
        clearButton.setOnClickListener { diceImageFirst.setImageResource(R.drawable.empty_dice)
                                         diceImageSecond.setImageResource(R.drawable.empty_dice)}

    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }
}