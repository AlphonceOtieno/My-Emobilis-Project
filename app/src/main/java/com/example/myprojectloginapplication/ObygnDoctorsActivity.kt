package com.example.myprojectloginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ObygnDoctorsActivity : AppCompatActivity() {
    lateinit var FirstCardView : CardView
    lateinit var SecondCardView : CardView
    lateinit var ThirdCardView : CardView
    lateinit var FourthCardView : CardView
    lateinit var FifthCardView : CardView
    lateinit var  SeeMoreLink : TextView
    lateinit var SeeMoreLink2 : TextView
    lateinit var SeeMoreLink3 : TextView
    lateinit var SeeMoreLink4 : TextView
    lateinit var SeeMoreLink5 : TextView
    lateinit var BackButton : FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nephrology_doctors)

        FirstCardView = findViewById(R.id.Card_View_1)
        SecondCardView = findViewById(R.id.Card_View_2)
        ThirdCardView = findViewById(R.id.Card_View_3)
        FourthCardView = findViewById(R.id.Card_View_4)
        FifthCardView = findViewById(R.id.Card_View_5)
        SeeMoreLink = findViewById(R.id.ViewMore)
        SeeMoreLink2 = findViewById(R.id.ViewMore2)
        SeeMoreLink3 = findViewById(R.id.ViewMore3)
        SeeMoreLink4 = findViewById(R.id.ViewMore4)
        SeeMoreLink5 = findViewById(R.id.ViewMore5)
        BackButton = findViewById(R.id.FloatingActionButton)

        FirstCardView.setOnClickListener {



            var OpenPage = Intent(this@ObygnDoctorsActivity,PatientPaymentActivity
            ::class.java)
            startActivity(OpenPage)


        }


        BackButton.setOnClickListener{


            var OpenPage = Intent(this@ObygnDoctorsActivity,SpecialitySelectionScrollViewActivity
            ::class.java)
            startActivity(OpenPage)




        }


        SecondCardView.setOnClickListener {


            var OpenPage = Intent(this@ObygnDoctorsActivity,PatientPaymentActivity
            ::class.java)
            startActivity(OpenPage)


        }


        ThirdCardView.setOnClickListener {


            var OpenPage = Intent(this@ObygnDoctorsActivity,PatientPaymentActivity
            ::class.java)
            startActivity(OpenPage)


        }


        FourthCardView.setOnClickListener {


            var OpenPage = Intent(this@ObygnDoctorsActivity,PatientPaymentActivity
            ::class.java)
            startActivity(OpenPage)


        }


        FifthCardView.setOnClickListener {


            var OpenPage = Intent(this@ObygnDoctorsActivity,PatientPaymentActivity
            ::class.java)
            startActivity(OpenPage)


        }

        SeeMoreLink.setOnClickListener {

            var OpenPage = Intent(this@ObygnDoctorsActivity,DoctorDetailsActivity
            ::class.java)
            startActivity(OpenPage)

        }

        SeeMoreLink2.setOnClickListener {

            var OpenPage = Intent(this@ObygnDoctorsActivity,DoctorDetailsActivity
            ::class.java)
            startActivity(OpenPage)

        }

        SeeMoreLink3.setOnClickListener {

            var OpenPage = Intent(this@ObygnDoctorsActivity,DoctorDetailsActivity
            ::class.java)
            startActivity(OpenPage)

        }

        SeeMoreLink4.setOnClickListener {

            var OpenPage = Intent(this@ObygnDoctorsActivity,DoctorDetailsActivity
            ::class.java)
            startActivity(OpenPage)

        }

        SeeMoreLink5.setOnClickListener {

            var OpenPage = Intent(this@ObygnDoctorsActivity,DoctorDetailsActivity
            ::class.java)
            startActivity(OpenPage)

        }





    }
}