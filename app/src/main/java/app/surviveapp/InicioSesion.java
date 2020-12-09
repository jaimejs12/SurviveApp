package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class InicioSesion extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        webView =(WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://192.168.0.157");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {

    }


    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        String s = webView.getUrl();
        if(s.equals("http://192.168.0.157/iniciocorrecto.php")) {
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        }
    }


    //---------------------------------------
    //   public void Registrar(View view) {
    //       Intent registrarse = new Intent(this, registrarse.class);
    //       startActivity(registrarse);
    //   }

    //  public void menuprincipal(View view) {
    //       Intent menu = new Intent(this, MainActivity.class);
    //       startActivity(menu);
    //   }



}