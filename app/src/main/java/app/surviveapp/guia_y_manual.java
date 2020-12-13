package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class guia_y_manual extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guia_y_manual);
    }

    public void volver(View view) {
        Intent sol = new Intent(this, MainActivity.class);
        startActivity(sol);
    }

    public void PantallaTecnicas(View view) {
        Intent sigpantalla = new Intent(this, Tecnicas_supervivencia.class);
        startActivity(sigpantalla);
    }

    public void PantallaOrientarse(View view) {
        Intent sigpantalla = new Intent(this, ComoOrientarse.class);
        startActivity(sigpantalla);
    }

    public void PantallaAlimentos(View view) {
        Intent sigpantalla = new Intent(this, menu_conseguir_alimentos.class);
        startActivity(sigpantalla);
    }

    public void PantallaKit(View view) {
        Intent sigpantalla = new Intent(this, menu_conseguir_alimentos.class);
        startActivity(sigpantalla); //CAMBIARRR
    }

    public void PantallaAccidentes(View view) {
        Intent sigpantalla = new Intent(this, AfrontarAccidentes.class);
        startActivity(sigpantalla);
    }

    public void PantallaHeridas(View view) {
        Intent sigpantalla = new Intent(this, curar_heridas.class);
        startActivity(sigpantalla);
    }
}