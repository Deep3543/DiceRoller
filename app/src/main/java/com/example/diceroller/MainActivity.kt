package com.example.diceroller

import android.os.Bundle
import android.widget.Button
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
        TODO("Not yet implemented")
    }

    // Dice class to implement Rolling Dice logic
    class Dice(val numSides:Int){
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}