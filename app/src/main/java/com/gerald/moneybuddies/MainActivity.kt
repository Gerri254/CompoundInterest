package com.gerald.moneybuddies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var Deposit :EditText = findViewById(R.id.Deposit)
        var Rate : EditText =findViewById(R.id.Rate)
        var Duration : EditText =findViewById(R.id.Time)
        var CI : Button =findViewById(R.id.Calculate)
        var Compo : TextView =findViewById(R.id.Ci)

        CI.text ="Your compound interest is......"

        CI.setOnClickListener{
            var amount = Deposit.text.toString().trim()
            var rate = Rate.text.toString().trim()
            var period = Duration.text.toString().trim()

           if (amount.isEmpty() ||  rate.isEmpty() || period.isEmpty()) {
               Toast.makeText(applicationContext,"Please follow instructions keenly",Toast.LENGTH_SHORT).show()
               return@setOnClickListener
           }


            var nAmount = amount.toDouble()
            var nRate = rate.toDouble()
            var nPeriod = period.toDouble()


            var sum = 1 + (nRate / 100)
            var power = Math.pow(sum,nPeriod)
            var tots = nAmount * power

            Compo.text = "The amount is $tots"








        }

    }
}