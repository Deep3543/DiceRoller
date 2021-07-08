package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch Button View using Id into rollButton
        val rollButton: Button = findViewById(R.id.button2)
        // Create onClickListener to assign activity for the clicked button
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        // create dice object with 6 sides
        val dice = Dice(6)
        // roll the dice to generate random number
        val diceRoll = dice.roll()
        // fetch textView by Id to resultTextView
        val resultTextView: TextView = findViewById(R.id.textView2)
        // assign value of the text of the textView to rolled number by converting it
        // to string using toString
        resultTextView.text = diceRoll.toString()
    }

    // Dice class to implement Rolling Dice logic
    class Dice(private val numSides:Int){
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}