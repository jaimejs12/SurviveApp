package app.surviveapp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class prueba extends AppCompatActivity {
    MediaPlayer mp2;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silbato);

        button4 = (Button)findViewById(R.id.button4);
        mp2 = MediaPlayer.create(this, R.raw.silbatonormal);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
    }
}

