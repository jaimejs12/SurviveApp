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

    public void aaa(View view) {
        Intent sol = new Intent(this, ComoOrientarse.class);
        startActivity(sol);
    }

    public void PantallaTecnicas(View view) {
        Intent sigpantalla = new Intent(this, Tecnicas_supervivencia.class);
        startActivity(sigpantalla);
    }
}