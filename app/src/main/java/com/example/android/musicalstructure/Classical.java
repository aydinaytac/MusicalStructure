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

public class Classical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Using findViewByID for a view does not belong to SetContentView() layout and setting info text to it
        TextView listInfo = (TextView) findViewById(R.id.list_info);
        listInfo.setText(R.string.classic_info);

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

        // Create an ArrayList of Song objects
        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(getString(R.string.chopin), getString(R.string.mocm), R.drawable.chopin));
        songs.add(new Song(getString(R.string.tchaikovsky), getString(R.string.mocm), R.drawable.tchaikovsky));
        songs.add(new Song(getString(R.string.bach), getString(R.string.mocm), R.drawable.bach));
        songs.add(new Song(getString(R.string.mozart), getString(R.string.mocm), R.drawable.mozart));
        songs.add(new Song(getString(R.string.beethoven), getString(R.string.mocm), R.drawable.beethoven));
        songs.add(new Song(getString(R.string.vivaldi), getString(R.string.mocm), R.drawable.vivaldi));
        songs.add(new Song(getString(R.string.schubert), getString(R.string.mocm), R.drawable.schubert));
        songs.add(new Song(getString(R.string.verdi), getString(R.string.mocm), R.drawable.verdi));

        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);
    }
}