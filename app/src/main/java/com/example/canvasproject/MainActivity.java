package com.example.canvasproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout lyMain = findViewById(R.id.lyMain);
        //inicializo un objeto de mi propia clase View que contiene el lienzo donde dibujar
        CanvasView canvasView = new CanvasView(this);
        //añadimos nuestro View al administrador de diseño principal
        lyMain.addView(canvasView);
    }
}