package com.example.screens;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Bundle extras = getIntent().getExtras();
        int number = 500;

        // Log the number value (optional)
        Log.d("500", "Number: " + number + ", " + 500);


        TextView textView = findViewById(R.id.textView);


        textView.setText(String.valueOf(number));
    }

    }
