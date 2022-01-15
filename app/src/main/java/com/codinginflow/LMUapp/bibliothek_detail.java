package com.codinginflow.LMUapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bibliothek_detail extends AppCompatActivity
{
    Shape selectedShape;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bibliothek_detail);
        getSelectedShape();
        setValues();

    }

    private void getSelectedShape()
    {
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedShape = BibliothekAlgemain.shapeList.get(Integer.valueOf(parsedStringID));
    }

    private void setValues()
    {
        TextView tv = (TextView) findViewById(R.id.shapeName);
        ImageView iv = (ImageView) findViewById(R.id.shapeImage);

        tv.setText(selectedShape.getName());
        iv.setImageResource(selectedShape.getImage());
    }
}