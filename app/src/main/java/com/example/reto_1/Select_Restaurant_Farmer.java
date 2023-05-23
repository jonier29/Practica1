package com.example.reto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;

public class Select_Restaurant_Farmer extends AppCompatActivity {
    public String userRestaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_restaurant_farmer);

        // Declaración de componentes de interfaz
        Spinner listRestaurants = (Spinner) findViewById(R.id.listRestaurants);
        Spinner listFarmers = (Spinner) findViewById(R.id.listFarmers);
        Button btnCreateRestaurant = (Button) findViewById(R.id.btnCreateRestaurant);
        Button btnCreateFarmer = (Button) findViewById(R.id.btnCreateFarmer);

        // Definición de items para lista de restaurantes
        ArrayList<String> restaurants = new ArrayList<>();
        restaurants.add("El buen pastor");
        restaurants.add("La mejor burger");
        restaurants.add("El perro más perro");
        ArrayAdapter adapterRestaurants = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, restaurants);
        listRestaurants.setAdapter(adapterRestaurants);

        // Definición de items para lista de agricultores
        ArrayList<String> farmers = new ArrayList<>();
        farmers.add("Don Jose");
        farmers.add("Señora Maria");
        farmers.add("Doña Teresa");
        ArrayAdapter adapterFarmers = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, farmers);
        listFarmers.setAdapter(adapterFarmers);

        // Evento click del boton para ir a la vista de nuevo restaurante
        btnCreateRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectRestaurant = new Intent(Select_Restaurant_Farmer.this, Home_Restaurant.class);
                intentSelectRestaurant.putExtra("user", listRestaurants.getSelectedItem().toString());
                startActivity(intentSelectRestaurant);
            }
        });

        // Evento click del boton para ir a la vista de nuevo agricultor
        btnCreateFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSelectFarmer = new Intent(Select_Restaurant_Farmer.this, Home_Agricultor.class);
                intentSelectFarmer.putExtra("user", listFarmers.getSelectedItem().toString());
                startActivity(intentSelectFarmer);
            }
        });
    }
}