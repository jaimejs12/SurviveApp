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

    public void Silbato(View view) {
        Intent silbato = new Intent(this, Silbato.class);
        startActivity(silbato);
    }

    public void Luces(View view) {
        Intent silbato = new Intent(this, luces.class);
        startActivity(silbato);
    }

    public void Linterna(View view) {
        Intent linterna = new Intent(this, linterna.class);
        startActivity(linterna);
    }

}