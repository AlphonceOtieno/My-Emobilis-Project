package com.example.myprojectloginapplication

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class Admin_Speciality_Adition_Activity : AppCompatActivity() {

    lateinit var SpecialityName : EditText
    lateinit var progressDialog: ProgressDialog
    lateinit var BtnSave : Button


    private lateinit var button: Button
    private lateinit var imageView: ImageView


    companion object {
        val IMAGE_REQUEST_CODE = 100

    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin_speciality_adition)

        SpecialityName = findViewById(R.id.SpecialityType)
        BtnSave = findViewById(R.id.BookingButton)



        BtnSave.setOnClickListener {

            var SpecialName = SpecialityName.text.toString().trim()
            var SpecialId = System.currentTimeMillis().toString()

            //check if the user is subbmitting empty fields
            if(SpecialName.isEmpty()){
                SpecialityName.setError("please fill in this input field")
                SpecialityName.requestFocus()

            }

            if(SpecialId.isEmpty()){
                SpecialityName.setError("please fill in this input field")
                SpecialityName.requestFocus()

            }



            else{
                //proceed to save

                val Saving = SpecialityClass(SpecialName,SpecialId)
                ///create a reference to the FirebaseDatabase
                val Specialityref = Firebase.database.reference.child("Specialists").push()
                progressDialog.show()
                Specialityref.setValue(Saving).addOnCompleteListener(){
                    progressDialog.dismiss()
                    if(it.isSuccessful){
                        Toast.makeText(this," Speciality saving is successful",
                            Toast.LENGTH_LONG).show()

                    }
                }
            }


        }











        button = findViewById(R.id.PickButton)
        imageView = findViewById(R.id.SpecialityImage)
        button.setOnClickListener {

            pickImageGallery()
        }

    }

    private fun pickImageGallery() {
      val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE )

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

            if (requestCode == IMAGE_REQUEST_CODE && resultCode == RESULT_OK){

                imageView.setImageURI(data?.data)

            }
    }
}