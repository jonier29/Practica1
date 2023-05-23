package com.example.reto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class New_Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_restaurant);

        // Declaración de componentes de interfaz
        Spinner listSchedules = (Spinner) findViewById(R.id.listSchedules);
        Button btnCreateNewRestaurant = (Button) findViewById(R.id.btnCreateNewRestaurant);
        Button btnCancelRestaurant = (Button) findViewById(R.id.btnCancelRestaurant);

        // Definición de items para lista de horarios
        ArrayList<String> Schedrule = new ArrayList<>();
        Schedrule.add("Diurno");
        Schedrule.add("Nocturno");
        Schedrule.add("Doble jornada");
        ArrayAdapter adapterSchedrule = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, Schedrule);
        listSchedules.setAdapter(adapterSchedrule);

        // Evento click del boton crear nuevo restaurante
        btnCreateNewRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(New_Restaurant.this, "Restaurant registered", Toast.LENGTH_LONG).show();
            }
        });

        // Evento click del boton cancelar
        btnCancelRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCancelRestaurant = new Intent(New_Restaurant.this, MainActivity.class);
                startActivity(intentCancelRestaurant);
            }
        });
    }
}