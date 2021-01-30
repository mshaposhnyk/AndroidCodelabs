package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var resultText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultText = findViewById(R.id.result_text)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countUpButton: Button = findViewById(R.id.countUp_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { resultText.text = "0" }
        rollButton.setOnClickListener { rollDice() }
        countUpButton.setOnClickListener { countUp() }

    }

    private fun countUp() {
        val sc = Scanner(resultText.text.toString())
        var num = 1
        if(sc.hasNextInt()){
            num = sc.nextInt()
            if(num < 6){
                ++num
            }
        }
        resultText.text = num.toString()

    }

    private fun rollDice() {
       // Toast.makeText(this, "button clicked",
         //       Toast.LENGTH_SHORT).show() \
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }
}