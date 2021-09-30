package com.testifyqa.currencyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun convertCurrency(view: View) {
        Log.i("Info", "Button pressed")

        val editText: EditText = findViewById(R.id.editTextNumberDecimal)
        val amountInPounds = editText.text.toString()
        val amountInDollars = (amountInPounds.toDouble() * 1.3).toString()

        Log.i("Info", "Amount in dollars is: $amountInDollars")

        Toast.makeText(
            this,
            "£$amountInPounds in dollars is: $$amountInDollars",
            Toast.LENGTH_SHORT
        ).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}