package com.example.moneyconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Declaring Widget
    lateinit var titleTextView : TextView
    lateinit var resultEditView : TextView
    lateinit var usdInput : EditText
    lateinit var convertButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing Widget
        titleTextView = findViewById(R.id.textView)
        resultEditView = findViewById(R.id.idrEditText)
        usdInput = findViewById(R.id.usdEditText)
        convertButton = findViewById(R.id.button)

        convertButton.setOnClickListener{
            var enteredUSD : String = usdInput.text.toString()
            var enteredUSDDouble : Double = enteredUSD.toDouble()

            var idr = convertUsdToIdr(enteredUSDDouble)

            //display the convertion
            resultEditView.text = "Rp. " +  idr.toString()
        }
    }

    fun convertUsdToIdr(usd : Double): Double{
        return usd * 15544
    }
}