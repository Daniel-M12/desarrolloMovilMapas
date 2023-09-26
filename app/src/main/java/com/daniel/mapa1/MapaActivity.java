package com.daniel.mapa1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapaActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    float latitud, longitud;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.mapa);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        mMap.getUiSettings().setZoomControlsEnabled(true);

        recuperarDatos();

        LatLng upc = new LatLng(latitud, longitud);
        mMap.addMarker(new MarkerOptions().position(upc).title(titulo));
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(upc, 17));
    }

    private void recuperarDatos() {
        longitud = Float.parseFloat(getIntent().getStringExtra("pLongitud"));
        latitud = Float.parseFloat(getIntent().getStringExtra("pLatitud"));
        titulo = getIntent().getStringExtra("pTitulo");
    }
}