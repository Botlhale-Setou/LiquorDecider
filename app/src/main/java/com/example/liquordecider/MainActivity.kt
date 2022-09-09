package com.example.liquordecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val liquorList = arrayListOf("Black Label", "Heineken", "Savannah", "Windhoek")
    val stringInitialText = "Click Decide to start!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liquorText.text = stringInitialText

        addLiquorButton.setOnClickListener {
            val newLiquor = addLiquorText.text.toString()
            if (newLiquor != ""){
                liquorList.add(newLiquor)
                addLiquorText.text.clear()
            }

        }

        decideButton.setOnClickListener {
            val randomSeed = Random()
            val randomLiquorIndex = randomSeed.nextInt(liquorList.count())
            liquorText.text = liquorList[randomLiquorIndex]
        }
    }
}