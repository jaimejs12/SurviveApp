package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AfrontarAccidentes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afrontar_accidentes);
    }

    public void volver(View view) {
        Intent accidente = new Intent(this, guia_y_manual.class);
        startActivity(accidente);
    }

}