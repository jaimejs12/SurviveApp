package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Silbato extends AppCompatActivity {

    MediaPlayer mp;
    MediaPlayer mp2;
    Button button;
    Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silbato);

        button = (Button)findViewById(R.id.button);
        button4 = (Button)findViewById(R.id.button4);
        mp = MediaPlayer.create(this, R.raw.dogwhistle);
        mp2 = MediaPlayer.create(this, R.raw.silbatonormal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
    }

}