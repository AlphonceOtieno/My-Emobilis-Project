package com.example.myprojectloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PatientPaymentActivity : AppCompatActivity() {
    lateinit var Payment : Button
    lateinit var NextPage : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_payment)

        Payment = findViewById(R.id.OpenToolkit)
        NextPage = findViewById(R.id.NextButton)


        Payment.setOnClickListener {

            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }

        }

        NextPage.setOnClickListener {



            var OpenPage = Intent(this@PatientPaymentActivity,CommunicationFormatActivity
            ::class.java)
            startActivity(OpenPage)

        }




    }
}