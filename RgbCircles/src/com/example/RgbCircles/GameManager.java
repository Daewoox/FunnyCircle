package com.example.RgbCircles;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class GameManager {
    private MainCircle mainCircle;
    private Paint paint;


    public GameManager() {
        initMainCircle();
        initPaint();

    }
    private void initPaint(){
        paint=new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

    }
    private void initMainCircle(){
        mainCircle=new MainCircle(200,500,200);
    }

    public void onDraw(Canvas canvas) {
        canvas.drawARGB(20, 255, 0, 0);
        paint.setColor(Color.argb(60,0, 0, 255));
        canvas.drawCircle(mainCircle.getX(),mainCircle.getY(),mainCircle.getRadius(),paint);

    }
}
