package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Teeni extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teeni);
    }

    public void Process(View view) {
        Intent r = null, teen = null;

        if (view.getId() == R.id.ti) {
            r = new Intent(Teeni.this, Teen_Murti_Bhavan.class);
            startActivity(r);
        }
        if (view.getId() == R.id.t1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Teen+Murti+Bhavan,+Teen+Murti+Marg+Area,+New+Delhi,+Delhi+110011/@28.6026513,77.1986439,21z/data=!4m5!3m4!1s0x390ce2a114a1045d:0xc1d193024fc1ab52!8m2!3d28.60264!4d77.1987922");
            teen = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(teen);
        }
    }
}
