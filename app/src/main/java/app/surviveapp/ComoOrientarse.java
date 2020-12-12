package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComoOrientarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_orientarse);
    }

    public void orientarsesol(View view) {
        Intent sol = new Intent(this, ComoOrientarseSol.class);
        startActivity(sol);
    }

    public void orientarseluna(View view) {
        Intent luna = new Intent(this, ComoOrientarseLuna.class);
        startActivity(luna);
    }

    public void orientarseestrellas(View view) {
        Intent estrellas = new Intent(this, ComoOrientarseEstrellas.class);
        startActivity(estrellas);
    }

    public void orientarsesignos(View view) {
        Intent signos = new Intent(this, ComoOrientarseSignos.class);
        startActivity(signos);
    }

    public void volver(View view) {
        Intent volver = new Intent(this, guia_y_manual.class);
        startActivity(volver);
    }


}