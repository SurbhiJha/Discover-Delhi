package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Rasi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rasi);
    }

    public void Process(View view) {
        Intent r = null,r1=null;

        if (view.getId() == R.id.rasi) {
            r=new Intent(Rasi.this,Rashtrapati_Bhavan.class);
            startActivity(r);
        }
        if (view.getId() == R.id.ras1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Rashtrapati+Bhavan/@28.61436,77.1994842,21z/data=!4m5!3m4!1s0x390ce2a99b6f9fa7:0x83a25e55f0af1c82!8m2!3d28.61436!4d77.199621?hl=en");
            r1 = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(r1);
        }
    }
}
