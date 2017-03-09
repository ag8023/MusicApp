package com.aasavari.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistActivity extends AppCompatActivity {

    private Button mAlbumBtn;
    private Button mGenreBtn;
    private Button mLibraryBtn;
    private Button mPlaylistBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        mAlbumBtn = (Button)findViewById(R.id.btn_album);
        mGenreBtn = (Button)findViewById(R.id.btn_genre);
        mLibraryBtn = (Button)findViewById(R.id.btn_library);
        mPlaylistBtn = (Button)findViewById(R.id.btn_playlist);

        mAlbumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(ArtistActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        mGenreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(ArtistActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        mLibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(ArtistActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        mPlaylistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(ArtistActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
