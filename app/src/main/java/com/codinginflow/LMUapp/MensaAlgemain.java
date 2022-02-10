package com.codinginflow.LMUapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.support.v4.app.*;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class MensaAlgemain extends AppCompatActivity implements OnMapReadyCallback {

    public static ArrayList<Shape1> shapeList1 = new ArrayList<Shape1>();

    private ListView listView1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mensa_algemain);

        setupData();
        setUpList1();
        setUpOnclickListener1();
        //SupportMapFragment mapFragment = SupportMapFragment.newInstance();
        //getSupportFragmentManager().beginTransaction().add(R.id.mensaAlgemain, mapFragment).commit();


        //SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        //mapFragment.getMapAsync(this);

    }



    private void setupData()
    {

        shapeList1.clear();
        Shape1 mensaLeopoldstrasse = new Shape1("0", "Mensa\n"+"Leopoldstraße", "Öffnungszeiten\n\n" +
                "Mo - Do      11.00 - 14.30\n" +
                "Fr               11.00 - 14.00\n", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_411_-de.html#heute", "Leopoldstr. 13a, 80802 München");
        shapeList1.add(mensaLeopoldstrasse);

        Shape1 mensaArcisstrasse = new Shape1("8","Mensa Arcisstraße", "Öffnungszeiten\n\nMo– Fr\n11.00 – 14.00\n", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_421_-de.html#heute", "Arcisstr. 12, 80333 München");
        shapeList1.add(mensaArcisstrasse);

        Shape1 mensaArcisstrasseBistro = new Shape1("9","StuBistroMensa Arcisstraße", "Öffnungszeiten\n\nMo - Fr\n9.00-16.00", "", "Arcisstr. 17, 80333 München");
        shapeList1.add(mensaArcisstrasseBistro);

        Shape1 mensaGarching = new Shape1("10","Mensa Garching", "Öffnungszeiten\n\nMo - Fr\n11.00 - 14.00", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_422_-de.html#heute", "Boltzmannstraße 19, 85748 Garching");
        shapeList1.add(mensaGarching);

        Shape1 mensaLotch = new Shape1("11","Mensa Lothstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 - 14.00", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_431_-de.html#heute", "Lothstr. 13d, 80335 München");
        shapeList1.add(mensaLotch);

        Shape1 mensaMartinsried = new Shape1("12","Mensa Martinsried", "Öffnungszeiten\n\nMo - Fr\n11.00 - 14.00", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_412_-de.html#heute", "Großhaderner Str. 6 , 82152 Planegg-Martinsried");
        shapeList1.add(mensaMartinsried);

        Shape1 mensaPasing = new Shape1("13","Mensa Pasing ", "Öffnungszeiten\n\nMo - Fr\n11.00 - 14.00", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_432_-de.html#heute", "Am Stadtpark 20, 81243 München");
        shapeList1.add(mensaPasing);

        Shape1 mensaWeihenstephan = new Shape1("14","Mensa Weihenstephan", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_423_-de.html#heute", "Maximus-von-Imhof-Forum 5, 85354 Freising");
        shapeList1.add(mensaWeihenstephan);

        Shape1 bistroAkademiestrase = new Shape1("16","StuBistro Akademiestraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 14.00", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_455_-de.html#heute", "Akademiestraße 2-4, 80799 München");
        shapeList1.add(bistroAkademiestrase);

        Shape1 bistroArsis = new Shape1("15","StuBistro Arcisstraße 12", "Öffnungszeiten\n\nMo - Fr\n11.00 – 14.00", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_450_-de.html#heute", "Arcisstraße 12");
        shapeList1.add(bistroArsis);

        Shape1 bistroBenediktbeuern = new Shape1("17","Benediktbeuern", "Öffnungszeiten\n\nMo - Fr\n11.30 – 14.00", "https://www.studentenwerk-muenchen.de/mensaria-benediktbeuren/", "Don-Bosco-Str. 3–5, Benediktbeuern");
        shapeList1.add(bistroBenediktbeuern);

        Shape1 bistroButenandstrase = new Shape1("18","StuBistro Butenandstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_414_-de.html#heute", "Butenandtstraße 13, Gebäude F, München");
        shapeList1.add(bistroButenandstrase);


        Shape1 bistroConollystra = new Shape1("19","StuBistro Conollystraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/stucafe-olympiapark/", "Conollystraße 32, 80809 München");
        shapeList1.add(bistroConollystra);

        Shape1 bistroGoethestrase = new Shape1("15","StuBistro Goethestraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_418_-de.html#heute", "Goethestraße 70, München");
        shapeList1.add(bistroGoethestrase);


        Shape1 bistroMartinsried = new Shape1("15","StuBistroMensa Martinsried", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_415_-de.html#heute", "Großhaderner Str. 9 a, Planegg-Martinsried ");
        shapeList1.add(bistroMartinsried);


        Shape1 bistroOettingenstrase = new Shape1("15","StuBistro Oettingenstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_424_-de.html#heute", "Oettingenstraße 67, München ");
        shapeList1.add(bistroOettingenstrase);


        Shape1 bistroRosenheim = new Shape1("15","StuBistro Rosenheim", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_441_-de.html#heute", "Hochschulstraße 1, Rosenheim ");
        shapeList1.add(bistroRosenheim);


        Shape1 bistroSchillerstrase = new Shape1("15","StuBistro Schillerstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/stubistro-schillerstrasse/", "Schillerstraße 47 ");
        shapeList1.add(bistroSchillerstrase);


        Shape1 cafeAdalbertstrase = new Shape1("15","StuCafe Adalbertstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_512_-de.html", "Adalbertstr. 5, 80799 München");
        shapeList1.add(cafeAdalbertstrase);


        Shape1 cafeArcisstrase = new Shape1("15","StuCafé Arcisstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "", "Arcisstr. 21, 80333 München");
        shapeList1.add(cafeArcisstrase);


        Shape1 cafeBoltzmannstr = new Shape1("15","StuCafé Boltzmannstr. 15", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_527_-de.html#heute", "Boltzmannstraße 15, Garching");
        shapeList1.add(cafeBoltzmannstr);


        Shape1 cafeBoltzmannstrasse = new Shape1("15","StuCafe Adalbertstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_524_-de.html#heute", "Boltzmannstraße 19, Garching");
        shapeList1.add(cafeBoltzmannstrasse);


        Shape1 cafeHas = new Shape1("15","StuCafé Heßstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "", "Lothstraße 64, 80335 München");
        shapeList1.add(cafeHas);



        Shape1 cafeKarlstrase = new Shape1("15","StuCafé Karlstraße", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_532_-de.html#heute", "Karlstraße 6, Gebäude F, München ");
        shapeList1.add(cafeKarlstrase);


        Shape1 cafeLeopold = new Shape1("15","StuCafé Leopoldstraße", "Öffnungszeiten\n\nMo - Fr\n8.30 – 16.00", "", "Leopoldstraße 13, 80802 München");
        shapeList1.add(cafeLeopold);



        Shape1 cafeWeihenstephan = new Shape1("15","StuCafé Weihenstephan", "Öffnungszeiten\n\nMo - Fr\n8.30 – 16.00", "", "Maximus-von-Imhof-Forum 5, 85354 Freising");
        shapeList1.add(cafeWeihenstephan);


        Shape1 cafeAkademie = new Shape1("15","StuCafé WST Akademie", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_526_-de.html#heute", "Alte Akademie 1, Freising ");
        shapeList1.add(cafeAkademie);


        Shape1 cafeMaximus = new Shape1("15","StuCafé WST Maximus", "Öffnungszeiten\n\nMo - Fr\n11.00 – 13.30", "https://www.studentenwerk-muenchen.de/mensa/speiseplan/speiseplan_525_-de.html#heute", "Maximus-von-Imhof-Forum 5, Freising");
        shapeList1.add(cafeMaximus);

    }

    private void setUpList1()
    {
        listView1 = (ListView) findViewById(R.id.shapesListView1);
        ShapeAdapter1 adapter = new ShapeAdapter1(getApplicationContext(), 0, shapeList1);
        listView1.setAdapter(adapter);
    }

    private void setUpOnclickListener1()
    {
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Shape1 selectShape = (Shape1) (listView1.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), MensaDetailActivity.class);
                showDetail.putExtra("id",selectShape.getId1());
                startActivity(showDetail);
            }
        });

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));
    }

}