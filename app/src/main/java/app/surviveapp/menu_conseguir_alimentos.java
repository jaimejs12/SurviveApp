package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_conseguir_alimentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_conseguir_alimentos);
    }

    public void queComer(View view) {
        Intent queComer = new Intent(this, que_comer.class);
        startActivity(queComer);
    }

    public void pescaycaza(View view) {
        Intent pescayCaza = new Intent(this, pescaycaza.class);
        startActivity(pescayCaza);
    }

    public void Trampas(View view) {
        Intent trampas = new Intent(this, creartrampas.class);
        startActivity(trampas);
    }

    public void volver(View view) {
        Intent volver = new Intent(this, guia_y_manual.class);
        startActivity(volver);
    }

}