package com.example.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by 186357 on 15.07.2018.
 */

public class Electronic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Using findViewByID for a view does not belong to SetContentView() layout and setting info text to it
        TextView listInfo = (TextView) findViewById(R.id.list_info);
        listInfo.setText(R.string.electronic_info);

        // Find the button for the pop category
        Button pop = (Button) findViewById(R.id.pop_button);

        // Set a click listener on that Button
        pop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the pop button is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link Pop}
                Intent popIntent = new Intent(getApplicationContext(), Pop.class);

                // Start the new activity
                startActivity(popIntent);
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
        songs.add(new Song(getString(R.string.bdp), getString(R.string.bytes), R.drawable.black_dog_production));
        songs.add(new Song(getString(R.string.aphex), getString(R.string.saw), R.drawable.aphex_twin));
        songs.add(new Song(getString(R.string.cabaret), getString(R.string.thec), R.drawable.cabaret_voltaire));
        songs.add(new Song(getString(R.string.gas), getString(R.string.nahuf), R.drawable.gas));
        songs.add(new Song(getString(R.string.underworld), getString(R.string.dubna), R.drawable.underworld));
        songs.add(new Song(getString(R.string.biosphere), getString(R.string.substrata), R.drawable.biosphere));
        songs.add(new Song(getString(R.string.moodymann), getString(R.string.black), R.drawable.moodymann));
        songs.add(new Song(getString(R.string.demdike), getString(R.string.tryptych), R.drawable.demdike_stare));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);
    }
}