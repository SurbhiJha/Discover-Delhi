package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class GarI extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gar_i);
    }

    public void Process(View view) {
        Intent r = null,five=null;

        if (view.getId() == R.id.gi) {
            r=new Intent(GarI.this,Garden_of_five_senses.class);
            startActivity(r);
        }
        if (view.getId() == R.id.g1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/The+Garden+Of+Five+Senses/@28.513935,77.1967812,21z/data=!4m5!3m4!1s0x390ce1e3ea219915:0x14fc57988731271c!8m2!3d28.513935!4d77.196918?hl=en");
            five = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(five);
        }
    }
}


