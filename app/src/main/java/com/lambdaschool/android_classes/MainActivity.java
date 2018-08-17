package com.lambdaschool.android_classes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout layoutList;
    EditText inputName;
    EditText inputNumber;
    Button buttonAdd;

    ContactsManager contactsManager;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context         = this;
        contactsManager = new ContactsManager();
        layoutList      = findViewById(R.id.layout_list);
        inputName       = findViewById(R.id.input_name);
        inputNumber     = findViewById(R.id.input_number);
        buttonAdd       = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contactsManager.createContact(inputName.getText().toString(), inputNumber.getText().toString());
                layoutList.addView(getDefaultTextView(contactsManager.getLast().getDisplay()));
            }
        });
    }

    private TextView getDefaultTextView(String text) {
        TextView view = new TextView(context);
        view.setText(text);
        view.setTextSize(28);
        return view;
    }

}
