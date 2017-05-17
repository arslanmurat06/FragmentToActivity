package com.egitim.marstech.fragmentanlamak;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ColorFragment.OnColorChangeListener {
    ColorFragment colorFragment=new ColorFragment();
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout=(LinearLayout) findViewById(R.id.main_linearLayout);


        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .add(R.id.fragment_container,colorFragment)
                .commit();


    }

    @Override
    public void colorChanged(String colorName) {

        if(colorName.equals("RED")) {linearLayout.setBackgroundColor(Color.RED);}
        else if(colorName.equals("GREEN")) {linearLayout.setBackgroundColor(Color.GREEN);}
        else if (colorName.equals("BLUE")) {linearLayout.setBackgroundColor(Color.BLUE);}

    }
}
