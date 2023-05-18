package com.example.myprojectloginapplication



class User {
     var edtUserName:String = ""
     var edtUserEmail:String = ""
     var edtUserPhoneNumber:String = ""
     var edtUserPassword:String = ""
     var userId:String = ""
     var id:String = ""
    constructor(
        edtUserName: String,
        edtUserEmail: String,
        edtUserPhoneNumber: String,
        edtUserPassword: String,
        userId: String,
        id: String
    ) {
        this.edtUserName = edtUserName
        this.edtUserEmail = edtUserEmail
        this.edtUserPhoneNumber = edtUserPhoneNumber
        this.edtUserPassword = edtUserPassword
        this.userId = userId
        this.id = id
    }


    constructor()
}