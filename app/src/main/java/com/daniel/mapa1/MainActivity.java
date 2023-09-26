package com.daniel.mapa1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMonterrico, btnSanIsidro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();
    }

    private void asignarReferencias() {
        btnMonterrico = findViewById(R.id.btnMonterrico);
        btnMonterrico.setOnClickListener(view -> {
            Intent intent = new Intent(this, MapaActivity.class);
            intent.putExtra("pLatitud","-12.104102");
            intent.putExtra("pLongitud","-76.963422");
            intent.putExtra("pTitulo", "UPC - Monterrico");
            startActivity(intent);
        });

        btnSanIsidro = findViewById(R.id.btnSanIsidro);
        btnSanIsidro.setOnClickListener(view -> {
            Intent intent = new Intent(this, MapaActivity.class);
            intent.putExtra("pLatitud","-12.0874512");
            intent.putExtra("pLongitud","-77.0525224");
            intent.putExtra("pTitulo", "UPC - San Isidro");
            startActivity(intent);
        });
    }
}