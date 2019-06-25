package com.lambdaschool.android_classes

class ContactsManager(val contacts: MutableList<Contact> = mutableListOf()) {
    val last: Contact
        get() = contacts[contacts.size - 1]

    fun createContact(name: String, phone: String) {
        this.contacts.add(Contact(name, phone))
    }
}