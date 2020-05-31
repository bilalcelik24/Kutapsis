package com.bilal.kutapsis.screen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bilal.kutapsis.R;

public class HayvanEkle extends AppCompatActivity implements View.OnClickListener {

    Button bttnEkle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hayvan_ekle);

        bttnEkle = findViewById(R.id.bttnHayvanEkle);
        bttnEkle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(HayvanEkle.this, MainAdminActivity.class));
    }
}
