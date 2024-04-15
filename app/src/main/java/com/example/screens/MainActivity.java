package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activity2Button = findViewById(R.id.activity2);

        activity2Button.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                // Create Intent to start MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);


                intent.putExtra("number", 1);
                Bundle extras = getIntent().getExtras();



                startActivity(intent);

            }
        });
    }
}