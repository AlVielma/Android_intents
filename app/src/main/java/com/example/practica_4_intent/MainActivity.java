package com.example.practica_4_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
            Intent i = new Intent(this, MainActivity2.class);
            String mensaje = "Hola desde la primera actividad";
            i.putExtra("mensaje", mensaje);
            startActivity(i);
        }
    }
}