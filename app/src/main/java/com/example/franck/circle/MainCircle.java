package com.example.franck.circle;

import android.graphics.Color;

/**
 * Created by Franck on 11.11.2017.
 */

public class MainCircle extends SimpleCircle{
    public static final int INTI_RADIUS = 50;

    public MainCircle(int x, int y) {
        super(x, y, INTI_RADIUS);
        setColor(Color.BLUE);
    }

}

