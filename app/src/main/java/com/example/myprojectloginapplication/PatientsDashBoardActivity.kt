package com.example.myprojectloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class PatientsDashBoardActivity : AppCompatActivity() {

    lateinit var SpecialityCardView : CardView
    lateinit var PrescriotionCardView : CardView
    lateinit var WebsiteCardView : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patients_dash_board)

        SpecialityCardView = findViewById(R.id.SpecialityCard)
        PrescriotionCardView = findViewById(R.id.ViewPrescription)
        WebsiteCardView = findViewById(R.id.WebsiteCard)


        SpecialityCardView.setOnClickListener {


            var OpenPage = Intent(this@PatientsDashBoardActivity,SpecialitySelectionScrollViewActivity
            ::class.java)
            startActivity(OpenPage)



        }

        PrescriotionCardView.setOnClickListener {
            var OpenPage = Intent(this@PatientsDashBoardActivity,PatientPrescriptionActivity
            ::class.java)
            startActivity(OpenPage)



        }
        WebsiteCardView.setOnClickListener {

            var tembea = Intent(this@PatientsDashBoardActivity,WebsiteAtivity::class.java)
            startActivity(tembea)

        }



    }
}