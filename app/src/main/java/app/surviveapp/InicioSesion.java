package app.surviveapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import android.view.View;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class InicioSesion extends AppCompatActivity {
 /*
    private WebView webView;
    // CONNECTION_TIMEOUT and READ_TIMEOUT are in milliseconds
    public static final int CONNECTION_TIMEOUT=10000;
    public static final int READ_TIMEOUT=20000;
    private EditText etEmail;
    private EditText etPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);

        etEmail = (EditText) findViewById(R.id.email);
        etPassword = (EditText) findViewById(R.id.password);

        webView =(WebView) findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.surviveapp.com");
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
        if(s.equals("https://192.168.0.173/iniciocorrecto.php")) {
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

        // Get Reference to variables

    // Triggers when LOGIN Button clicked
    public void checkLogin(View arg0) {
        // Get text from email and passord field
        final String email = etEmail.getText().toString();
        final String password = etPassword.getText().toString();
        // Initialize  AsyncLogin() class with email and password
        new AsyncLogin().execute(email,password);
    }
    private class AsyncLogin extends AsyncTask<String, String, String>
    {
        ProgressDialog pdLoading = new ProgressDialog(InicioSesion.this);
        HttpURLConnection conn;
        URL url = null;
        @Override
        protected void onPreExecute() {
            super.onPreExecute(); // Invoked on the UI thread before the task is executed
            //this method will be running on UI thread
            pdLoading.setMessage("\tLoading...");
            pdLoading.setCancelable(false);
            pdLoading.show();
        }
        @Override  //REVISAR LOS PARAMETROS
        protected String doInBackground(String... params) { // Invoked on the background thread immediately after
            try {                                   // params son todos los args que le metas

                // Enter URL address where your php file resides
                url = new URL("http://192.168.1.42/login.inc.php");  // URL del servidor nuestro

            } catch (MalformedURLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return "exception";
            }
            try {
                // Setup HttpURLConnection class to send and receive data from php and mysql
                conn = (HttpURLConnection)url.openConnection();
                conn.setReadTimeout(READ_TIMEOUT);
                conn.setConnectTimeout(CONNECTION_TIMEOUT);
                conn.setRequestMethod("POST");

                // setDoInput and setDoOutput method depict handling of both send and receive
                conn.setDoInput(true);
                conn.setDoOutput(true);
                // Append parameters to URL
                Uri.Builder builder = new Uri.Builder()
                        .appendQueryParameter("username", params[0]) //usuario (hay que pasarselo en los parametros)
                        .appendQueryParameter("password", params[1]);  //password  (para darselos a la bbdd)
                String query = builder.build().getEncodedQuery();
                // Open connection for sending data
                OutputStream os = conn.getOutputStream();
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(os, "UTF-8"));
                writer.write(query);
                writer.flush();
                writer.close();
                os.close();
                conn.connect();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
                return "exception";
            }
            try {
                int response_code = conn.getResponseCode();
                // Check if successful connection made
                if (response_code == HttpURLConnection.HTTP_OK) {

                    // Read data sent from server
                    InputStream input = conn.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                    StringBuilder result = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        result.append(line);
                    }
                    // Pass data to onPostExecute method (nos devuelve los datos de la bbdd)
                    return(result.toString());
                }else{ //error
                    return("unsuccessful");
                }
            } catch (IOException e) {
                e.printStackTrace();
                return "exception";
            } finally {
                conn.disconnect();
            }
        }
        @Override
        protected void onPostExecute(String result) { // invoked on the UI thread after the background computation finishes.
            // Here we are checking for recieved result.
            //this method will be running on UI thread
            pdLoading.dismiss();
            if(result.equalsIgnoreCase("true"))
            {
                Intent intent = new Intent(InicioSesion.this, MainActivity.class); //Inicio sesion -> siguiente pantalla
                startActivity(intent);
                InicioSesion.this.finish();
            }else if (result.equalsIgnoreCase("false")){
                // If username and password does not match display a error message
                Toast.makeText(InicioSesion.this, "Invalid name or password", Toast.LENGTH_LONG).show();
            } else if (result.equalsIgnoreCase("exception") || result.equalsIgnoreCase("unsuccessful")) {
                Toast.makeText(InicioSesion.this, "OOPs! Something went wrong. Connection Problem.", Toast.LENGTH_LONG).show();
            }
        }
    }
 */
}