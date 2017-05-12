package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Kali extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kali);
    }

    public void Process(View view) {
        Intent r = null,ka=null;

        if (view.getId() == R.id.kali) {
            r=new Intent(Kali.this,Kalka_Mandir.class);
            startActivity(r);
        }
        if (view.getId() == R.id.kali1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Kalka+Mandir/@28.528927,77.25763,21z/data=!4m5!3m4!1s0x390ce1641d5113b3:0xd17c29abd9cff627!8m2!3d28.528927!4d77.2577668");
            ka = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(ka);
        }
    }
}
