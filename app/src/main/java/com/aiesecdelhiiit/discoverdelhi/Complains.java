package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Complains extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complains);
    }

    public void mail(View v)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "akki.nagpal@aiesec.net"));
        startActivity(intent);
    }}
