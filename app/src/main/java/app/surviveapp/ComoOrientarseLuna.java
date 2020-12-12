package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComoOrientarseLuna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_orientarse_luna);
    }

    public void volver(View view) {
        Intent luna = new Intent(this, ComoOrientarse.class);
        startActivity(luna);
    }
}