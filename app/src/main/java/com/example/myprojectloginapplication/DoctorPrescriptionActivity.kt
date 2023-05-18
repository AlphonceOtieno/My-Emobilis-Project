package com.example.myprojectloginapplication

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class DoctorPrescriptionActivity : AppCompatActivity() {
    lateinit var TabletField : EditText
    lateinit var DoseField : EditText
    lateinit var RemarksField : EditText
    lateinit var ButtonSave : Button
    lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_prescription)

        TabletField = findViewById(R.id.TabletsET)
        DoseField = findViewById(R.id.DoseET)
        RemarksField = findViewById(R.id.RemarksET)
        ButtonSave = findViewById(R.id.BookingButton)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Saving")
        progressDialog.setMessage("Please wait...")




        //setting the onclick liseners
        ButtonSave.setOnClickListener {
            var Table = TabletField.text.toString().trim()
            var Dose = DoseField.text.toString().trim()
            var Remarks = RemarksField.text.toString().trim()
            var  PrescriptionId = System.currentTimeMillis().toString()

            //check if the doctor is empty fields
            if(Table.isEmpty()){
                TabletField.setError("please fill in this input field")
                TabletField.requestFocus()

            }
            else if (Dose.isEmpty()){
                DoseField.setError("please fill in this input field")
                DoseField.requestFocus()
            }

            else if (Remarks.isEmpty()){
                RemarksField.setError("please fill in this input field")
                RemarksField.requestFocus()
            }
            else{
                //proceed to save
                var DocPrescruption = PresriptionClass(Table,Dose,Remarks, PrescriptionId )
                ///create a reference to the FirebaseDatabase
                val Prescriptioref = Firebase.database.reference.child("Doctor's Prescription").push()
                progressDialog.show()
                Prescriptioref.setValue(DocPrescruption).addOnCompleteListener(){
                    progressDialog.dismiss()
                    if(it.isSuccessful){
                        Toast.makeText(this,"prescription  is  saved successful",
                            Toast.LENGTH_LONG).show()

                    }
                }
            }

        }





    }
}