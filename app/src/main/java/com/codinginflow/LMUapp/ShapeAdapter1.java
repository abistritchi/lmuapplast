package com.codinginflow.LMUapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ShapeAdapter1 extends ArrayAdapter<Shape1>
{

    public ShapeAdapter1(Context context, int resource, List<Shape1> shapeList1)
    {
        super(context,resource,shapeList1);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        Shape1 shape1 = getItem(position);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.shape1_cell, parent, false);
        }
        TextView tv = (TextView) convertView.findViewById(R.id.shape1Name);
        TextView iv = (TextView) convertView.findViewById(R.id.shape1Image);
        TextView adresse = (TextView) convertView.findViewById(R.id.shape1adresse);

        tv.setText(shape1.getName1());
        iv.setText(shape1.getZeit());
        adresse.setText(shape1.getAdresse());


        return convertView;
    }
}
