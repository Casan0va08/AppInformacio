package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.res.Resources;


public class Cartellera extends AppCompatActivity {

    TextView tvAlimanas, tvFNAF, tvSabenAquell, tvJDHambre, tvSawX, tvMarvels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartellera);

        tvAlimanas      = findViewById(R.id.tvAlimanas);
        tvFNAF          = findViewById(R.id.tvFNAF);
        tvSabenAquell   = findViewById(R.id.tvSabenAquell);
        tvJDHambre      = findViewById(R.id.tvJDHambre);
        tvSawX          = findViewById(R.id.tvSawX);
        tvMarvels       = findViewById(R.id.tvMarvels);

        tvAlimanas.setText(getResources().getString(R.string.descripcioAlimanas));
        tvFNAF.setText(getResources().getString(R.string.descripcioFNAF));
        tvSabenAquell.setText(getResources().getString(R.string.descripcioSabenAquell));
        tvJDHambre.setText(getResources().getString(R.string.descripcioJDHambre));
        tvSawX.setText(getResources().getString(R.string.descripcioSawX));
        tvMarvels.setText(getResources().getString(R.string.descripcioMarvels));

    }


}