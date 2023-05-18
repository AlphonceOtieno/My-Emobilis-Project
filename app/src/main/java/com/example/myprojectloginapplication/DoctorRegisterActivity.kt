package com.example.myprojectloginapplication

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class DoctorRegisterActivity : AppCompatActivity() {


    lateinit var edtDocName: EditText
    lateinit var edtDocEmail: EditText
    lateinit var edtDocPhoneNumber: EditText
    lateinit var edtDocPassword: EditText
    lateinit var edtDocPasswordConfirmation: EditText
    lateinit var tvSignIn: TextView
    lateinit var btnSignUp: Button
    lateinit var DocLog: Button
    lateinit var progressDialog: ProgressDialog
    lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_register)
        DocLog = findViewById(R.id.DocLog)
        tvSignIn = findViewById(R.id.Signin)
        edtDocEmail = findViewById(R.id.mEdtDocName)
        edtDocEmail = findViewById(R.id.mEdtDocEmail)
        edtDocPhoneNumber = findViewById(R.id.mEdtDocPhoneNumber)
        edtDocPassword = findViewById(R.id.mEdtDocPassword)
        edtDocPasswordConfirmation = findViewById(R.id.mEdtDocPasswordConfirmation)
        btnSignUp = findViewById(R.id.SignUpButton)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Loading")
        progressDialog.setMessage("Please wait...")
        mAuth = FirebaseAuth.getInstance()
        btnSignUp.setOnClickListener {
            var DocName = edtDocName.text.toString().trim()
            var DocEmail = edtDocEmail.text.toString().trim()
            var DocPhoneNumber = edtDocPhoneNumber.text.toString().trim()
            var DocPassword = edtDocPassword.text.toString().trim()
            var DocConfirmPassword = edtDocPasswordConfirmation.text.toString().trim()
            var Docid = System.currentTimeMillis().toString()
            if (DocName.isEmpty() || DocEmail.isEmpty() || DocPassword.isEmpty() || DocPhoneNumber.isEmpty() || DocConfirmPassword.isEmpty()){
                Toast.makeText(this,"Please fill all inputs", Toast.LENGTH_LONG).show()
            }else if (!DocPassword.equals(DocConfirmPassword)){
                Toast.makeText(this,"Passwords don't match", Toast.LENGTH_LONG).show()
            }else if (DocPassword.length < 6){
                Toast.makeText(this,"Password too short", Toast.LENGTH_LONG).show()
            }else{
                progressDialog.show()
                mAuth.createUserWithEmailAndPassword(DocEmail, DocPassword).addOnCompleteListener {
                    progressDialog.dismiss()
                    if (it.isSuccessful){
                        var ref = FirebaseDatabase.getInstance().getReference().child("Docclass/"+Docid)
                        var DocData = User(DocName,DocEmail,DocPhoneNumber,DocPassword,mAuth.currentUser!!.uid,Docid)
                        ref.setValue(DocData)
                        Toast.makeText(this,"Doctor registered successfully", Toast.LENGTH_LONG).show()
                        mAuth.signOut()
                        startActivity(Intent(this@DoctorRegisterActivity,DoctorLoginActivity::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"Doctor Registration failed", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        DocLog.setOnClickListener {
            startActivity(Intent(this@DoctorRegisterActivity,DoctorLoginActivity::class.java))
        }




    }
}