package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
        restaurant = findViewById(R.id.restaurants);
        movies = findViewById(R.id.movies);
    }


    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.movies)
        {
            Intent cartellera = new Intent(this, Cartellera.class);
            startActivity(cartellera);
        }

        else if (view.getId() == R.id.restaurants)
        {
            Intent restaurants = new Intent(this, Restaurants.class);
            startActivity(restaurants);
        }
    }
}