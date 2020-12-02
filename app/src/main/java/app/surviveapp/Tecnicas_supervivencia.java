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
        Intent sigpantalla = new Intent(this, articulo_fuego.class);
        startActivity(sigpantalla);
    }

    public void PantallaAgua(View view) {
        Intent sigpantalla = new Intent(this, articulo_agua.class);
        startActivity(sigpantalla);
    }

    public void PantallaRescate(View view) {
        Intent sigpantalla = new Intent(this, articulo_rescate.class);
        startActivity(sigpantalla);
    }

    public void PantallaFrio(View view) {
        Intent sigpantalla = new Intent(this, Tecnicas_supervivencia.class);
        startActivity(sigpantalla);
    }

    public void PantallaCalor(View view) {
        Intent sigpantalla = new Intent(this, Tecnicas_supervivencia.class);
        startActivity(sigpantalla);
    }
}
