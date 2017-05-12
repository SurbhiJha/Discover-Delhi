package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Nizamuddin_Dargah extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nizamuddin__dargah);
    }

    public void Process(View view) {
        Intent ni = null;

        if (view.getId() == R.id.niza) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Dargah+Hazrat+Nizamuddin/@28.5913661,77.2417319,21z/data=!4m5!3m4!1s0x390ce31d55287ca3:0x79e0b03d96a8efe8!8m2!3d28.5913871!4d77.2418643");
            ni = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(ni);
        }
    }
}
