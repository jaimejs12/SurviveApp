package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComoOrientarseEstrellas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_orientarse_estrellas);
    }
    public void volver(View view) {
        Intent estrellas = new Intent(this, ComoOrientarse.class);
        startActivity(estrellas);
    }

}