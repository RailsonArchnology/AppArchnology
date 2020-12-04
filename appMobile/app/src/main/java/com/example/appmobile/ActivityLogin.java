package com.example.appmobile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLogin extends AppCompatActivity {

    private EditText user, userPassword;
    private Button buttonSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inicializarComponentes();

        //Action of the button
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = user.getText().toString();
                String password = userPassword.getText().toString();

                //Show the name and password typed with "TOAST"

                Toast.makeText(getApplicationContext(),"Olá" + name + "você digitou a senha" + password,Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void inicializarComponentes() {
        user = findViewById(R.id.editTextUserName);
        userPassword = findViewById(R.id.editTextPassword);
        buttonSignIn = findViewById(R.id.btnSignIn);
    }
}