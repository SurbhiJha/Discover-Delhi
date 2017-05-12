package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Purana_Qila extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purana__qila);
    }

    public void Process(View view) {
        Intent pq = null;

        if (view.getId() == R.id.pqila) {
            Uri uri = Uri.parse("https://www.google.co.in/maps/place/Purana+Qila/@28.6095744,77.2436003,21z/data=!4m5!3m4!1s0x390ce3214b3b6771:0x139279610ab2ccb3!8m2!3d28.6095744!4d77.2437371");
            pq = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(pq);
        }
    }
}
