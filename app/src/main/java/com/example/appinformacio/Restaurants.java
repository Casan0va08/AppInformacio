package com.example.appinformacio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Restaurants extends AppCompatActivity implements View.OnClickListener
{
    Button URLPomodoro, TelfPomodoro, UbiPomodoro, URLWok, TelfWok, UbiWok, URLMcDonalds, TelfMcDonalds, UbiMcDonalds, URLViena, TelfViena, UbiViena, URLKFC, TelfKFC, UbiKFC, URLBK, TelfBK, UbiBK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);
        URLPomodoro     = findViewById(R.id.URLPomodoro);
        TelfPomodoro    = findViewById(R.id.TelfPomodoro);
        UbiPomodoro     = findViewById(R.id.UbiPomodoro);
        URLWok          = findViewById(R.id.URLWok);
        TelfWok         = findViewById(R.id.TelfWok);
        UbiWok          = findViewById(R.id.UbiWok);
        URLMcDonalds    = findViewById(R.id.URLPomodoro);
        TelfMcDonalds   = findViewById(R.id.TelfPomodoro);
        UbiMcDonalds    = findViewById(R.id.UbiPomodoro);
        URLViena        = findViewById(R.id.URLPomodoro);
        TelfViena       = findViewById(R.id.TelfPomodoro);
        UbiViena        = findViewById(R.id.UbiPomodoro);
        URLKFC          = findViewById(R.id.URLPomodoro);
        TelfKFC         = findViewById(R.id.TelfPomodoro);
        UbiKFC          = findViewById(R.id.UbiPomodoro);
        URLBK           = findViewById(R.id.URLPomodoro);
        TelfBK          = findViewById(R.id.TelfPomodoro);
        UbiBK           = findViewById(R.id.UbiPomodoro);
    }


    @Override
    public void onClick(View view)
    {
        if (view.getId() == R.id.URLPomodoro)
        {
            Intent IURLPomodoro = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pomodoro.es"));
            startActivity(IURLPomodoro);
        }

        if (view.getId() == R.id.TelfPomodoro)
        {
            Intent ITelfPomodoro = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"));
            startActivity(ITelfPomodoro);
        }

        if (view.getId() == R.id.UbiPomodoro)
        {
            Intent IUbiPomodoro = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.61048321247108, 2.3026609711641526"));
            startActivity(IUbiPomodoro);
        }

        if (view.getId() == R.id.URLWok)
        {
            Intent IURLWok = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/RestaurantWokHongKong/?locale=es_ES"));
            startActivity(IURLWok);
        }

        if (view.getId() == R.id.TelfWok)
        {
            Intent ITelfWok = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"));
            startActivity(ITelfWok);
        }

        if (view.getId() == R.id.UbiWok)
        {
            Intent IUbiWok = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.60978564999713, 2.3030708070409043"));
            startActivity(IUbiWok);
        }

        if (view.getId() == R.id.URLViena)
        {
            Intent IURLViena = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.viena.es"));
            startActivity(IURLViena);
        }

        if (view.getId() == R.id.TelfViena)
        {
            Intent ITelfViena = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"));
            startActivity(ITelfViena);
        }

        if (view.getId() == R.id.UbiViena)
        {
            Intent IUbiViena = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.611659486221036, 2.3036355823112205"));
            startActivity(IUbiViena);
        }

        if (view.getId() == R.id.URLMcDonalds)
        {
            Intent IURLMcDonalds = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mcdonalds.es/"));
            startActivity(IURLMcDonalds);
        }

        if (view.getId() == R.id.TelfMcDonalds)
        {
            Intent ITelfMcDonalds = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"));
            startActivity(ITelfMcDonalds);
        }

        if (view.getId() == R.id.UbiMcDonalds)
        {
            Intent IUbiMcDonalds = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.611504643884366, 2.3031522425241566"));
            startActivity(IUbiMcDonalds);
        }

        if (view.getId() == R.id.URLKFC)
        {
            Intent IURLKFC = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kfc.es/"));
            startActivity(IURLKFC);
        }

        if (view.getId() == R.id.TelfKFC)
        {
            Intent ITelfKFC = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"));
            startActivity(ITelfKFC);
        }

        if (view.getId() == R.id.UbiKFC)
        {
            Intent IUbiKFC = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.61174104481758, 2.3027347288358473"));
            startActivity(IUbiKFC);
        }

        if (view.getId() == R.id.URLBK)
        {
            Intent IURLBK = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.burgerking.es/home"));
            startActivity(IURLBK);
        }

        if (view.getId() == R.id.TelfBK)
        {
            Intent ITelfBK = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:123456789"));
            startActivity(ITelfBK);
        }

        if (view.getId() == R.id.UbiBK)
        {
            Intent IUbiBK = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.61039083441982, 2.3004210000000005"));
            startActivity(IUbiBK);
        }
    }
}