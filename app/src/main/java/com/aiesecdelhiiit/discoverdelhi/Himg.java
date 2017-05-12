package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Himg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himg);
    }

    public void Process(View view) {
        Intent r = null,h2=null;

        if (view.getId() == R.id.hi) {
            r=new Intent(Himg.this,Htomb.class);
            startActivity(r);
        }
        if (view.getId() == R.id.h1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Humayun's+Tomb/@28.5933079,77.250564,21z/data=!4m5!3m4!1s0x390ce31abf44a0c5:0x938663ce3e1f68f7!8m2!3d28.5933079!4d77.2507008");
            h2 = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(h2);
        }
    }
}
