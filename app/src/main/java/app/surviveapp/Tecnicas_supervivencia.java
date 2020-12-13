package app.surviveapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Tecnicas_supervivencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecnicas_supervivencia);
    }

    public void PantallaRefugio(View view) {
        Intent sigpantalla = new Intent(this, articulo_refugio.class);
        startActivity(sigpantalla);
    }

    public void PantallaFuego(View view) {
        Intent sigpantalla1 = new Intent(this, articulo_fuego.class);
        startActivity(sigpantalla1);
    }

    public void PantallaAgua(View view) {
        Intent sigpantalla2 = new Intent(this, articulo_agua.class);
        startActivity(sigpantalla2);
    }

    public void PantallaRescate(View view) {
        Intent sigpantalla3 = new Intent(this, articulo_rescate.class);
        startActivity(sigpantalla3);
    }

    public void PantallaFrio(View view) {
        Intent sigpantalla4 = new Intent(this, articulo_frio.class);
        startActivity(sigpantalla4);
    }

    public void PantallaCalor(View view) {
        Intent sigpantalla5 = new Intent(this, articulo_calor.class);
        startActivity(sigpantalla5);
    }

    public void volver(View view) {
        Intent volver = new Intent(this, guia_y_manual.class);
        startActivity(volver);
    }
}
