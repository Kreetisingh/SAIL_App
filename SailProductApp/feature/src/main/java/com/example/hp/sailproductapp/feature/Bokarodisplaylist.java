package com.example.hp.sailproductapp.feature;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Bokarodisplaylist extends AppCompatActivity {
    String jsondata;
    JSONObject jsonObject;
    JSONArray jsonArray;
    Bokaroadapter contactAdapter;
    ListView listbokaro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bokarodisplaylist);
        listbokaro =(ListView)findViewById(R.id.listbokaro);

        contactAdapter=new Bokaroadapter(this,R.layout.bokaro_row);
        listbokaro.setAdapter(contactAdapter);
        jsondata=getIntent().getExtras().getString("json_data");
        try {
            jsonObject=new JSONObject(jsondata);
            jsonArray =jsonObject.getJSONArray("steel");
            String Category,Grade,C_Min,C_Max,S_Min,S_Max,P_Min,P_Max,SP_Max,Mn_Min,Mn_Max,Si_Min,Si_Max,Cr_Min,Cr_Max,V_Min,V_Max,Pb_Min,Pb_Max,Mo_Min,Mo_Max,Al_Min,Al_Max,B_Min,B_Max,Ti_Max,Cu_Min,Cu_Max,CE_Max,MAE,Ni_Min,Ni_Max,Nb_Max;

            int count=0;
            while (count<jsonArray.length()){
                JSONObject jsonob=jsonArray.getJSONObject(count);
                Category=jsonob.getString("Category");
                Category=jsonob.getString("Category");
                Grade=jsonob.getString("Grade");
                C_Min=jsonob.getString("C_Min");
                C_Max=jsonob.getString("C_Max");
                S_Min=jsonob.getString("S_Min");
                S_Max=jsonob.getString("S_Max");
                P_Min=jsonob.getString("P_Max");
                P_Max=jsonob.getString("P_Max");
                SP_Max=jsonob.getString("SP_Max");
                Mn_Min=jsonob.getString("Mn_Min");
                Mn_Max=jsonob.getString("Mn_Max");
                Si_Min=jsonob.getString("Si_Min");
                Si_Max=jsonob.getString("Si_Max");
                Cr_Min=jsonob.getString("Cr_Min");
                Cr_Max=jsonob.getString("Cr_Max");
                V_Min=jsonob.getString("V_Min");
                V_Max=jsonob.getString("V_Max");
                Pb_Min=jsonob.getString("Pb_Min");
                Pb_Max=jsonob.getString("Pb_Max");
                Mo_Min=jsonob.getString("Mo_Min");
                Mo_Max=jsonob.getString("Mo_Max");
                B_Min=jsonob.getString("B_Min");
                B_Max=jsonob.getString("B_Max");
                Ti_Max=jsonob.getString("Ti_Max");
                Cu_Min=jsonob.getString("Cu_Min");
                Cu_Max=jsonob.getString("Cu_Max");

                CE_Max=jsonob.getString("CE_Max");
                MAE=jsonob.getString("MAE");

                Ni_Min=jsonob.getString("Ni_Min");
                Ni_Max=jsonob.getString("Ni_Max");
                Nb_Max=jsonob.getString("Nb_Max");

                Al_Min=jsonob.getString("Al_Min");
                Al_Max=jsonob.getString("Al_Max");








                //description=jsonob.getString("description");
                Bokarocontents bokarocontents=new Bokarocontents(Category,Grade,C_Min,C_Max,S_Min,S_Max,P_Min,P_Max,SP_Max,Mn_Min,Mn_Max,Si_Min,Si_Max,Cr_Min,Cr_Max,V_Min,V_Max,Pb_Min,Pb_Max,Mo_Min,Mo_Max,Al_Min,Al_Max,B_Min,B_Max,Ti_Max,Cu_Min,Cu_Max,CE_Max,MAE,Ni_Min,Ni_Max,Nb_Max);
                contactAdapter.add(bokarocontents);

                count++;

            }










        } catch (JSONException e) {
            e.printStackTrace();
        }























    }














}
