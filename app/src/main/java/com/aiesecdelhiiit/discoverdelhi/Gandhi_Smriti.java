package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Gandhi_Smriti extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gandhi__smriti);
    }
    public void Process(View view) {
        Intent gs = null;

        if (view.getId() == R.id.smriti) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Gandhi+Smriti/@28.60177,77.2142025,21z/data=!4m5!3m4!1s0x390ce2bfca036a97:0xf074d19eb4e1b40a!8m2!3d28.60177!4d77.2143393?hl=en");
            gs = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(gs);
        }
    }
}
