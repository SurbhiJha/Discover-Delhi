package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Nehi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nehi);
    }
    public void Process(View view) {
        Intent r = null,n=null;

        if (view.getId() == R.id.nehi) {
            r=new Intent(Nehi.this,Nehru_Planetarium.class);
            startActivity(r);
        }

        if (view.getId() == R.id.nehi1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Nehru+Planetarium/@28.603876,77.1979973,21z/data=!4m5!3m4!1s0x390ce2a138a37f7f:0xac737507d2cef84a!8m2!3d28.603876!4d77.1981341");
            n = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(n);
        }
    }
}