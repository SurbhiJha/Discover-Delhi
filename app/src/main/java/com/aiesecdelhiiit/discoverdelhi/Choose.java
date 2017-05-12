package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Choose extends Activity implements View.OnClickListener{

    Button explore, places_eat, shop, transport, imp_places, complainants, about,eve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        explore=(Button)findViewById(R.id.explore);
        explore.setOnClickListener(this);

        places_eat=(Button)findViewById(R.id.places);
        places_eat.setOnClickListener(this);



        shop=(Button)findViewById(R.id.shop);
        shop.setOnClickListener(this);

        transport=(Button)findViewById(R.id.transport);
        transport.setOnClickListener(this);

        imp_places=(Button)findViewById(R.id.imp_places);
        imp_places.setOnClickListener(this);



        complainants=(Button)findViewById(R.id.complain);
        complainants.setOnClickListener(this);


        about=(Button)findViewById(R.id.about);
        about.setOnClickListener(this);

        eve=(Button)findViewById(R.id.events);
        eve.setOnClickListener(this);
    }

    public void onClick(View v) {

        if (v.getId()==R.id.explore) {
            Intent explore_i = new Intent(Choose.this, explore_delhi.class);
            startActivity(explore_i);
        }
        if (v.getId()==R.id.places){
            Intent places_i = new Intent(Choose.this, places_to_eat.class);
            startActivity(places_i);
        }

        if (v.getId()==R.id.shop){
            Intent shop_i = new Intent(Choose.this, Shop_Delhi.class);
            startActivity(shop_i);
        }

        if (v.getId()==R.id.transport){
            Intent transport_i = new Intent(Choose.this, Transport_Delhi.class);
            startActivity(transport_i);
        }

        if (v.getId()==R.id.imp_places){
            Intent imp_i = new Intent(Choose.this, emergencies.class);
            startActivity(imp_i);
        }

        if (v.getId()==R.id.complain){
            Intent complain_i = new Intent(Choose.this, Complains.class);
            startActivity(complain_i);
        }


        if (v.getId()==R.id.about){
            Intent about_i = new Intent(Choose.this, About.class);
            startActivity(about_i);
        }
        if (v.getId()==R.id.events){
            Uri uri = Uri.parse("http://akshaynagpal1995.wix.com/events");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        }
    }
}

