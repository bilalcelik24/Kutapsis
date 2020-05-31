package com.bilal.kutapsis.screen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bilal.kutapsis.R;

public class SatinAlAdresActivity extends AppCompatActivity implements View.OnClickListener{

    Button bttnKabul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.satin_al_adres);

        bttnKabul = findViewById(R.id.bttmSatinAlAdresKabul);
        bttnKabul.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(SatinAlAdresActivity.this, MainActivity.class));
    }
}
