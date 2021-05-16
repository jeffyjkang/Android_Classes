package com.example.friends

//class Contact(name: String, number: String) {
//    val name: String = name
//    val number: String = number
//}

class Contact {
    private var name: String
    private var number: String

    constructor(name: String, number: String) {
        this.name = name
        this.number = number
    }

    var display: String = ""
        get() = "Name: $name, Number: $number"
}