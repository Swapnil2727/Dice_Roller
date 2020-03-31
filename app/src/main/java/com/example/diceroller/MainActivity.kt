package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {


    lateinit var dice_image:ImageView //in simple words we are promising compilier we'll not leave this null.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val roll_button: Button = findViewById(R.id.roll_button) // Binding view using traditional style

        roll_button.setOnClickListener(View.OnClickListener {

            diceRoll()
        })
        dice_image = findViewById(R.id.dice_image)
    }

    private fun diceRoll() {
        val random_num = Random.nextInt(6) + 1 //Select random number from 1 to 6

       val drawableResource=  when(random_num)
        {

            1->R.drawable.dice_2
            2->R.drawable.dice_3
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        dice_image.setImageResource(drawableResource)

    }

}
