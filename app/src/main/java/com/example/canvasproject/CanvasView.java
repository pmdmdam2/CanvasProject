package com.example.canvasproject;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.view.Display;
import android.view.View;

import java.util.Random;

/**
 * Puntos en el lienzo en posición, color y trazo
 * aleatorios
 */
public class CanvasView extends View {
    private Random rnd;
    private int width, height;
    private int color;
    private float x,y,strokeWidth;
    private int[] colores;
    private Paint pincel;
    public CanvasView(Activity activity) {
        super(activity.getBaseContext());
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        width = size.x;
        height = size.y;
        rnd = new Random();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Creo el pincel
        pincel = new Paint();
        //bucle for para pintar 1000 puntos aleatorios
        //para ello se generá 1 color aleatorio, 1 tipo de trazo
        //unas coordenadas para cada punto
        for(int i=0;i<1000;i++) {
            colores = getResources().getIntArray(R.array.colors);
            color = rnd.nextInt(colores.length);
            x = rnd.nextInt(width - 100);
            y = rnd.nextInt(height - 100);
            strokeWidth = rnd.nextInt(50) + 20;
            pincel.setColor(color);
            pincel.setStrokeWidth(strokeWidth);
            canvas.drawPoint(x, y, pincel);
        }
    }
}
