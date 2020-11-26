package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class InicioSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
    }

    public void Registrar(View view) {
        Intent registrarse = new Intent(this, registrarse.class);
        startActivity(registrarse);
    }

    public void menuprincipal(View view) {
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }



}