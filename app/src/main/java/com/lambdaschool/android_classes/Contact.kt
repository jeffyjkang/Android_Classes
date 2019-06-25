package com.lambdaschool.android_classes

class Contact(val name: String, val phone: String) {

    val display: String
        get() = "${this.name} - ${this.phone}"
}
