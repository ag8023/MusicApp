package com.aasavari.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    private Button mAlbumBtn;
    private Button mArtistBtn;
    private Button mGenreBtn;
    private Button mLibraryBtn;
    private Button mPlaylistBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        mArtistBtn = (Button)findViewById(R.id.btn_artist);
        mGenreBtn = (Button)findViewById(R.id.btn_genre);
        mLibraryBtn = (Button)findViewById(R.id.btn_library);
        mPlaylistBtn = (Button)findViewById(R.id.btn_playlist);


        mArtistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(AlbumActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        mGenreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent genreIntent = new Intent(AlbumActivity.this, GenreActivity.class);
                startActivity(genreIntent);
            }
        });

        mLibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(AlbumActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        mPlaylistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(AlbumActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
