package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    ImageView restaurant, movies;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //@Override
    public void clickMovies(View view)
    {
        // movies = findViewById(R.id.movies);

        if (view.getId() == R.id.movies)
        {
            Intent cartellera = new Intent(this, Cartellera.class);
            startActivity(cartellera);
        }

    }
}