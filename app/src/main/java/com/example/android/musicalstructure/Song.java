package com.example.android.musicalstructure;

/**
 * Created by 186357 on 15.07.2018.
 */

/**
 * {@link Song} represents a single Android platform release.
 * Each object has 3 properties: artist name, song name, and image resource ID.
 */
public class Song {

    // Name of the artist (Tarkan, Sezen Aksu)
    private String mArtistName;

    // Name of the song (Kış Güneşi, Sarı Odalar)
    private String mSongName;

    // Drawable resource ID
    private int mImageResourceId;

    /*
    * Create a new Song object.
    *
    * @param vArtistName is the name of the Android version (e.g. Gingerbread)
    * @param vSongName is the corresponding Android version number (e.g. 2.3-2.7)
    * @param image is drawable reference ID that corresponds to the Android version
    * */
    public Song(String vArtistName, String vSongName, int imageResourceId)
    {
        mArtistName = vArtistName;
        mSongName = vSongName;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the name of the Artist
     */
    public String getArtistName() {
        return mArtistName;
    }

    /**
     * Get the name of the song
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }


}