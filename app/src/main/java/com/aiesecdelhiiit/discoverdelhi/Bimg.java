package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Bimg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bimg);
    }

    public void Process(View view) {
        Intent r = null,ban=null;

        if (view.getId() == R.id.bi) {
            r=new Intent(Bimg.this,BanglaSahib.class);
            startActivity(r);
        }
        if (view.getId() == R.id.b1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Gurudwara+Bangla+Sahib/@28.6263283,77.2089579,21z/data=!4m5!3m4!1s0x390cfd4db51d8a9d:0xdac87bb4502c9e5f!8m2!3d28.6263283!4d77.2090947?hl=en");
            ban = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(ban);
        }
    }
}
