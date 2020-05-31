package com.bilal.kutapsis.screen.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.bilal.kutapsis.R;
import com.bilal.kutapsis.screen.fragment.FragmentHayvan;
import com.bilal.kutapsis.screen.fragment.FragmentSatinAl;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class MainAdminActivity extends AppCompatActivity {
    BottomNavigationViewEx bottomNavigationView;
    FrameLayout content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_admin);

        content=findViewById(R.id.Activity_Admin_Main_Frame);
        bottomNavigationView = findViewById(R.id.Activity_Admin_Main_Bottom);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        bottomNavigationView.setSelectedItemId(R.id.nav_hayvan_ekle);


        loadFragment(new FragmentSatinAl());
    }

    private BottomNavigationViewEx.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationViewEx.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.nav_listele:
                    loadFragment(new FragmentHayvan());
                    return true;
                case R.id.nav_hayvan_ekle:
                    loadFragment(new FragmentSatinAl());
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.Activity_Admin_Main_Frame,fragment);
        fragmentTransaction.addToBackStack(fragment.toString());
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();
    }
}
