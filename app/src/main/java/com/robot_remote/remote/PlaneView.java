package com.robot_remote.remote;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class PlaneView extends View implements  Runnable{
    Plane plane;

    public  PlaneView(Context context, AttributeSet attrs)
    {
        super(context);
        plane =new Plane(context);
        setFocusable(true);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Paint p=new Paint();
        canvas.drawBitmap(plane.plane,plane.X,plane.Y,p);
    }
    public void run()
    {
        
    }

}
