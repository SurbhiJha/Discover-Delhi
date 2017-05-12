package com.aiesecdelhiiit.discoverdelhi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class explore_delhi extends Activity  {
    Button red;
    ListView listViewex ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore__delhi);


        // Get ListView object from xml
        listViewex = (ListView) findViewById(R.id.listex);

        // Defined Array values to show in ListView
        String[] values = new String[] {
                "Red Fort",
                "Lotus Temple",
                "Qutub Minar",
                "Akshardham",
                "Humayun's Tomb",
                "India Gate",
                "Gurudwara Bangla Sahib",
                "Jama Masjid",
                "Jantar Mantar",
                "Purana Qila",
                "National Museum",
                "ISKCON Temple",
                "Nizamuddin Dargah",
                "Gandhi Smriti",
                "National Rail Museum",
                "National Zoological Park",
                "Garden of Five Senses",
                "Hauz Khas Village",
                "Agrasen ki Baoli",
                "National Science Centre",
                "Kalka Mandir",
                "Cathedral Church of the Redemption",
                "Teen Murti Bhavan",
                "Rashtrapati Bhavan",
                "Nehru Planetarium",



        };

        // Define a new Adapter
        // First parameter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        // Assign adapter to ListView
        listViewex.setAdapter(adapter);

        // ListView Item Click Listener
        listViewex.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) listViewex.getItemAtPosition(position);


                Intent redFort = null, lotus=null, qutub=null,akshar=null,humayun=null,india=null,bangla=null,jama=null,jantar=null,purana=null,museum=null,iskcon=null,dargah=null
                        , gandhi=null,rail=null,zoo=null,fiveSenses=null,hkv=null,agrasen=null,science=null,kalka=null,church=null,bhavan=null,hanuman=null,nehru=null;

                if (itemPosition == 0) {
                    redFort = new Intent(explore_delhi.this, redImg.class);
                    startActivity(redFort);
                }

                else if (itemPosition == 1) {
                    lotus = new Intent(explore_delhi.this, loimg.class);
                    startActivity(lotus);
                }

                else if (itemPosition == 2) {
                    qutub = new Intent(explore_delhi.this, qutuImg.class);
                    startActivity(qutub);
                }

                else if (itemPosition == 3) {
                    akshar = new Intent(explore_delhi.this, aksImg.class);
                    startActivity(akshar);
                }

                else if (itemPosition == 4) {
                    humayun = new Intent(explore_delhi.this, Himg.class);
                    startActivity(humayun);
                }

                else if (itemPosition == 5) {
                    india = new Intent(explore_delhi.this, Iimg.class);
                    startActivity(india);
                }

                else if (itemPosition == 6) {
                    bangla = new Intent(explore_delhi.this, Bimg.class);
                    startActivity(bangla);
                }

                else if (itemPosition == 7) {
                    jama = new Intent(explore_delhi.this, Jimg.class);
                    startActivity(jama);
                }

                else if (itemPosition == 8) {
                    jantar = new Intent(explore_delhi.this, JanImg.class);
                    startActivity(jantar);
                }

                else if (itemPosition == 9) {
                    purana = new Intent(explore_delhi.this, Pimg.class);
                    startActivity(purana);
                }

                else if (itemPosition == 10) {
                    museum = new Intent(explore_delhi.this, Nmi.class);
                    startActivity(museum);
                }

                else if (itemPosition == 11) {
                    iskcon = new Intent(explore_delhi.this, iskg.class);
                    startActivity(iskcon);
                }

                else if (itemPosition == 12) {
                    dargah = new Intent(explore_delhi.this, Nizi.class);
                    startActivity(dargah);
                }

                else if (itemPosition == 13) {
                    gandhi = new Intent(explore_delhi.this, Gani.class);
                    startActivity(gandhi);
                }

                else if (itemPosition == 14) {
                    rail = new Intent(explore_delhi.this, Raili.class);
                    startActivity(rail);
                }

                else if (itemPosition == 15) {
                    zoo = new Intent(explore_delhi.this, ZooI.class);
                    startActivity(zoo);
                }

                else if (itemPosition == 16) {
                    fiveSenses = new Intent(explore_delhi.this, GarI.class);
                    startActivity(fiveSenses);
                }

                else if (itemPosition == 17) {
                    hkv = new Intent(explore_delhi.this, Hkvi.class);
                    startActivity(hkv);
                }

                else if (itemPosition == 18) {
                    agrasen = new Intent(explore_delhi.this, agrImg.class);
                    startActivity(agrasen);
                }

                else if (itemPosition == 19) {
                    science = new Intent(explore_delhi.this, Sci.class);
                    startActivity(science);
                }

                else if (itemPosition == 20) {
                    kalka = new Intent(explore_delhi.this, Kali.class);
                    startActivity(kalka);
                }

                else if (itemPosition == 21) {
                    church = new Intent(explore_delhi.this, Cathi.class);
                    startActivity(church);
                }

                else if (itemPosition == 22) {
                    bhavan = new Intent(explore_delhi.this, Teeni.class);
                    startActivity(bhavan);
                }

                else if (itemPosition == 23) {
                    hanuman = new Intent(explore_delhi.this, Rasi.class);
                    startActivity(hanuman);
                }

                else if (itemPosition == 24) {
                    nehru = new Intent(explore_delhi.this, Nehi.class);
                    startActivity(nehru);
                }


            }

        });

    }




}
