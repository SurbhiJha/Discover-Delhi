package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class National_Science_Centre extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national__science__centre);
    }

    public void Process(View view) {
        Intent sc = null;

        if (view.getId() == R.id.nationalScience) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/National+Science+Centre,+Delhi/@28.6132428,77.2451635,21z/data=!4m5!3m4!1s0x390ce32612bb031b:0xf13c5aadf7760be0!8m2!3d28.6132428!4d77.2453003");
            sc= new Intent(Intent.ACTION_VIEW, uri);

            startActivity(sc);
        }
    }
}
