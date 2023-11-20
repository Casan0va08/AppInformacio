package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    ImageView restaurant, movies;

    //String url0 = 'urlimagen'
    //Glide
            //.with(this)
            //.load(utl0)
            //.fitCenter()
            //.into(image1 => ImageView)


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View view)
    {
        movies = findViewById(R.id.movies);

        if (view.getId() == R.id.movies)
        {
            Intent cartellera = new Intent(this, Cartellera.class);
            startActivity(cartellera);
        }

    }
}