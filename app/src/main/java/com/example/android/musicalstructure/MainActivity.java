package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the pop category
        LinearLayout pop = (LinearLayout) findViewById(R.id.pop);

        // Set a click listener on that View
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Pop}
                Intent popIntent = new Intent(MainActivity.this, Pop.class);

                // Start the new activity
                startActivity(popIntent);
            }
        });

        // Find the View that shows the electronic category
        LinearLayout electronic = (LinearLayout) findViewById(R.id.electronic);

        // Set a click listener on that View
        electronic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the electronic category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Electronic}
                Intent electronicIntent = new Intent(MainActivity.this, Electronic.class);

                // Start the new activity
                startActivity(electronicIntent);
            }
        });

        // Find the View that shows the hip-hop category
        LinearLayout rap = (LinearLayout) findViewById(R.id.rap);

        // Set a click listener on that View
        rap.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hip-hop category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Rap}
                Intent hiphopIntent = new Intent(MainActivity.this, Rap.class);

                // Start the new activity
                startActivity(hiphopIntent);
            }
        });

        // Find the View that shows the classic category
        LinearLayout classic = (LinearLayout) findViewById(R.id.classic);

        // Set a click listener on that View
        classic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classic category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Classical}
                Intent classicIntent = new Intent(MainActivity.this, Classical.class);

                // Start the new activity
                startActivity(classicIntent);
            }
        });

    }
}
