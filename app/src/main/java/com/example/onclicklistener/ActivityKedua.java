package com.example.onclicklistener;

import android.os.Bundle;
import android.widget.TextView;

import andriod.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onPostCreate( Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        txEmail = findViewById(R.id.tvEmail);
        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString( "a");

        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);


    }
}
