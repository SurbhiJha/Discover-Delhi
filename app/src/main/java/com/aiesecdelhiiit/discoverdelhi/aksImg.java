package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class aksImg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aks_img);
    }

    public void Process(View view) {
        Intent r = null,r1=null;

        if (view.getId() == R.id.ai) {
            r=new Intent(aksImg.this,Akshardham.class);
            startActivity(r);
        }
        if(view.getId()==R.id.a1)
        {   Uri uri = Uri.parse("https://www.google.co.in/maps/place/Akshardham/@28.6126735,77.2771251,21z/data=!4m5!3m4!1s0x390ce35b9975b1fb:0x69a09f265ef3b22a!8m2!3d28.6126735!4d77.2772619");
            r1=new Intent(Intent.ACTION_VIEW,uri);

            startActivity(r1);
        }
    }
}
