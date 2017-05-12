package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Teen_Murti_Bhavan extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teen__murti__bhavan);
    }

    public void Process(View view) {
        Intent teen = null;

        if (view.getId() == R.id.murti) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Teen+Murti+Bhavan,+Teen+Murti+Marg+Area,+New+Delhi,+Delhi+110011/@28.6026513,77.1986439,21z/data=!4m5!3m4!1s0x390ce2a114a1045d:0xc1d193024fc1ab52!8m2!3d28.60264!4d77.1987922");
            teen = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(teen);
        }
    }
}
