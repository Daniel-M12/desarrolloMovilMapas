package com.daniel.mapa1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMonterrico;

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
            startActivity(intent);
        });
    }
}