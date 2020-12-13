package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class creartrampas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creartrampas);

    }

    public void volver(View view) {
        Intent volverMenu = new Intent(this, menu_conseguir_alimentos.class);
        startActivity(volverMenu);
    }

}