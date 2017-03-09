package com.aasavari.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LibraryActivity extends AppCompatActivity {

    private Button mAlbumBtn;
    private Button mArtistBtn;
    private Button mGenreBtn;
    private Button mPlaylistBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        mAlbumBtn = (Button)findViewById(R.id.btn_album);
        mArtistBtn = (Button)findViewById(R.id.btn_artist);
        mGenreBtn = (Button)findViewById(R.id.btn_genre);
        mPlaylistBtn = (Button)findViewById(R.id.btn_playlist);

        mAlbumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(LibraryActivity.this, AlbumActivity.class);
                startActivity(libraryIntent);
            }
        });

        mArtistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(LibraryActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        mGenreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(LibraryActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        mPlaylistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(LibraryActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
