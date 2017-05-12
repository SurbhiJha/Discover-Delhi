package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Raili extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raili);
    }

    public void Process(View view) {
        Intent r = null,r1=null;

        if (view.getId() == R.id.ri) {
            r=new Intent(Raili.this,National_Rail_Museum.class);
            startActivity(r);
        }
        if (view.getId() == R.id.r1) {
            Uri uri = Uri.parse("https://www.google.com/maps/place/National+Rail+Museum/@28.5856971,77.1797652,15z/data=!4m5!3m4!1s0x0:0xdb46d0593f9caa02!8m2!3d28.5856971!4d77.1797652");
            r1 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(r1);
        }
    }
}

