package com.aasavari.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenreActivity extends AppCompatActivity {

    private Button mAlbumBtn;
    private Button mArtistBtn;
    private Button mGenreBtn;
    private Button mLibraryBtn;
    private Button mPlaylistBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        mAlbumBtn = (Button)findViewById(R.id.btn_album);
        mArtistBtn = (Button)findViewById(R.id.btn_artist);
        mLibraryBtn = (Button)findViewById(R.id.btn_library);
        mPlaylistBtn = (Button)findViewById(R.id.btn_playlist);

        mAlbumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumIntent = new Intent(GenreActivity.this, AlbumActivity.class);
                startActivity(albumIntent);
            }
        });

        mArtistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistIntent = new Intent(GenreActivity.this, ArtistActivity.class);
                startActivity(artistIntent);
            }
        });

        mLibraryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(GenreActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        mPlaylistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(GenreActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });
    }
}
