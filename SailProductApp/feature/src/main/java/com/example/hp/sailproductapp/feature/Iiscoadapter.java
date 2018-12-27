package com.example.hp.sailproductapp.feature;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Iiscoadapter extends ArrayAdapter{
    List list=new ArrayList();


    public Iiscoadapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public void add(Iiscocontents object){
        super.add(object);
        list.add(object);



    }
    public int getCount(){

        return list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        row=convertView;
        Contentholder contentholder;


        if(row==null){
            LayoutInflater layoutInflater=(LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row=layoutInflater.inflate(R.layout.iisco_row,parent,false);
            contentholder=new Contentholder();
            contentholder.tx_name = (TextView) row.findViewById(R.id.tx_name);
            contentholder.tx_name1 =(TextView) row.findViewById(R.id.tx_name1);
            contentholder.tx_name2=(TextView) row.findViewById(R.id.tx_name2);
            contentholder.tx_name3= (TextView) row.findViewById(R.id.tx_name3);
            contentholder.tx_name4 = (TextView) row.findViewById(R.id.tx_name4);
            contentholder.tx_name5 =(TextView) row.findViewById(R.id.tx_name5);
            contentholder.tx_name6=(TextView) row.findViewById(R.id.tx_name6);
            contentholder.tx_name7= (TextView) row.findViewById(R.id.tx_name7);
            contentholder.tx_name8=(TextView) row.findViewById(R.id.tx_name8);
            contentholder.tx_name9=(TextView) row.findViewById(R.id.tx_name9);
            contentholder.tx_name10 = (TextView) row.findViewById(R.id.tx_name10);
            contentholder.tx_name11 =(TextView) row.findViewById(R.id.tx_name11);
            contentholder.tx_name12=(TextView) row.findViewById(R.id.tx_name12);
            contentholder.tx_name13= (TextView) row.findViewById(R.id.tx_name13);
            contentholder.tx_name14 = (TextView) row.findViewById(R.id.tx_name14);
            contentholder.tx_name15 =(TextView) row.findViewById(R.id.tx_name15);
            contentholder.tx_name16=(TextView) row.findViewById(R.id.tx_name16);
            contentholder.tx_name17= (TextView) row.findViewById(R.id.tx_name17);
            contentholder.tx_name18=(TextView) row.findViewById(R.id.tx_name18);
            contentholder.tx_name19=(TextView) row.findViewById(R.id.tx_name19);
            contentholder.tx_name20 = (TextView) row.findViewById(R.id.tx_name20);
            contentholder.tx_name21 =(TextView) row.findViewById(R.id.tx_name21);
            contentholder.tx_name22=(TextView) row.findViewById(R.id.tx_name22);
            contentholder.tx_name23= (TextView) row.findViewById(R.id.tx_name23);
            contentholder.tx_name24 = (TextView) row.findViewById(R.id.tx_name24);
            contentholder.tx_name25 =(TextView) row.findViewById(R.id.tx_name25);
            contentholder.tx_name26=(TextView) row.findViewById(R.id.tx_name26);
            contentholder.tx_name27= (TextView) row.findViewById(R.id.tx_name27);
            contentholder.tx_name28=(TextView) row.findViewById(R.id.tx_name28);
            contentholder.tx_name29=(TextView) row.findViewById(R.id.tx_name29);
            contentholder.tx_name30= (TextView) row.findViewById(R.id.tx_name30);
            contentholder.tx_name31=(TextView) row.findViewById(R.id.tx_name31);
            contentholder.tx_name32=(TextView) row.findViewById(R.id.tx_name32);





            row.setTag(contentholder);
        }
        else {
            contentholder=(Contentholder) row.getTag();
        }

        Iiscocontents contents=(Iiscocontents) this.getItem(position);
        contentholder.tx_name.setText(contents.getCategory());
        contentholder.tx_name1.setText(contents.getGrade());
        //   contentholder.tx_name2.setText(bokarocontents.getC_min());
        contentholder.tx_name2.setText(contents.getC_Min());
        //   contentholder.tx_name3.setText(bokarocontents.getS_Min());
        contentholder.tx_name3.setText(contents.getC_Max());
        contentholder.tx_name4.setText(contents.getS_Min());
        contentholder.tx_name5.setText(contents.getS_Max());
        contentholder.tx_name6.setText(contents.getP_Min());
        contentholder.tx_name7.setText(contents.getP_Max());
        contentholder.tx_name8.setText(contents.getSP_Max());
        contentholder.tx_name9.setText(contents.getMn_Min());
        contentholder.tx_name10.setText(contents.getMn_Max());
        contentholder.tx_name11.setText(contents.getSi_Min());
        //   contentholder.tx_name2.setText(bokarocontents.getC_min());
        contentholder.tx_name12.setText(contents.getSi_Max());
        //   contentholder.tx_name3.setText(bokarocontents.getS_Min());
        contentholder.tx_name13.setText(contents.getCr_Min());
        contentholder.tx_name14.setText(contents.getCr_Max());
        contentholder.tx_name15.setText(contents.getV_Min());
        contentholder.tx_name16.setText(contents.getV_Max());
        contentholder.tx_name17.setText(contents.getPb_Min());
        contentholder.tx_name18.setText(contents.getPb_Max());
        contentholder.tx_name19.setText(contents.getMo_Min());
        contentholder.tx_name20.setText(contents.getMo_Max());
        //   contentholder.tx_name2.setText(bokarocontents.getC_min());
        contentholder.tx_name21.setText(contents.getAl_Max());
        //   contentholder.tx_name3.setText(bokarocontents.getS_Min());
        contentholder.tx_name22.setText(contents.getAl_Min());
        contentholder.tx_name23.setText(contents.getB_Min());

        contentholder.tx_name24.setText(contents.getB_Max());
        //   contentholder.tx_name3.setText(bokarocontents.getS_Min());
        contentholder.tx_name25.setText(contents.getTi_Max());
        contentholder.tx_name26.setText(contents.getCu_Min());

        contentholder.tx_name27.setText(contents.getCu_Max());
        contentholder.tx_name28.setText(contents.getCE_Max());
        contentholder.tx_name29.setText(contents.getMAE());
        contentholder.tx_name30.setText(contents.getNi_Min());
        contentholder.tx_name31.setText(contents.getNi_Max());
        contentholder.tx_name32.setText(contents.getNb_Max());





        return row;
    }

    static class Contentholder{
        TextView tx_name;
        TextView tx_name1;
        TextView tx_name2;
        TextView tx_name3;
        TextView tx_name4;
        TextView tx_name5;
        TextView tx_name7;
        TextView tx_name8;
        TextView tx_name9;
        TextView tx_name6;
        TextView tx_name10;
        TextView tx_name11;
        TextView tx_name12;
        TextView tx_name13;
        TextView tx_name14;
        TextView tx_name15;
        TextView tx_name17;
        TextView tx_name18;
        TextView tx_name19;
        TextView tx_name16;
        TextView tx_name20;
        TextView tx_name21;
        TextView tx_name22;
        TextView tx_name23;
        TextView tx_name24;
        TextView tx_name25;
        TextView tx_name27;
        TextView tx_name28;
        TextView tx_name29;
        TextView tx_name26;
        TextView tx_name30;
        TextView tx_name31;
        TextView tx_name32;





    }


}

