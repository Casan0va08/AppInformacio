package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    ImageView restaurant, movies, settings;

    //String url0 = 'urlimagen'
    //Glide
            //.with(this)
            //.load(utl0)
            //.fitCenter()
            //.into(image1 => ImageView)


    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restaurant  = findViewById(R.id.restaurants);
        movies      = findViewById(R.id.movies);
        settings    = findViewById(R.id.settings);
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

        else if (view.getId() == R.id.settings)
        {
            Intent settings = new Intent (this, SettingsFragment.class);
            startActivity(settings);
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_change_background_color) {
            // Aquí puedes realizar la acción correspondiente, por ejemplo, abrir un fragmento de preferencias
            getSupportFragmentManager().beginTransaction()
                    .replace(android.R.id.content, new SettingsFragment())
                    .addToBackStack(null)
                    .commit();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

