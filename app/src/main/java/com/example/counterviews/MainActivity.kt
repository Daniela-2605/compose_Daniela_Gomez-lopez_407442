package com.example.counterviews

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencias del layout
        val mainView = findViewById<ConstraintLayout>(R.id.main)
        val counterValue = mainView.findViewById<TextView>(R.id.counter_value)
        val plusButton = mainView.findViewById<Button>(R.id.plus)
        val minusButton = mainView.findViewById<Button>(R.id.minus)

        // Evento para incrementar
        plusButton.setOnClickListener {
            counter++
            counterValue.text = counter.toString()
        }

        // Evento para decrementar
        minusButton.setOnClickListener {
            if (counter > 0) {
                counter--
                counterValue.text = counter.toString()
            }
        }
    }
}
