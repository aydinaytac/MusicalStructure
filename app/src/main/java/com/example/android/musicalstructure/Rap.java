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

public class Rap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        //Using findViewByID for a view does not belong to SetContentView() layout and setting info text to it
        TextView listInfo = (TextView) findViewById(R.id.list_info);
        listInfo.setText(R.string.rap_info);

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
        songs.add(new Song(getString(R.string.snoop_dog), getString(R.string.sdd), R.drawable.snoop_dog));
        songs.add(new Song(getString(R.string.fifty_cent), getString(R.string.grodt), R.drawable.fifty_cent));
        songs.add(new Song(getString(R.string.dmx), getString(R.string.idahih), R.drawable.dmx));
        songs.add(new Song(getString(R.string.eminem), getString(R.string.relapse), R.drawable.eminem));
        songs.add(new Song(getString(R.string.drake), getString(R.string.zth), R.drawable.drake));
        songs.add(new Song(getString(R.string.jay_z), getString(R.string.tbp), R.drawable.jay_z));
        songs.add(new Song(getString(R.string.ice_cube), getString(R.string.lncl), R.drawable.ice_cube));
        songs.add(new Song(getString(R.string.lmfao), getString(R.string.sfpr), R.drawable.lmfao));


        // Create an {@link SongAdapter}, whose data source is a list of
        // {@link Song}s. The adapter knows how to create list item views for each item
        // in the list.
        SongAdapter songAdapter = new SongAdapter(this, songs);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.song_list);
        listView.setAdapter(songAdapter);
    }
}