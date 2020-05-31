package com.bilal.kutapsis.screen.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bilal.kutapsis.R;

public class KayitOlActivity extends AppCompatActivity implements View.OnClickListener {

    EditText kullaniciAdi, isim, soyAd, sifre, sifreTekrar;
    Button bttnOnay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kayit_ol);

        init();
    }

    private void init() {
        bttnOnay = findViewById(R.id.bttnKayitOlOnay);

        kullaniciAdi = findViewById(R.id.editKayitOlKullanici);
        isim = findViewById(R.id.editKayitOlAd);
        soyAd = findViewById(R.id.editKayitOlSoy);
        sifre = findViewById(R.id.editKayitOlSifre);
        sifreTekrar = findViewById(R.id.editKayitOlSifreTekrar);

        bttnOnay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(KayitOlActivity.this, GirisActivity.class));
    }
}
