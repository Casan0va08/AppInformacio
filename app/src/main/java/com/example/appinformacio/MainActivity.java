package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView restaurant, movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //@Override
    public void clickMovies(View view)
    {
        //movies = findViewById(R.id.movies);

        if (view.getId() == R.id.movies)
        {
            Intent intent = new Intent(this, Cartellera.class);
            startActivity(intent);
        }

    }











}
//<ImageView
//        android:id="@+id/restaurants"
//        android:layout_width="100sp"
//        android:layout_height="100sp"
//        android:src="@drawable/restaurants"
//        android:layout_centerVertical="true"
//        android:layout_centerHorizontal="true"
//        android:onClick="clickRestaurants">
//</ImageView>

//<ImageView
//        android:id="@+id/esports"
//        android:layout_width="100sp"
//        android:layout_height="100sp"
//        android:src="@drawable/esports"
//        android:layout_centerVertical="true"
//        android:layout_toRightOf="@id/restaurants"
//        android:layout_marginLeft="20dp"
//        android:onClick="clickEsports">
//</ImageView>

//<ImageView
//        android:id="@+id/movies"
//        android:layout_width="100sp"
//        android:layout_height="100sp"
//        android:src="@drawable/movies"
//        android:layout_centerVertical="true"
//        android:layout_toLeftOf="@id/restaurants"
//        android:layout_marginRight="20dp"
//        android:onClick="clickMovies">
//</ImageView>

//<ImageView
//        android:id="@+id/tranport"
//        android:layout_width="100sp"
//        android:layout_height="100sp"
//        android:src="@drawable/transport"
//        android:layout_centerHorizontal="true"
//        android:layout_above="@id/restaurants"
//        android:layout_marginBottom="20dp">
//</ImageView>