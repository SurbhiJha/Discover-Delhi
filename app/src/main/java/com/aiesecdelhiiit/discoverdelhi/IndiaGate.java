package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class IndiaGate extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india_gate);
    }

    public void Process(View view) {
        Intent i = null;

        if (view.getId() == R.id.gate) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/India+Gate/@28.612912,77.2293729,21z/data=!4m5!3m4!1s0x390ce2daa9eb4d0b:0x717971125923e5d!8m2!3d28.612912!4d77.2295097");
            i = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(i);
        }
    }
}