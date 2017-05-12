package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MetroMap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro_map);


    }
    public void Process(View view)
    {   Intent lot=null;

        if(view.getId()==R.id.metroMap)
        {   Uri uri = Uri.parse("http://delhi-metro-map.com/data/uploads/free-delhi-metro-map_www.png");
            lot=new Intent(Intent.ACTION_VIEW,uri);

            startActivity(lot);
        }
    }
}
