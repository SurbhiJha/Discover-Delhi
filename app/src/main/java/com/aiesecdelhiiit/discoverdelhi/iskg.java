package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class iskg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iskg);
    }

    public void Process(View view) {
        Intent r = null,i2=null;

        if (view.getId() == R.id.iski) {
            r=new Intent(iskg.this,iskcon_temple.class);
            startActivity(r);
        }
        if (view.getId() == R.id.isk1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/ISKCON+Temple/@28.6602269,77.123144,21z/data=!4m5!3m4!1s0x390d039fd70c874d:0x61bcbbdd94cd81c7!8m2!3d28.6602269!4d77.1232808");
            i2 = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(i2);
        }

    }
}
