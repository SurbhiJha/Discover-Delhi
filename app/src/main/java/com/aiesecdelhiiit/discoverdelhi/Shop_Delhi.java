package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Shop_Delhi extends Activity {

    ListView listView4 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop__delhi);


        // Get ListView object from xml
        listView4 = (ListView) findViewById(R.id.listshop);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Sarojini Nagar",
                "Janpath Market and Palika Bazaar",
                "South Extension",
                "Khan Market",
                "Karol Bagh",
                "Chandni Chowk",
                "Lajpat Nagar",
                "Rajouri Garden"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView4.setAdapter(adapter);
// ListView Item Click Listener
        listView4.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView4.getItemAtPosition(position);

                Intent saroj=null,janpath=null,southex=null,khan=null,karol=null,chowk=null,laj=null,raj=null;

                if (itemPosition==1) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Janpath,+Connaught+Place,+New+Delhi,+Delhi+110001/@28.6252456,77.2094633,15z/data=!3m1!4b1!4m5!3m4!1s0x390cfd3566072ae7:0xc3ee5bb3edf3b7ac!8m2!3d28.6278172!4d77.2189594");
                    janpath = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(janpath);
                }
                if (itemPosition==2) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/South+Extension+I,+New+Delhi,+Delhi+110049/@28.572895,77.2142022,15z/data=!3m1!4b1!4m5!3m4!1s0x390ce25c2bda02bd:0x88805483a1dca8bb!8m2!3d28.5732907!4d77.2219418");
                    southex = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(southex);
                }
                if (itemPosition==0) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Sarojini+Nagar,+New+Delhi,+Delhi+110023/@28.5755191,77.1888182,15z/data=!3m1!4b1!4m5!3m4!1s0x390ce2807715052f:0x19fc64a776e628ad!8m2!3d28.5757137!4d77.1990075");
                    saroj = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(saroj);
                }
                if (itemPosition==3) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Khan+Market,+Rabindra+Nagar,+New+Delhi,+Delhi+110003/@28.600512,77.2240638,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce2c289887b17:0x17e087ce57578460!8m2!3d28.6000912!4d77.2270425");
                    khan = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(khan);
                }
                if (itemPosition==4) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Karol+Bagh,+New+Delhi,+Delhi/@28.6518724,77.1757282,14z/data=!3m1!4b1!4m5!3m4!1s0x390d029c5f402ed3:0x942174294c9dd946!8m2!3d28.6527809!4d77.1921441");
                    karol = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(karol);
                }
                if (itemPosition==5) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Chandni+Chowk,+New+Delhi,+Delhi/@28.6514176,77.2141583,14z/data=!3m1!4b1!4m5!3m4!1s0x390cfd1a88dcc559:0x24fa43c081dbe51!8m2!3d28.6505942!4d77.2303284");
                    chowk = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(chowk);
                }
                if (itemPosition==6) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Lajpat+Nagar,+New+Delhi,+Delhi,+India/@28.5688961,77.2343647,15z/data=!3m1!4b1!4m5!3m4!1s0x390ce3ad801d293d:0x7f730966747ee8fc!8m2!3d28.5676955!4d77.2432721");
                    laj = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(laj);
                }
                if (itemPosition==7) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Rajouri+Garden,+New+Delhi,+Delhi/@28.6442033,77.1118256,15z/data=!3m1!4b1!4m5!3m4!1s0x390d036b61214b21:0xaaa9a3b98a1faee2!8m2!3d28.6415294!4d77.1209145");
                    raj = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(raj);
                }
            }



        });

    }




}



