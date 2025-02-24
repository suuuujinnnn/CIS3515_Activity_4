package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        val numberArray = (5..100 step 5).toList()

        spinner.adapter = TextSizeAdapter(this, numberArray)

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedSize = numberArray[position]
                displayTextView.text = "Selected: $selectedSize sp"
                displayTextView.textSize = selectedSize.toFloat()
            }

            override fun onNothingSelected(parent: AdapterView<*>) {}
        }
    }
}
