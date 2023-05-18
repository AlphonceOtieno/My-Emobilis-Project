package com.example.myprojectloginapplication

class DoctorFormClass {


    var DocName : String =  ""
    var DocQualifications : String =  ""
    var DocPhoneNo : String =  ""
    var DocEmailAddress : String =  ""
    var DocImage : String  = ""
    var DocId : String = ""

    constructor(
        DocName: String,
        DocQualifications: String,
        DocPhoneNo: String,
        DocEmailAddress: String,

        DocImage: String,
        DocId: String
    ) {
        this.DocName = DocName
        this.DocQualifications = DocQualifications
        this.DocPhoneNo = DocPhoneNo
        this.DocEmailAddress = DocEmailAddress
        this.DocImage = DocImage
        this.DocId = DocId
    }
}