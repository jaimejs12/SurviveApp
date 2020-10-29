package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import static java.lang.Thread.sleep;

public class luces extends AppCompatActivity {

    Button button3;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luces);

        button3 = (Button)findViewById(R.id.button3);

        Timer timer = new Timer();
        MyTimer myTimer = new MyTimer();
        timer.schedule(myTimer, 500, 500);

    }


    private class MyTimer extends TimerTask {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Random random = new Random();
                    button3.setBackgroundColor(Color.rgb(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
                }
            });
        }
    }
}

