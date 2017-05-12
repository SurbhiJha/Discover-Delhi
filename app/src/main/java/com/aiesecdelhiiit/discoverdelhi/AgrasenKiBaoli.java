package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class AgrasenKiBaoli extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agrasen_ki_baoli);
    }
    public void Process(View view)
    {   Intent agra=null;

        if(view.getId()==R.id.agrasen)
        {   Uri uri = Uri.parse("https://www.google.co.in/maps/place/Ugrasen+Ki+Baoli/@28.6260171,77.2249261,21z/data=!4m5!3m4!1s0x390cfd331180749b:0x17cb3633f17f2fa9!8m2!3d28.6260171!4d77.2250629?hl=en");
            agra=new Intent(Intent.ACTION_VIEW,uri);

            startActivity(agra);
        }
    }

}
