package com.example.reto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home_Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_restaurant);

        // Definición de items para lista de restaurantes
        TextView txtRestaurant = (TextView) findViewById(R.id.txtFarmer);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("user");
            txtRestaurant.setText(value);
        }

    }
}