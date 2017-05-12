package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Hauz_Khas_Village extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hauz__khas__village);
    }

    public void Process(View view) {
        Intent h1 = null;

        if (view.getId() == R.id.hkv) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Hauz+Khas,+New+Delhi,+Delhi/@28.5483183,77.2006063,18.83z/data=!4m5!3m4!1s0x390ce2127da1cf23:0xd89ebc21c669134d!8m2!3d28.5494489!4d77.2001368");
            h1 = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(h1);
        }
    }
}
