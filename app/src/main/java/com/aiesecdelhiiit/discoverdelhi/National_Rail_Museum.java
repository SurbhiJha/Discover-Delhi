package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class National_Rail_Museum extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national__rail__museum);
    }

    public void Process(View view) {
        Intent k = null;

        if (view.getId() == R.id.railMuseum) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/National+Rail+Museum/@28.5856971,77.1796284,21z/data=!4m5!3m4!1s0x390d1d7021a0de89:0xdb46d0593f9caa02!8m2!3d28.5856971!4d77.1797652");
            k = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(k);
        }
    }
}
