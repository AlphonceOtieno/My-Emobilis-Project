package com.example.myprojectloginapplication

import android.Manifest
import android.content.Intent
import android.content.IntentSender
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.LocationRequest
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import com.example.myprojectloginapplication.databinding.ActivityMapsBinding
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.common.api.ResolvableApiException
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.LocationSettingsRequest
import com.google.android.gms.location.LocationSettingsStatusCodes
import java.util.*

class MapsActivity : AppCompatActivity() {

    lateinit var binding :ActivityMapsBinding
    lateinit var locationRequest :LocationRequest
    lateinit var fusedLocationProviderClient: FusedLocationProviderClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        binding.getLocation.setOnClickListener() {
            //step one is check self permission
            checkLocationPermission()
        }

    }

    private fun checkLocationPermission() {
        if(ActivityCompat.checkSelfPermission(this,android.Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ){
            //SHOW PERMSSION IS ALREADY GRANT
//            checkGPS()

        }

        else{
            //when permisssion is denied
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),100)



            
        }



    }

    private fun getUserLocation() {

        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        /*fusedLocationProviderClient.lastLocation.addOnCompleteListener { task->

            val location = task.getResult()

            if (location != null){
                try {
                    val geocoder = Geocoder(this, Locale.getDefault())

                    val  address = geocoder.getFromLocation(location.latitude,location.longitude,1)

                    // here we set address in textview
                    val address_line =  address[0].getAddressLine(0)
                    binding.locationText.setText(address_line)

                    val address_location = address[0].getAddressLine(0)

                    openLocation(address_location.toString())



                }catch (e: IDExcepttion){

                }

            }
        }*/







    }

    private fun openLocation(location: String) {
        // here we open this location in googe map

        //lets set on button click

        binding.locationText.setOnClickListener (){

            if(binding.locationText.text.isEmpty()){

                //when the location is noyt empty
                val uri = Uri.parse("geo,0?q=$location")
                val intent = Intent(Intent.ACTION_VIEW,uri)
                intent.setPackage("com.google.android.apps.maps")
                startActivity(intent)

            }

        }




    }

    /*private fun checkGPS() {
       locationRequest = LocationRequest.create()
        locationRequest.priority = LocationRequest.PRIORITY_HIGH_ACCURACY
        locationRequest.interval = 5000
        locationRequest.fastestinterval = 2000

        val builder = LocationSettingsRequest.Builder()
            .addAllLocationRequests()

        builder.setAlwaysShow(true)

        val result = LocationServices.getSettingsClient(
            this.applicationContext
        )
            .checkLocationSettings(builder.build())

        result.addOnCompleteListener {task->

        try{

            //when the GPS is on
            val response = task.getResult(
                ApiException::class.java

            )


            getUserLocation()

        }catch (e : ApiException){
                //when the gPS is off

            e.printStackTrace()
            when(e.statusCode){
            LocationSettingsStatusCodes.RESOLUTION_REQUIRED -> try {

                //here we send the request for enable the GPS
                val resolveApiException = e as ResolvableApiException
                resolveApiException.startResolutionForResult(this,200)


            }catch (sendIntentException : IntentSender.SendIntentException){

                LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE ->{
                    //when the setting is ynavailable
                }





            }

            }
        }



        }
    }*/
}