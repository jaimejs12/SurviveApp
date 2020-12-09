package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Llamar extends AppCompatActivity {

    private Button boton;
    private final int TEL_COD = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_llamar);

        boton = (Button) findViewById(R.id.botonllamar);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String tel="617564260";
                //startActivity(new Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:" + tel)));

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:603647467"));

                if (ActivityCompat.checkSelfPermission(Llamar.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);


            }

            //public void onClickLlamada(View v) {
            //    Intent i = new Intent(android.content.Intent.ACTION_CALL,
            //            Uri.parse("tel:617564260"));
            //    startActivity(i);
            //}




        });
    }
}
