package com.example.reto_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Home_Agricultor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_agricultor);

        // Definición de items para lista de restaurantes
        TextView txtFarmer = (TextView) findViewById(R.id.txtFarmer);

        // Obtener el valor enviado desde la visa anterior
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("user");
            txtFarmer.setText(value);
        }
    }
}