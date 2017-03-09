package com.aasavari.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlaylistActivity extends AppCompatActivity {

    private Button mAlbumBtn;
    private Button mArtistBtn;
    private Button mGenreBtn;
    private Button mLibraryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        mAlbumBtn = (Button)findViewById(R.id.btn_album);
        mArtistBtn = (Button)findViewById(R.id.btn_artist);
        mGenreBtn = (Button)findViewById(R.id.btn_genre);
        mLibraryBtn = (Button)findViewById(R.id.btn_library);

        mAlbumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(PlaylistActivity.this, AlbumActivity.class);
                startActivity(playlistIntent);
            }
        });

        mArtistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        mGenreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(PlaylistActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        mLibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(PlaylistActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

    }
}
