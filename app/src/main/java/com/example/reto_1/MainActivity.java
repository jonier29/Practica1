package com.example.reto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCreateFarmer = (Button) findViewById(R.id.btnCreateFarmer);
        Button btnCreateRestaurant = (Button) findViewById(R.id.btnCreateRestaurant);
        Button btnSearch = (Button) findViewById(R.id.btnSearch);

        btnCreateFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCreateFarmer = new Intent(MainActivity.this, New_Farmer.class);
                startActivity(intentCreateFarmer);
            }
        });

        btnCreateRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCreateRestaurant = new Intent(MainActivity.this, New_Restaurant.class);
                startActivity(intentCreateRestaurant);
            }
        });

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSearch = new Intent(MainActivity.this, Select_Restaurant_Farmer.class);
                startActivity(intentSearch);
            }
        });

    }
}