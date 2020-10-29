package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GuiayManual(View view) {
        Intent guiaymanual = new Intent(this, guia_y_manual.class);
        startActivity(guiaymanual);
    }

    public void Herramientas(View view) {
        Intent herramientas = new Intent(this, herramientas.class);
        startActivity(herramientas);
    }

}