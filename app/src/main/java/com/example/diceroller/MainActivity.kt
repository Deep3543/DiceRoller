package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
* This activity allows teh user to roll a dice and view the result
* on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Fetch Button View using Id into rollButton
        val rollButton: Button = findViewById(R.id.button2)
        // Create onClickListener to assign activity for the clicked button
        rollButton.setOnClickListener { rollDice() }
    }

    /*
    * Roll the dice and update the screen with the result.
    * */
    private fun rollDice() {
        // create dice object with 6 sides and rill it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = diceRoll.toString()
    }

    // Dice class to implement Rolling Dice logic
    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}