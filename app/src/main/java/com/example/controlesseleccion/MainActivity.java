package com.example.controlesseleccion;

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


        Button btnEj1 = findViewById(R.id.btnEj1);

        btnEj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Ejercicio1.class);

                startActivity(intent);


            }
        });

        Button btnEj2 = findViewById(R.id.btnEj2);

        btnEj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Ejercicio2.class);

                startActivity(intent);


            }
        });

        Button btnEj3 = findViewById(R.id.btnEj3);

        btnEj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Ejercicio3.class);

                startActivity(intent);


            }
        });
    }





}
