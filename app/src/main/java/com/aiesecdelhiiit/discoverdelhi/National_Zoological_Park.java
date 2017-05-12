package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class National_Zoological_Park extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national__zoological__park);
    }

    public void Process(View view) {
        Intent n2 = null;

        if (view.getId() == R.id.nationalZoo) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/National+Zoological+Park/@28.601977,77.2456132,21z/data=!4m5!3m4!1s0x390ce318a027dbb9:0xf12a1c6b59580448!8m2!3d28.601977!4d77.2478019");
            n2 = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(n2);
        }
    }
}
