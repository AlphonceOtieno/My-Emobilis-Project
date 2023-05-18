package com.example.myprojectloginapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class CommunicationFormatActivity : AppCompatActivity() {

    lateinit var CallFormat : CardView
    lateinit var ChatFormat : CardView
    lateinit var VideoFormat : CardView
    lateinit var NextButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_communication_format)

        CallFormat = findViewById(R.id.Call_card)
        VideoFormat = findViewById(R.id.Video_card)
        ChatFormat = findViewById(R.id.chat_card)
        NextButton = findViewById(R.id.Buttonnext)



        CallFormat.setOnClickListener {

            val phone = "+o719124371"

            val intent = Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,null))

            startActivity(intent)


        }

        ChatFormat.setOnClickListener {


            val uri: Uri = Uri.parse("smsto:0719124371")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("sms_body", "Hello There")
            startActivity(intent)

        }

        VideoFormat.setOnClickListener {

            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }

        NextButton.setOnClickListener {


            var OpenPage = Intent(this@CommunicationFormatActivity,BookinPatientActivity::class.java)
            startActivity(OpenPage)
        }



    }
}