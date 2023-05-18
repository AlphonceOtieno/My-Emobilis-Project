package com.example.myprojectloginapplication

class DocClass {

    var edtDocName:String = ""
    var edtDocEmail:String = ""
    var edtDocPhoneNumber:String = ""
    var edtDocPassword:String = ""
    var Docid:String = ""

    constructor(
        edtDocName: String,
        edtDocEmail: String,
        edtDocPhoneNumber: String,
        edtDocPassword: String,
        Docid: String
    ) {
        this.edtDocName = edtDocName
        this.edtDocEmail = edtDocEmail
        this.edtDocPhoneNumber = edtDocPhoneNumber
        this.edtDocPassword = edtDocPassword
        this.Docid = Docid
    }
    constructor()
}