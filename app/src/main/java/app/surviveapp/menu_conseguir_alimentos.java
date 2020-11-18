package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class menu_conseguir_alimentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_conseguir_alimentos);
    }

    public void queComer(View view) {
        Intent queComer = new Intent(this, que_comer.class);
        startActivity(queComer);
    }

}