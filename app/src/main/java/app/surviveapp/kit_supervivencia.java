package app.surviveapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class kit_supervivencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articulo_agua);
    }

    public void volver(View view) {
        Intent volver = new Intent(this, guia_y_manual.class);
        startActivity(volver);
    }
}
