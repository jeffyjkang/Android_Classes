package com.lambdaschool.android_classes

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    val contactsManager = ContactsManager()
    val context = this as Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_add.setOnClickListener {
            contactsManager.createContact(input_name.text.toString(), input_number.text.toString())
            layout_list.addView(getDefaultTextView(contactsManager.last.display))
        }
    }

    private fun getDefaultTextView(text: String): TextView {
        val view = TextView(context)
        view.text = text
        view.textSize = 28f
        return view
    }

}