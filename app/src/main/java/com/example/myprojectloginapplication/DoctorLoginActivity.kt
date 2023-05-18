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

class DoctorLoginActivity : AppCompatActivity() {

    lateinit var edtDocEmail: EditText
    lateinit var edtDocPassword: EditText
    lateinit var btnSignIn: Button
    lateinit var tvSignUp: TextView
    lateinit var progressDialog: ProgressDialog
    lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_login)

        edtDocEmail = findViewById(R.id.mEdtDocEmail)
        edtDocPassword = findViewById(R.id.mEdtDocPassword)
        btnSignIn = findViewById(R.id.BookingButton)
        tvSignUp = findViewById(R.id.mTvSignUp)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Loading")
        progressDialog.setMessage("Please wait...")
        mAuth = FirebaseAuth.getInstance()
        btnSignIn.setOnClickListener {
            var userEmail = edtDocEmail.text.toString().trim()
            var userPassword = edtDocPassword.text.toString().trim()
            if (userEmail.isEmpty() || userPassword.isEmpty()) {
                Toast.makeText(this, "Please fill all inputs", Toast.LENGTH_LONG).show()
            }else{
                var OpenPage = Intent(this@DoctorLoginActivity,DoctorsDAshboardActivity
                ::class.java)
                startActivity(OpenPage)


                Toast.makeText(this,"Doctor logged in successfully", Toast.LENGTH_LONG).show()

                    }
                }
            }
}





