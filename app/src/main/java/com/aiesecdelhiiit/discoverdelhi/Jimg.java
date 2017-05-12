package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Jimg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jimg);
    }

    public void Process(View view) {
        Intent r = null,j=null;

        if (view.getId() == R.id.ji) {
            r=new Intent(Jimg.this,Jama_Masjid.class);
            startActivity(r);
        }
        if (view.getId() == R.id.j1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Jama+Masjid/@28.6506792,77.2333053,21z/data=!4m5!3m4!1s0x390cfd18df89b215:0xdd57369e29bf9d96!8m2!3d28.6506792!4d77.2334421");
            j= new Intent(Intent.ACTION_VIEW, uri);

            startActivity(j);
        }
    }
}
