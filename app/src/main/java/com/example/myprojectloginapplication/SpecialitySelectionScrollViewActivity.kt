package com.example.myprojectloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class SpecialitySelectionScrollViewActivity : AppCompatActivity() {


    lateinit var Nephrology : CardView
    lateinit var  Obgyn : CardView
    lateinit var Obsetrics : CardView
    lateinit var  Orthopedics : CardView
    lateinit var Paediatrics : CardView
    lateinit var  Vascular : CardView
    lateinit var  GeneralSurgery : CardView
    lateinit var  Dermertology : CardView
    lateinit var ButtonBack : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_speciality_selection_scroll_view)


        Nephrology = findViewById(R.id.nephrology)
        Obgyn = findViewById(R.id.obgyn)
        Obsetrics = findViewById(R.id.obsetrics)
        Orthopedics= findViewById(R.id.orthopaedics)
        Paediatrics = findViewById(R.id.paediatrics)
        Vascular = findViewById(R.id.vascular)
        GeneralSurgery = findViewById(R.id.general_surgery)
        Dermertology =  findViewById(R.id.dermertology)





        Nephrology.setOnClickListener {

            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,NephrologyDoctorsActivity
            ::class.java)
            startActivity(OpenPage)

        }
        Obgyn.setOnClickListener {



            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,ObsetricsDoctorsActivity
            ::class.java)
            startActivity(OpenPage)

        }
        Obsetrics.setOnClickListener {


            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,ObsetricsDoctorsActivity
            ::class.java)
            startActivity(OpenPage)

        }



        Paediatrics.setOnClickListener {


            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,PaediatricDoctorsActivity
            ::class.java)
            startActivity(OpenPage)

        }
        Vascular.setOnClickListener {


            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,VascularDoctorActivity
            ::class.java)
            startActivity(OpenPage)

        }
        /*GeneralSurgery.setOnClickListener {


            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,GeneralSurgeryActivity
            ::class.java)
            startActivity(OpenPage)

        }*/
        Dermertology.setOnClickListener {


            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,DermertologyDoctorsActivity
            ::class.java)
            startActivity(OpenPage)

        }


        Orthopedics.setOnClickListener {


            var OpenPage = Intent(this@SpecialitySelectionScrollViewActivity,OrthopedicDpoctorsActivity
            ::class.java)
            startActivity(OpenPage)

        }


    }


}
