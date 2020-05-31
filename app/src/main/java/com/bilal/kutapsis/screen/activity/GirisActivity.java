package com.bilal.kutapsis.screen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bilal.kutapsis.R;

public class GirisActivity extends AppCompatActivity implements View.OnClickListener {

    Button bttnGiris, bttnKayitOl;
    EditText kullaniciAdi, sifre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giris);

        init();
    }

    private void init() {
        bttnGiris = findViewById(R.id.bttnLoginGiris);
        bttnKayitOl = findViewById(R.id.bttnLoginKayitOl);

        kullaniciAdi = findViewById(R.id.editLoginKullanici);
        sifre = findViewById(R.id.editLoginSifre);

        bttnGiris.setOnClickListener(this);
        bttnKayitOl.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bttnLoginGiris:
                startActivity(new Intent(GirisActivity.this, MainActivity.class));
                break;
            case R.id.bttnLoginKayitOl:
                startActivity(new Intent(GirisActivity.this, KayitOlActivity.class));
                break;
        }
    }
}
