package com.codinginflow.LMUapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity implements OnMapReadyCallback {

    public static ArrayList<Shape> shapeList = new ArrayList<Shape>();

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        setupData();
        setUpList();
        setUpOnclickListener();


        // Get a handle to the fragment and register the callback.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void setupData()
    {
        Shape circle = new Shape("0", "Mensa 1", R.drawable.news1);
        shapeList.add(circle);

        Shape triangle = new Shape("1","Mensa 2", R.drawable.news3);
        shapeList.add(triangle);

        Shape square = new Shape("2","Mensa 3", R.drawable.news2);
        shapeList.add(square);

        Shape rectangle = new Shape("3","Mensa 4", R.drawable.news2);
        shapeList.add(rectangle);

        Shape octagon = new Shape("4","Mensa 5", R.drawable.news2);
        shapeList.add(octagon);

        Shape circle2 = new Shape("5", "Mensa 6", R.drawable.news1);
        shapeList.add(circle2);

        Shape triangle2 = new Shape("6","Mensa 7", R.drawable.news3);
        shapeList.add(triangle2);

        Shape square2 = new Shape("7","Mensa 8", R.drawable.news2);
        shapeList.add(square2);

        Shape rectangle2 = new Shape("8","Mensa 9", R.drawable.news2);
        shapeList.add(rectangle2);

        Shape octagon2 = new Shape("9","Mensa 10", R.drawable.news2);
        shapeList.add(octagon2);
    }

    private void setUpList()
    {
        listView = (ListView) findViewById(R.id.shapesListView);

        ShapeAdapter adapter = new ShapeAdapter(getApplicationContext(), 0, shapeList);
        listView.setAdapter(adapter);
    }

    private void setUpOnclickListener()
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

    }


    // Get a handle to the GoogleMap object and display marker.
    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));
    }
}