package com.example.practica_4_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btn);

        btn.setOnClickListener(this);

        Button btn2 = findViewById(R.id.btn2);

        btn2.setOnClickListener(this);

        Button btn4 = findViewById(R.id.btn4);

        btn4.setOnClickListener(this);

        Button btn3 = findViewById(R.id.btn3);

        btn3.setOnClickListener(this);

        Button btn6 = findViewById(R.id.btn6);

        btn6.setOnClickListener(this);

        Button btn8 =findViewById(R.id.btn8);
        btn8.setOnClickListener(this);

        Button btn5 =findViewById(R.id.btn5);
        btn5.setOnClickListener(this);

        Button btn7 =findViewById(R.id.btn7);
        btn7.setOnClickListener(this);
    }




    public void onClick(View view) {
        Button B=(Button) view;

        if (view.getId()==R.id.btn){
            //explicito
            Intent i = new Intent(this, MainActivity2.class);
            startActivity(i);
        }
        if (view.getId()==R.id.btn2){
            // Abrir una página web en el navegador/implicito
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.Google.com"));
            startActivity(intent);
        }
        if (view.getId()== R.id.btn4){
            // hacer llamada telefonica/implicito
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+528712317030"));
            startActivity(intent);
        }
        if (view.getId()==R.id.btn3){
            //explicito
            Intent i = new Intent(this, MainActivity2.class);
            String mensaje = "Hola desde la primera actividad";
            i.putExtra("mensaje", mensaje);
            startActivity(i);
        }
        if(view.getId()==R.id.btn6){
            // Crear un Intent implícito para abrir la cámara
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(intent);
        }
        if(view.getId()==R.id.btn8){
            // Crear un Intent implícito para abrir la ubicación en un mapa
            // se proporcionan las coordenadas (latitud y longitud)
            Uri gmmIntentUri = Uri.parse("geo:25.438755,-101.012273");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            startActivity(mapIntent);
        }
        if(view.getId()==R.id.btn5) {
            // Abrir spotify/explicito por que se especifica la aplicacion
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.spotify.music", "com.spotify.music.MainActivity"));
            startActivity(intent);
        }
        if (view.getId()==R.id.btn7){
            // Crear un Intent explícito para abrir la configuración de Wi-Fi
            Intent wifiIntent = new Intent(Settings.ACTION_WIFI_SETTINGS);
            startActivity(wifiIntent);
        }
    }
}