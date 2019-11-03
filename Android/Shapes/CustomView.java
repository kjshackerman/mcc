package com.example.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class CustomView extends View {
    private Rect rectangle;
    private Paint paint;

    public CustomView(Context context){
        super(context);
        int x = 50;
        int y = 50;
        int side = 200;

        rectangle = new Rect(x,y,side,side);
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }

    public void drawTriangle(Canvas canvas, Paint paint,  int x, int y, int width) {
        int h = width/2;

        Path path = new Path();
        path.moveTo(x, y-h);
        path.lineTo(x-h,y+h);
        path.lineTo(x+h,y+h);
        path.lineTo(x,y-h);
        path.close();

        canvas.drawPath(path, paint);
    }

    protected void onDraw(Canvas canvas) {
        canvas.drawColor(Color.parseColor("#dcdcdc"));
        canvas.drawRect(rectangle, paint);
        drawTriangle(canvas, paint, 600,600,500);
        canvas.drawCircle(500,1000,100,paint);
    }
}
