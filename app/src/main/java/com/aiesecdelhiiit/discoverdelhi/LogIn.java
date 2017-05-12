package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LogIn extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acitivity);

    }
    public void process(View v)
    {   Intent h=null;

        if (v.getId()==R.id.button) {
            Intent i = new Intent(LogIn.this, Choose.class);
            startActivity(i);
        }
        if (v.getId() == R.id.sign) {
            Uri uri = Uri.parse("http://goo.gl/forms/jeJPTWghHHiBNfFd2");
            h = new Intent(Intent.ACTION_VIEW, uri);

            startActivity(h);

        }}
}
