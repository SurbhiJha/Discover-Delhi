package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class JanImg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jan_img);
    }

    public void Process(View view) {
        Intent r = null, j2 = null;

        if (view.getId() == R.id.jani) {
            r = new Intent(JanImg.this, Jantar_Mantar.class);
            startActivity(r);
        }
        if (view.getId() == R.id.jan1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Jantar+Mantar/@28.6270547,77.2164899,21z/data=!4m5!3m4!1s0x390cfd4a694fc49b:0xa24a6ec962781b0c!8m2!3d28.6270547!4d77.2166267");
            j2 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(j2);
        }
    }
}
