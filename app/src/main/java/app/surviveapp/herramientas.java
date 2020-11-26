package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class herramientas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas);
    }

    public void Geolocalizacion(View view) {
        Intent geo = new Intent(this, linterna.class);
        startActivity(geo);
    }

    public void Brujula(View view) {
        Intent bru = new Intent(this, linterna.class);
        startActivity(bru);
    }

    public void Emergencias(View view) {
        Intent eme = new Intent(this, linterna.class);
        startActivity(eme);
    }

    public void Clima(View view) {
        Intent clim = new Intent(this, Clima.class);
        startActivity(clim);
    }

    public void Silbato(View view) {
        Intent silbato = new Intent(this, Silbato.class);
        startActivity(silbato);
    }

    public void Luces(View view) {
        Intent luz = new Intent(this, luces.class);
        startActivity(luz);
    }

    public void Linterna(View view) {
        Intent linterna = new Intent(this, linterna.class);
        startActivity(linterna);
    }

    public void volver(View view) {
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
}