package com.example.myprojectloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class DoctorsDAshboardActivity : AppCompatActivity() {
    lateinit var DocPrescription: CardView
    lateinit var DocProfile: CardView
    lateinit var DocAppointments: CardView
    lateinit var DocLearning : CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctors_dashboard)

        DocPrescription = findViewById(R.id.Doctor_Prescription)
        DocProfile = findViewById(R.id.Doctor_Profile)
        DocAppointments = findViewById(R.id.Doctor_Appointments)
        DocLearning = findViewById(R.id.LearnMore)


        DocPrescription.setOnClickListener{


            var OpenPage = Intent(this@DoctorsDAshboardActivity,DoctorPrescriptionActivity
            ::class.java)
            startActivity(OpenPage)

        }


        DocProfile.setOnClickListener{



            var OpenPage = Intent(this@DoctorsDAshboardActivity,DoctorFormActivity
            ::class.java)
            startActivity(OpenPage)


        }


        DocAppointments.setOnClickListener{

            var OpenPage = Intent(this@DoctorsDAshboardActivity,BookingDocViewActivity
            ::class.java)
            startActivity(OpenPage)

        }

        DocLearning.setOnClickListener {



            var OpenPage = Intent(this@DoctorsDAshboardActivity,DocWebsiteActivity
            ::class.java)
            startActivity(OpenPage)



        }



    }
}