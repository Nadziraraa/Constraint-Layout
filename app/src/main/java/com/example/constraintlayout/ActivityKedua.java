package com.example.constraintlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityKedua extends AppCompatActivity {
    //mendeklarasikan variabel dengan tipe data textview
    TextView txEmail, txPassword;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        //menghubungkan variabel txEmail dengan componen Textview pada layout
        txEmail = findViewById(R.id.tvEmail);

        //menghubungkan variabel txPassword dengan componen Textview pada layyout
        txPassword = findViewById(R.id.tVPassword);

        Bundle bundle = getIntent().getExtras();
        String email = bundle.getString( "b");
        String pass = bundle.getString( "b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}
