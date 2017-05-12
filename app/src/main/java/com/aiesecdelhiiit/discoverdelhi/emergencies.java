package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class emergencies extends Activity {
    ListView listView3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencies);


        // Get ListView object from xml
        listView3 = (ListView) findViewById(R.id.list3);

        // Defined Array values to show in ListView
        String[] values = new String[] {" EMERGENCY CONTACTS:",
                "Police: 100",
                "Fire: 101",
                "Ambulance: 102",
                " ",
                "HOSPITALS:",
                "AIIMS Hospital (011 2659 4404)",
                "MaxHealth Care (011 2651 5050)",
                "Escorts Hospital and Research Centre (011 2682 5000)",
                "Apollo Hospital (011 2692 5858)",
                "Fortis Hospital (011 4277 6222)",
                "Batra Hospital (+91 98997 92197)",
                " ",
                "AIESEC CONTACTS:",
                "Tushar Jain (tushar298.jain@aiesec.net)",
                "Surbhi Mahajan (surbhi.mahajan@aiesec.net)",
                "Akshay Nagpal (akki.nagpal@aiesec.net)"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView3.setAdapter(adapter);
        // ListView Item Click Listener
        listView3.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView3.getItemAtPosition(position);
                Intent max = null, aiims = null, escorts = null, ap = null, fort = null, batra = null;
                if (itemPosition == 7) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Max+Multi+Speciality+Centre/@28.5341827,77.1845407,12.16z/data=!4m8!1m2!2m1!1smaxhealth+care+delhi!3m4!1s0x0000000000000000:0x8f137ec9abc2c7fd!8m2!3d28.5434376!4d77.214489");
                    max = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(max);
                }

                if (itemPosition == 6) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/AIIMS+Delhi/@28.5671704,77.2071358,17z/data=!4m8!1m2!2m1!1saiims+hospital+delhi!3m4!1s0x390ce268b0327319:0x75109debe807bdac!8m2!3d28.5665401!4d77.2098409");
                    aiims = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(aiims);
                }
                if (itemPosition == 8) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Fortis+Escorts+Heart+Institute+%26+Research+Centre/@28.5604551,77.2737782,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce47598a5c11b:0x60971dd124024b09!8m2!3d28.5604551!4d77.2737782");
                    escorts = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(escorts);
                }
                if (itemPosition == 9) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Apollo+Hospital/@28.5400469,77.2803599,17z/data=!3m1!4b1!4m5!3m4!1s0x390ce3fe5b666b25:0xdd097ac632ec3f2b!8m2!3d28.5400422!4d77.2825486");
                    ap = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(ap);
                }
                if (itemPosition == 10) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Fortis+Flt+Lt+Rajan+Dhall+Hospital/@28.5194016,77.158251,17z/data=!3m1!4b1!4m5!3m4!1s0x390d1e7459d1d2eb:0x58b514085da89ae0!8m2!3d28.5193969!4d77.1604397");
                    fort = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(fort);
                }
                if (itemPosition == 11) {
                    Uri uri = Uri.parse("https://www.google.com/maps/place/Batra+Hospital+%26+Medical+Research+Centre/@28.5798142,77.1157308,12z/data=!4m8!1m2!2m1!1sBatra+Hospital+!3m4!1s0x0000000000000000:0x3f5d6c5cdcac9bfd!8m2!3d28.5134625!4d77.2457743");
                    batra = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(batra);
                }


            }


        });

    }

}



