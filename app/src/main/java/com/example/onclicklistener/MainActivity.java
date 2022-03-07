package com.example.onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edUser, edPassword;
    Button buttonOk;
    String nm, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edUser = (EditText) findViweById(R.id.editUsr);
        edPassword = (EditText) findViewById(R.id.editPwd);
        buttonOk = (Button) findViewById(R.id.OkBtn);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nama = edemail.getText().toString();
                password = edpasswrod.gettext().toString();

                String email = "admin";
                String pass = "123";

                if (nama.isEmpty() || password.siEmpty()) {

                    Toast t = Toast.makeText(getApplicationContext(),
                            "Email dan password wajib diisi!!!",
                            Toast.LENGTH_LONG);
                    t.show();

                } else {

                    if (name.equals(email) && password(pass)) {

                        Toast t = Toast.makeText(getApplicationContext(),
                                "Login sukses",
                                Toast.LENGTH_LONG);

                        t.show();

                        Bundle b = new Bundle();

                        b.putString("a", nama.trim());

                        b.putString("b", password.trim());

                        Intent i = new Intent(getApplicationContext(), ActivityHasil.class);

                        i.putExtras(b);

                        startActivity(i);

                    } else {

                        Toast t = Toast.makeText((getApplicationContext()),
                                "Login Gagal", Toast.LENGTH_LONG);

                        t.show();

                    }
                }
            }
        });
    }
}



               
   