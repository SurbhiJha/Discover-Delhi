package com.aiesecdelhiiit.discoverdelhi;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class agrImg extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agr_img);
    }

    public void Process(View view) {
        Intent a = null,a1=null;

        if (view.getId() == R.id.agri) {
            a=new Intent(agrImg.this,AgrasenKiBaoli.class);
            startActivity(a);
        }
        if(view.getId()==R.id.agra1)
        {   Uri uri = Uri.parse("https://www.google.co.in/maps/place/Ugrasen+Ki+Baoli/@28.6260171,77.2249261,21z/data=!4m5!3m4!1s0x390cfd331180749b:0x17cb3633f17f2fa9!8m2!3d28.6260171!4d77.2250629?hl=en");
            a1=new Intent(Intent.ACTION_VIEW,uri);

            startActivity(a1);
        }
    }
}

