package com.robot_remote.remote;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Plane {
    public Bitmap plane;
    int X, Y;
    public int Speed=10;//speed of plane
    public Plane(Context context)
    {
        this.plane = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane);
    }
}
