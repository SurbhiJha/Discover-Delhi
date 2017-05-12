package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Transport_Delhi extends Activity {
    Button places;
    ListView listView5 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport__delhi);


        // Get ListView object from xml
        listView5 = (ListView) findViewById(R.id.list5);

        // Defined Array values to show in ListView
        String[] values = new String[] { "Delhi Metro",
                "Auto-rickshaw",
                "Buses",
                "Cycle Rickshaw",
                "Cabs"
        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listView5.setAdapter(adapter);

        // ListView Item Click Listener
        listView5.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listView5.getItemAtPosition(position);


                Intent map = null,auto=null;
                if (itemPosition == 0) {
                    map = new Intent(Transport_Delhi.this, MetroMap.class);
                    startActivity(map);
                }
                if (itemPosition == 1) {
                    auto = new Intent(Transport_Delhi.this, Auto_Rickshaw.class);
                    startActivity(auto);
                }
                if (itemPosition == 2) {
                    auto = new Intent(Transport_Delhi.this, Buses.class);
                    startActivity(auto);
                }


                if (itemPosition == 3) {
                    auto = new Intent(Transport_Delhi.this, Cycle_rickshaw.class);
                    startActivity(auto);
                }
                if (itemPosition == 4) {
                    auto = new Intent(Transport_Delhi.this, Cabs.class);
                    startActivity(auto);
                }
            }

        });
    }


}
