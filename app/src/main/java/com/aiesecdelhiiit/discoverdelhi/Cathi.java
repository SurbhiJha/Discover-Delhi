package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Cathi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cathi);
    }

    public void Process(View view) {
        Intent r = null,church=null;

        if (view.getId() == R.id.cati) {
            r=new Intent(Cathi.this,Cathedral_Church.class);
            startActivity(r);
        }
        if (view.getId() == R.id.cat1) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Cathedral+Church+of+The+Redemption/@28.618124,77.2017548,21z/data=!4m5!3m4!1s0x390ce2ac43f5bda1:0xb45d11931a51b513!8m2!3d28.618124!4d77.2018916?hl=en");
            church = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(church);
        }
    }
}
