package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registrarse2Pago extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse2_pago);
    }

    public void yaregistrado(View view) {
        Intent usuarioregistrado = new Intent(this, InicioSesion.class);
        startActivity(usuarioregistrado);
    }

}