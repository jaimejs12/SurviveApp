package app.surviveapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class articulo_fuego extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo_fuego);
    }

    public void volver(View view) {
        Intent volver = new Intent(this, Tecnicas_supervivencia.class);
        startActivity(volver);
    }
}
