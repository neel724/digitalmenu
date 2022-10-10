package com.example.digitalmanu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button stat, sald, panja, roti, rice, chaina, south, mock, dessert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stat = findViewById(R.id.btnstater);
        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Stater.class);
                startActivity(intent);
            }
        });
        sald = findViewById(R.id.btnsal);
        sald.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Salad.class);
                startActivity(intent);
            }
        });
        panja = findViewById(R.id.btnpanja);
        panja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Panjabi.class);
                startActivity(intent);
            }
        });
        roti = findViewById(R.id.btnroti);
        roti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Roti.class);
                startActivity(intent);
            }
        });
        rice= findViewById(R.id.btnrice);
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Rice.class);
                startActivity(intent);
            }
        });
        chaina= findViewById(R.id.btnchi);
        chaina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Chinese.class);
                startActivity(intent);
            }
        });
        south=findViewById(R.id.btnsouth);
        south.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SouthIndian.class);
                startActivity(intent);
            }
        });
        mock=findViewById(R.id.btnmock);
        mock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Mocktail.class);
                startActivity(intent);
            }
        });
        dessert=findViewById(R.id.btndes);
        dessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Dessert.class);
                startActivity(intent);
            }
        });
    }
}