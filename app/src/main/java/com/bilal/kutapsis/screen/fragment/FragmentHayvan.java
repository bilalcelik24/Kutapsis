package com.bilal.kutapsis.screen.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bilal.kutapsis.R;
import com.bilal.kutapsis.screen.activity.HayvanEkle;
import com.bilal.kutapsis.screen.activity.HayvanListele;

public class FragmentHayvan extends Fragment implements View.OnClickListener{

    Button bttnEkle, bttnListele;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.admin_hayvan, container, false);
        init(view);
        return view;
    }

    private void init(View view) {
        bttnEkle = view.findViewById(R.id.bttnAdminHayvanEkle);
        bttnListele = view.findViewById(R.id.bttnAdminHayvanListe);

        bttnEkle.setOnClickListener(this);
        bttnListele.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.bttnAdminHayvanEkle:
                startActivity(new Intent(getContext(), HayvanEkle.class));
                break;
            case R.id.bttnAdminHayvanListe:
                startActivity(new Intent(getContext(), HayvanListele.class));
                break;
        }
    }
}
