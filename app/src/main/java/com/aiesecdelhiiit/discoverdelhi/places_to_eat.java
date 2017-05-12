package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class places_to_eat extends Activity {

    ListView listView2 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_eat);


        // Get ListView object from xml
        listView2 = (ListView) findViewById(R.id.listeat);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Kunzum Café At INR *Whatever You Like*",
                "Dunkin’s BIG JOY Burger at INR 55 {veg} and INR 65 {chicken}",
                "Ice Cream At India Gate",
                "JNU Dhabas At INR 100",
                "Kulle Ki Chaat At INR 40 Per Plate - Chawri Bazaar",
                " ",
                "Avail discounts at these CAFÉS:",
                "Matchbox - Hauz Khas Village",
                "Fork You - Hauz Khas Village",
                "FLYP@MTV - CP",
                "Kinbuck 2 - CP",
                "Pebble Street - CP"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView2.setAdapter(adapter);
        // ListView Item Click Listener
        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView2.getItemAtPosition(position);
                Intent kun=null,big=null,indi=null,jnu=null,kulle=null;
                if (itemPosition==0) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Kunzum+Travel+Cafe/@28.5535457,77.1921343,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1d8a9cc8b757:0x1fe57f9bb019ebed!8m2!3d28.553541!4d77.194323");
                    kun = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(kun);
                }

                if (itemPosition==1) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Dunkin%E2%80%99+Donuts/@28.5558611,77.1998417,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce2730a3d851f:0xa749722eeff77b67!8m2!3d28.5558564!4d77.2020304");
                    big = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(big);
                }

                if (itemPosition==2) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/India+Gate/@28.612912,77.2293729,21z/data=!4m5!3m4!1s0x390ce2daa9eb4d0b:0x717971125923e5d!8m2!3d28.612912!4d77.22950970");
                    indi = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(indi);
                }

                if (itemPosition==3) {
                    Uri uri = Uri.parse("https://www.google.com/maps/search/dhaba+near+JNU+Campus+Road,+Jawaharlal+Nehru+University,+New+Delhi,+Delhi,+India/@28.5479507,77.1649702,17z/data=!3m1!4b1");
                    jnu = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(jnu);
                }

                if (itemPosition==4) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Chawri+Bazar,+Chandni+Chowk,+New+Delhi,+Delhi+110006,+India/@28.6482549,77.2247942,17z/data=!3m1!4b1!4m5!3m4!1s0x390cfd17c9bdebcd:0xa97b55fb3a1cba3e!8m2!3d28.648201!4d77.2269535");
                    kulle = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(kulle);
                }

                Intent match=null,fork=null,fylp=null,kin=null, peb=null;
                if (itemPosition==7) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Matchbox+Pub+%26+Grub/@28.5540282,77.1923581,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce275618be6bd:0xc3f426d1c76fa1c3!8m2!3d28.5540235!4d77.1945468");
                    match= new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(match);
                }
                if (itemPosition==8) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Fork+You/@28.5539427,77.1923203,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1d8a9e6cd243:0x45875e24e6a83655!8m2!3d28.553938!4d77.194509");
                    fork= new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(fork);
                }
                if (itemPosition==9) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/FLYP@MTV/@28.6302787,77.2180983,17z/data=!3m1!4b1!4m5!3m4!1s0x390cfd36625f581b:0x17a34775760edff3!8m2!3d28.630274!4d77.220287");
                    fylp = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(fylp);
                }
                if (itemPosition==10) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Kinbuck+2/@28.6321445,77.214004,17z/data=!3m1!4b1!4m5!3m4!1s0x390cfd314866a4bd:0xd2c5b0468cda3a0b!8m2!3d28.6321398!4d77.2161927");
                    kin= new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(kin);
                }
                if (itemPosition==11) {
                    Uri uri = Uri.parse("https://www.google.co.in/maps/place/Pebble+Street/@28.6302278,77.2184372,17z/data=!3m1!4b1!4m5!3m4!1s0x390cfd3688ed6b89:0x628c05b92601eed9!8m2!3d28.6302231!4d77.2206259");
                    peb= new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(peb);
                }

            }



        });

    }




}



