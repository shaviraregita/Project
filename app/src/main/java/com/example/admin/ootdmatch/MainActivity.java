package com.example.admin.ootdmatch;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // untuk membuat agar fragment hanya dibuat sekali saja
        if (savedInstanceState == null){
            BodyPartsFragments bodyFragment;
            //mengambil fragment Bodies
            bodyFragment = new BodyPartsFragments();
            bodyFragment.setmImageIds(ImageAssets.getBodies());
            bodyFragment.setmListIndex(0);
            //inisiasi adapter untuk mengaktifkan fragment Head
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.bodies_container, bodyFragment).commit();

            //mengambil fragment Legs
            bodyFragment = new BodyPartsFragments();
            bodyFragment.setmImageIds(ImageAssets.getLegs());
            bodyFragment.setmListIndex(0);
            fragmentManager.beginTransaction().add(R.id.legs_container, bodyFragment).commit();
        }
    }
}
