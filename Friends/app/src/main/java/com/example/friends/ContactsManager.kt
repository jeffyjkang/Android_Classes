package com.example.friends

class ContactsManager(contacts: MutableList<Contact> = ArrayList()) {
    val contacts = contacts
    fun createContact(name: String, phone: String) {
        val newContact = Contact(name, phone)
        contacts.add(newContact)
    }
}