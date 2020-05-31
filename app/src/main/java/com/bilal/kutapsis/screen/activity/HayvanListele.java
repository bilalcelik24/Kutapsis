package com.bilal.kutapsis.screen.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.bilal.kutapsis.helper.MyAdapter;
import com.bilal.kutapsis.R;
import com.bilal.kutapsis.model.Hayvan;

import java.util.ArrayList;

public class HayvanListele extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<Hayvan> itemList= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hayvan_listele);
        init();
        initFakeData();


    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView);

        MyAdapter myAdapter = new MyAdapter(getApplicationContext(),itemList);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initFakeData() {
        Hayvan hayvan=new Hayvan();
        hayvan.setHayvanIsmi("dana");
        hayvan.setHayvanFiyat("1000 Tl");
        itemList.add(hayvan);

        hayvan=new Hayvan();
        hayvan.setHayvanIsmi("dana");
        hayvan.setHayvanFiyat("1000 Tl");
        itemList.add(hayvan);

        hayvan=new Hayvan();
        hayvan.setHayvanIsmi("dana");
        hayvan.setHayvanFiyat("1000 Tl");
        itemList.add(hayvan);


        hayvan=new Hayvan();
        hayvan.setHayvanIsmi("dana");
        hayvan.setHayvanFiyat("1000 Tl");
        itemList.add(hayvan);



        hayvan=new Hayvan();
        hayvan.setHayvanIsmi("dana");
        hayvan.setHayvanFiyat("1000 Tl");
        itemList.add(hayvan);


        hayvan=new Hayvan();
        hayvan.setHayvanIsmi("dana");
        hayvan.setHayvanFiyat("1000 Tl");
        itemList.add(hayvan);
    }
}
