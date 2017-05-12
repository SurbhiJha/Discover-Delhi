package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import static com.sun.xml.internal.ws.policy.sourcemodel.wspolicy.XmlToken.Uri;

public class About extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }
    public void Process(View view) {
        Intent about = null,awards=null,impact=null;

        if (view.getId() == R.id.reach) {
            Uri uri = Uri.parse("https://www.google.com/maps/place/AIESEC+in+Delhi+IIT/@28.5308359,77.205238,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce20330000001:0x79919faa296f8eae!8m2!3d28.5308359!4d77.2074267");
            about = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(about);
        }
        else if (view.getId()==R.id.awards)
        {

            awards = new Intent(About.this,awards.class);

            startActivity(awards);

        }
        else if (view.getId()==R.id.impact)
        {

            impact = new Intent(About.this,impact.class);

            startActivity(impact);

        }
    }

}
