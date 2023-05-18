package com.example.myprojectloginapplication

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class RegisterActivity : AppCompatActivity() {
    lateinit var DocRegiterLink : TextView
    lateinit var edtUserName:EditText
    lateinit var edtUserEmail:EditText
    lateinit var edtUserPhoneNumber:EditText
    lateinit var edtUserPassword:EditText
    lateinit var edtUserPasswordConfirmation:EditText
    lateinit var tvSignIn:TextView
    lateinit var log:Button


    lateinit var btnSignUp:Button
    lateinit var progressDialog:ProgressDialog
    lateinit var mAuth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        tvSignIn = findViewById(R.id.Signinlink)
        DocRegiterLink = findViewById(R.id.DoctorRegisterLink)
        edtUserName = findViewById(R.id.mEdtEmail)
        edtUserEmail = findViewById(R.id.mEdtUserEmail)
        edtUserPhoneNumber = findViewById(R.id.mEdtUserPhoneNumber)
        log = findViewById(R.id.Log)
        edtUserPassword = findViewById(R.id.mEdtPassword)
        edtUserPasswordConfirmation = findViewById(R.id.mEdtPasswordConfirmation)
        btnSignUp = findViewById(R.id.SignUpButton)
        progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Loading")
        progressDialog.setMessage("Please wait...")
        mAuth = FirebaseAuth.getInstance()
        btnSignUp.setOnClickListener {
            var userName = edtUserName.text.toString().trim()
            var userEmail = edtUserEmail.text.toString().trim()
            var userPhoneNumber = edtUserPhoneNumber.text.toString().trim()
            var userPassword = edtUserPassword.text.toString().trim()
            var userConfirmPassword = edtUserPasswordConfirmation.text.toString().trim()
            var id = System.currentTimeMillis().toString()
            if (userName.isEmpty() || userEmail.isEmpty() || userPhoneNumber.isEmpty() || userPassword.isEmpty() || userConfirmPassword.isEmpty()){
                Toast.makeText(this,"Please fill all inputs",Toast.LENGTH_LONG).show()
            }else if (!userPassword.equals(userConfirmPassword)){
                Toast.makeText(this,"Passwords don't match",Toast.LENGTH_LONG).show()
            }else if (userPassword.length < 6){
                Toast.makeText(this,"Password too short",Toast.LENGTH_LONG).show()
            }else{
                progressDialog.show()
                mAuth.createUserWithEmailAndPassword(userEmail, userPassword).addOnCompleteListener {
                    progressDialog.dismiss()
                    if (it.isSuccessful){
                        var ref = FirebaseDatabase.getInstance().getReference().child("Users/"+id)
                        var userData = User(userName,userEmail,userPhoneNumber,userPassword,mAuth.currentUser!!.uid,id)
                        ref.setValue(userData)
                        Toast.makeText(this,"User registered successfully",Toast.LENGTH_LONG).show()
                        mAuth.signOut()
                        startActivity(Intent(this@RegisterActivity,LoginActivity::class.java))
                        finish()
                    }else{
                        Toast.makeText(this,"Registration failed",Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        tvSignIn.setOnClickListener {
            startActivity(Intent(this@RegisterActivity,LoginActivity::class.java))
        }

        DocRegiterLink.setOnClickListener {
            startActivity(Intent(this@RegisterActivity,DoctorRegisterActivity::class.java))

        }
        log.setOnClickListener {


            var userName = edtUserName.text.toString().trim()
            var userEmail = edtUserEmail.text.toString().trim()
            var userPhoneNumber = edtUserPhoneNumber.text.toString().trim()
            var userPassword = edtUserPassword.text.toString().trim()
            var userConfirmPassword = edtUserPasswordConfirmation.text.toString().trim()
            var id = System.currentTimeMillis().toString()
            if (userName.isEmpty() || userEmail.isEmpty() || userPhoneNumber.isEmpty() || userPassword.isEmpty() || userConfirmPassword.isEmpty()){
                Toast.makeText(this,"Please fill all inputs",Toast.LENGTH_LONG).show()
            }else if (!userPassword.equals(userConfirmPassword)){
                Toast.makeText(this,"Passwords don't match",Toast.LENGTH_LONG).show()
            }else if (userPassword.length < 6){
                Toast.makeText(this,"Password too short",Toast.LENGTH_LONG).show()
            }else {
                progressDialog.show()


                Toast.makeText(this,"User registered successfully",Toast.LENGTH_LONG).show()


                var OpenPage = Intent(this@RegisterActivity,LoginActivity
                ::class.java)
                startActivity(OpenPage)



            }


        }
    }
}