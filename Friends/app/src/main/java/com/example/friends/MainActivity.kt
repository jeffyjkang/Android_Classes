package com.example.friends

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var editName: EditText
    lateinit var editNumber: EditText
    lateinit var buttonCreate: Button
    lateinit var layoutContacts: LinearLayout

    private val contactsManager = ContactsManager()

    private val context = this as Context

    private fun updateUI() {
        val textView = TextView(context)
        layoutContacts.addView(textView)
        val newContact = contactsManager.contacts.last()
        textView.text = newContact.display
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.edit_name)
        editNumber = findViewById(R.id.edit_number)
        buttonCreate = findViewById(R.id.button_create)
        layoutContacts = findViewById(R.id.layout_contacts)

        buttonCreate.setOnClickListener() {
            contactsManager.createContact(editName.text.toString(), editNumber.text.toString())
            updateUI()
        }
    }
}