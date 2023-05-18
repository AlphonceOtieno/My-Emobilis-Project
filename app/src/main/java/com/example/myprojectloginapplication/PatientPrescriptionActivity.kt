package com.example.myprojectloginapplication

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

class PatientPrescriptionActivity : AppCompatActivity() {

    lateinit var TabletField : TextInputEditText
    lateinit var DoseField : TextInputEditText
    lateinit var RemarksField : TextInputEditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_prescription)


        TabletField = findViewById(R.id.PatientTablets)
        DoseField = findViewById(R.id.PatientDose)
        RemarksField = findViewById(R.id.PatientRemarks)












    }
}