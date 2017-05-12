package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class qutuImg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qutu_img);
    }

    public void Process(View view) {
        Intent r = null,r1=null;

        if (view.getId() == R.id.qi) {
            r=new Intent(qutuImg.this,QutubMinar.class);
            startActivity(r);
        }
        if (view.getId() == R.id.q1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Qutub+Minar/@28.5244281,77.1853191,21z/data=!4m5!3m4!1s0x390d1e0667819b4f:0x834995f160759db8!8m2!3d28.5244281!4d77.1854559");
            r1 = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(r1);
        }
    }
}
