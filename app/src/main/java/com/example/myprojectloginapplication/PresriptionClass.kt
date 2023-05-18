package com.example.myprojectloginapplication


import android.widget.EditText

class PresriptionClass {


    var Tablets : String = ""
    var Dose : String = ""
    var Remarks : String = ""
    var PrescriptionId : String = ""

    constructor(Tablets: String, Dose: String, Remarks: String, PrescriptionId: String) {
        this.Tablets = Tablets
        this.Dose = Dose
        this.Remarks = Remarks
        this.PrescriptionId = PrescriptionId
    }
}