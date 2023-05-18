package com.example.myprojectloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookinPatientActivity : AppCompatActivity() {
    lateinit var Booking : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookin_patient)

        Booking = findViewById(R.id.ButtonBooking)

        Booking.setOnClickListener {

            var OpenPage = Intent(this@BookinPatientActivity,PatientsDashBoardActivity
            ::class.java)
            startActivity(OpenPage)






        }

    }
}