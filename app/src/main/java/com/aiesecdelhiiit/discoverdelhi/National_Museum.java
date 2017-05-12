package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class National_Museum extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national__museum);
    }

    public void Process(View view) {
        Intent mu = null;

        if (view.getId() == R.id.nMuseum) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/National+Museum/@28.6118213,77.2191565,21z/data=!4m5!3m4!1s0x390cfd52c71ff0eb:0x20429f292fa5eecf!8m2!3d28.6118213!4d77.2192933");
            mu = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(mu);
        }
    }
}
