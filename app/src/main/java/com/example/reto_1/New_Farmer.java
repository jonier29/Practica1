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

public class New_Farmer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_farmer);

        // Declaración de componentes de interfaz
        Spinner listTypeId = (Spinner) findViewById(R.id.listTypeId);
        Spinner listCity = (Spinner) findViewById(R.id.listCity);
        Button btnCreateNewFarmer = (Button) findViewById(R.id.btnCreateNewFarmer);
        Button btnCancelFarmer = (Button) findViewById(R.id.btnCancelFarmer);

        // Definición de items para lista de tipos de identificación
        ArrayList<String> TypeId = new ArrayList<>();
        TypeId.add("Cédula de Ciudadanía");
        TypeId.add("Tarjeta de Identidad");
        TypeId.add("Pasaporte");
        ArrayAdapter adapterSchedrule = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, TypeId);
        listTypeId.setAdapter(adapterSchedrule);

        // Definición de items para lista de generos
        ArrayList<String> gender = new ArrayList<>();
        gender.add("Másculino");
        gender.add("Femenino");
        gender.add("Otro");
        ArrayAdapter adapterGender = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, gender);
        listCity.setAdapter(adapterGender);

        // Evento click del boton crear nuevo Agricultor
        btnCreateNewFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(New_Farmer.this, "Farmer Registered", Toast.LENGTH_LONG).show();
            }
        });

        // Evento click del boton cancelar
        btnCancelFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCancelFarmer = new Intent(New_Farmer.this, MainActivity.class);
                startActivity(intentCancelFarmer);
            }
        });

    }
}