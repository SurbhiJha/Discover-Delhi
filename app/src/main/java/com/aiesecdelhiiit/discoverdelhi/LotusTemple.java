package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LotusTemple extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lotus_temple);
    }

    public void Process(View view)
    {   Intent lot=null;

        if(view.getId()==R.id.lotus)
        {   Uri uri = Uri.parse("https://www.google.co.in/maps/place/Lotus+Temple/@28.5536263,77.2585045,19z/data=!4m5!3m4!1s0x390ce3c16e028cd1:0x653beb1ee85ec67a!8m2!3d28.553492!4d77.2588264?hl=en");
            lot=new Intent(Intent.ACTION_VIEW,uri);

            startActivity(lot);
        }
    }
}
