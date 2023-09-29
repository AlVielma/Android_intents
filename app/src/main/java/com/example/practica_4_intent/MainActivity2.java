package com.example.practica_4_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Obtén una referencia al TextView
        TextView textView = findViewById(R.id.textViewMensaje);

        // Obtén el mensaje recibido del Intent automáticamente
        String mensajeRecibido = getIntent().getStringExtra("mensaje");

        // Muestra el mensaje en el TextView
        textView.setText(mensajeRecibido);

    }
}