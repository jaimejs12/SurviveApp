package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import static android.app.Activity.RESULT_OK;

public class Inicio extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        webView =(WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://surviveapp.clanjhoo.com:4433");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        String s = webView.getUrl();
        if(s.equals("https://surviveapp.clanjhoo.com:4433/iniciocorrecto.php")) {
            Intent main = new Intent(this, MainActivity.class);
            startActivity(main);
        }
    }
}

