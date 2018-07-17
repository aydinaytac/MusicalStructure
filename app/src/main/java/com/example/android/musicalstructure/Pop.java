package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 186357 on 15.07.2018.
 */

public class Pop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Using findViewByID for a view does not belong to SetContentView() layout and setting info text to it
        TextView listInfo = (TextView) findViewById(R.id.list_info);
        listInfo.setText(R.string.pop_info);

        // Find the button for the electronic category
        Button electronic = (Button) findViewById(R.id.electronic_button);

        // Set a click listener on that Button
        electronic.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the electronic button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Electronic}
                Intent electronicIntent = new Intent(getApplicationContext(), Electronic.class);

                // Start the new activity
                startActivity(electronicIntent);
            }
        });

        // Find the button for the rap category
        Button rap = (Button) findViewById(R.id.rap_button);

        // Set a click listener on that Button
        rap.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the rap button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Rap}
                Intent rapIntent = new Intent(getApplicationContext(), Rap.class);

                // Start the new activity
                startActivity(rapIntent);
            }
        });

        // Find the button for the classical category
        Button classical = (Button) findViewById(R.id.classical_button);

        // Set a click listener on that Button
        classical.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the classical button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Classical}
                Intent classicalIntent = new Intent(getApplicationContext(), Classical.class);

                // Start the new activity
                startActivity(classicalIntent);
            }
        });

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.tarkan), getString(R.string.aacayipsin), R.drawable.tarkan_aacayipsin));
        songs.add(new Song(getString(R.string.tarkan), getString(R.string.kuzukuzu), R.drawable.tarkan_kuzukuzu));
        songs.add(new Song(getString(R.string.sezen_aksu), getString(R.string.sarisinim), R.drawable.sezen_aksu_88));
        songs.add(new Song(getString(R.string.rihanna), getString(R.string.california_king_bed), R.drawable.rihanna_loud));
        songs.add(new Song(getString(R.string.katy_perry), getString(R.string.totga), R.drawable.katy_perry_the_one_that_got_away));
        songs.add(new Song(getString(R.string.katy_perry), getString(R.string.firework), R.drawable.katy_perry_firework));
        songs.add(new Song(getString(R.string.taylor_swift), getString(R.string.tdomg), R.drawable.taylor_swift));
        songs.add(new Song(getString(R.string.madonna), getString(R.string.lucky_star), R.drawable.madonna));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);

        }
}