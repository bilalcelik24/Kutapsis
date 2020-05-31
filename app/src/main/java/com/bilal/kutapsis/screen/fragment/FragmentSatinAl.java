package com.bilal.kutapsis.screen.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.bilal.kutapsis.R;
import com.bilal.kutapsis.screen.activity.SatinAlAdresActivity;


public class FragmentSatinAl extends Fragment implements View.OnClickListener {

    Button bttnDevam;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_satin_al, container, false);
        init(view);
        Toast.makeText(getContext(), "sdsdsd", Toast.LENGTH_SHORT).show();
        return view;
    }

    private void init(View view) {
        bttnDevam = view.findViewById(R.id.bttnSatinAlKabul);
        bttnDevam.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(getContext(), SatinAlAdresActivity.class));
    }
}
