package com.example.myprojectloginapplication

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import java.util.*

class DoctorFormActivity : AppCompatActivity() {

    private val PICK_IMAGE_REQUEST = 71
    private var filePath: Uri? = null
    private var firebaseStore: FirebaseStorage? = null
    private var storageReference: StorageReference? = null
    lateinit var ButtonUpdate : Button
    lateinit var DocName : TextInputEditText
    lateinit var DocQualifications : TextInputEditText
    lateinit var DocPhoneNo : TextInputEditText
    lateinit var DocEmailAddress : TextInputEditText
    lateinit var progressDialog: ProgressDialog





    private lateinit var PickImage: Button
    private lateinit var imageView: ImageView

    companion object {
        val IMAGE_REQUEST_CODE = 100

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_form)



        DocName = findViewById(R.id.NameField)
        DocQualifications = findViewById(R.id.QualificationsField)
        DocPhoneNo = findViewById(R.id.PhoneField)
        DocEmailAddress = findViewById(R.id.EmailField)

        ButtonUpdate = findViewById(R.id.UpdateButton)
        PickImage = findViewById(R.id.PickImageButton)
        imageView = findViewById(R.id.Doctor_Image)
        firebaseStore = FirebaseStorage.getInstance()
        storageReference = FirebaseStorage.getInstance().reference
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Loading")
        progressDialog.setMessage("Please wait...")
        ButtonUpdate.setOnClickListener { uploadImage() }


        PickImage.setOnClickListener {

            pickImageGallery()
        }

    }

    private fun uploadImage() {

        var Name = DocName.text.toString().trim()
        var Qualification =DocQualifications.text.toString().trim()
        var Phone = DocPhoneNo.text.toString().trim()
        var Email = DocEmailAddress.text.toString().trim()
        var DocId = System.currentTimeMillis().toString()
        if (Name.isEmpty()) {
            DocName.setError("Please fill this input")
            DocName.requestFocus()
        } else if (Qualification.isEmpty()) {
            DocQualifications.setError("Please fill this input")
            DocQualifications.requestFocus()

        } else if (Email.isEmpty()) {
            DocEmailAddress.setError("Please fill this input")
            DocEmailAddress.requestFocus()


    } else if (Phone.isEmpty()){

        DocPhoneNo.setError("Please fill this input")
        DocPhoneNo.requestFocus()
    }


        else {
            if (filePath != null) {

                val ref = storageReference?.child("Doctor Profile/" + UUID.randomUUID().toString())
                progressDialog.show()
                val uploadTask = ref?.putFile(filePath!!)!!.addOnCompleteListener {
                    progressDialog.dismiss()
                    if (it.isSuccessful) {
                        ref.downloadUrl.addOnSuccessListener {
                            var DocProfile = DoctorFormClass(Name, Qualification, it.toString(),Phone,Email,DocId)
                            var ref = FirebaseDatabase.getInstance().getReference().child("Doctor Profile/$DocId")
                            ref.setValue(DocProfile)
                            Toast.makeText(this, "Your Profie is submitted successfully", Toast.LENGTH_SHORT)
                                .show()
                        }
                    } else {
                        Toast.makeText(this, "profile submission failed", Toast.LENGTH_SHORT).show()
                    }
                }


            } else {
                Toast.makeText(this, "Please Upload an Image", Toast.LENGTH_SHORT).show()
            }


        }







    }

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, Admin_Speciality_Adition_Activity.IMAGE_REQUEST_CODE)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == Admin_Speciality_Adition_Activity.IMAGE_REQUEST_CODE && resultCode == RESULT_OK){

            imageView.setImageURI(data?.data)

        }
    }


}




