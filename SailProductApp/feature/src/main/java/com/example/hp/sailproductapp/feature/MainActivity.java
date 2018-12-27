package com.example.hp.sailproductapp.feature;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Intent intent;

    public void backmain(View view){
        Intent intent=new Intent(getApplicationContext(),Frontscreen.class);
        startActivity(intent);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView logoimageView=(ImageView)findViewById(R.id.logoimageView);
        logoimageView.setImageResource(R.drawable.sailp);

        final ListView majorunit=(ListView)findViewById(R.id.majorunit);

        ArrayList<String>sailmajorunits=new ArrayList<String>();
        sailmajorunits.add("Bhilai Steel Plant (BSP)\n");
        sailmajorunits.add("Bokaro Steel Plant (BSL)\n");
        sailmajorunits.add("Durgapur Steel Plant (DSP)\n");
        sailmajorunits.add("IISCO Steel Plant (ISP)\n");
        sailmajorunits.add("Rourkela Steel Plant (RSP)\n");

        ArrayAdapter<String>arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sailmajorunits);
        majorunit.setAdapter(arrayAdapter);
        majorunit.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                    intent = new Intent(getApplicationContext(), Bspmain_activity.class);
                    startActivity(intent);
                }
                else if(position==1){
                    intent = new Intent(getApplicationContext(), BokaroActivity.class);
                    startActivity(intent);
                }
                else if(position==2){
                    intent = new Intent(getApplicationContext(), Durgapurmain_Activity.class);
                    startActivity(intent);
                }
                else if(position==3){
                    intent = new Intent(getApplicationContext(), IiscoActivity.class);
                    startActivity(intent);
                }
                else if(position==4){
                    intent = new Intent(getApplicationContext(), Rourkela_Activity.class);
                    startActivity(intent);
                }









            }
        });









    }
}
