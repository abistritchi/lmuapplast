package com.codinginflow.LMUapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class BibliothekAlgemain extends AppCompatActivity implements OnMapReadyCallback {

    public static ArrayList<Shape> shapeList = new ArrayList<Shape>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biblothek_algemain);
        setUpOnclickListener1();
    }


    private void setUpOnclickListener1()
    {

        //Get a place at the bibliothek
        final Button registration = findViewById(R.id.bibliothek_platz_regiestrierung2);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Shape selectShape = (Shape) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), bibliothek_registrierung.class);
                //showDetail.putExtra("id",selectShape.getId());
                startActivity(showDetail);
            }
        });


        final Button opac = findViewById(R.id.opac_bibliothek);
        opac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Shape selectShape = (Shape) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), opac.class);
                //showDetail.putExtra("id",selectShape.getId());
                startActivity(showDetail);
            }
        });
    }


    // Get a handle to the GoogleMap object and display marker.
    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));
    }
}