package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import java.util.Arrays;
import java.util.List;


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

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String backgroundColorValue = preferences.getString("preference_key_background_color", "1");

        List<String> data = Arrays.asList("Japonés", "Italià", "Gelats");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter adapter = new CustomAdapter(data);
        recyclerView.setAdapter(adapter);
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

