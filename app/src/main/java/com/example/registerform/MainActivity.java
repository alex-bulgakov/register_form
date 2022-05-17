package com.example.registerform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        EditText input_name = findViewById(R.id.input_name);
        EditText input_secondname = findViewById(R.id.input_secondname);
        EditText input_email = findViewById(R.id.input_email);

        EditText out_name = findViewById(R.id.input_name);
        EditText out_secondname = findViewById(R.id.input_secondname);
        EditText out_email = findViewById(R.id.input_email);

        out_name.setText("Name: " + input_name.getText().toString());
        out_secondname.setText("SecondName: " + input_secondname.getText().toString());
        out_email.setText("Email: " + input_email.getText().toString());
    }

}