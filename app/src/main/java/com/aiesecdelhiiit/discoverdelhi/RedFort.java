package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RedFort extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red_fort);
    }

    public void Process(View view) {
        Intent red = null;

        if (view.getId() == R.id.redFort2) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Red+Fort/@28.6561206,77.2409868,21z/data=!4m5!3m4!1s0x390cfce26ec085ef:0x441e32f4fa5002fb!8m2!3d28.6561592!4d77.2410203");
            red = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(red);
        }
    }
}
