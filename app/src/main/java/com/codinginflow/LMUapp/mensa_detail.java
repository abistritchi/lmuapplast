package com.codinginflow.LMUapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class mensa_detail extends AppCompatActivity
{
    Shape1 selectedShape1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensa_detail);
        getSelectedShape1();
        setValues1();

    }

    private void getSelectedShape1()
    {
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedShape1 = MensaAlgemain.shapeList1.get(Integer.valueOf(parsedStringID));
    }

    private void setValues1()
    {
        TextView tv1 = (TextView) findViewById(R.id.shapeName1);
        TextView iv1 = (TextView) findViewById(R.id.shape1Image);
        TextView adresse = (TextView) findViewById(R.id.mensa_adresse);

        tv1.setText(selectedShape1.getName1());
        iv1.setText(selectedShape1.getZeit());
        adresse.setText(selectedShape1.getAdresse());
    }
}