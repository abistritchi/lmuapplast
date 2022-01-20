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

        setupData();
        setUpList1();
        setUpOnclickListener1();
        

        // Get a handle to the fragment and register the callback.
        //SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
        //        .findFragmentById(R.id.map);
        //mapFragment.getMapAsync(this);







    }

    private void setupData()
    {

        shapeList.clear();
        Shape circle = new Shape("0", "Bibliothek 1", R.drawable.news1);
        shapeList.add(circle);

        Shape triangle = new Shape("1","Bibliothek 2", R.drawable.news3);
        shapeList.add(triangle);

        Shape square = new Shape("2","Bibliothek 3", R.drawable.news2);
        shapeList.add(square);

        Shape rectangle = new Shape("3","Bibliothek 4", R.drawable.news2);
        shapeList.add(rectangle);

        Shape octagon = new Shape("4","Bibliothek 5", R.drawable.news2);
        shapeList.add(octagon);

        Shape circle2 = new Shape("5", "Bibliothek 6", R.drawable.news1);
        shapeList.add(circle2);

        Shape triangle2 = new Shape("6","Bibliothek 7", R.drawable.news3);
        shapeList.add(triangle2);

        Shape square2 = new Shape("7","Bibliothek 8", R.drawable.news2);
        shapeList.add(square2);

        Shape rectangle2 = new Shape("8","Bibliothek 9", R.drawable.news2);
        shapeList.add(rectangle2);

        Shape octagon2 = new Shape("9","Bibliothek 10", R.drawable.news2);
        shapeList.add(octagon2);
    }

    private void setUpList1()
    {
        listView = (ListView) findViewById(R.id.shapesListView1);

        ShapeAdapter adapter = new ShapeAdapter(getApplicationContext(), 0, shapeList);
        listView.setAdapter(adapter);
    }

    private void setUpOnclickListener1()
    {
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Shape selectShape = (Shape) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), DetailActivity.class);
                showDetail.putExtra("id",selectShape.getId());
                startActivity(showDetail);
            }
        });

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