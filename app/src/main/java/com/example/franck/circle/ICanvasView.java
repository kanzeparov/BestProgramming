package com.example.franck.circle;

/**
 * Created by Franck on 11.11.2017.
 */

public interface ICanvasView {
    void drawCircle(SimpleCircle circle);

    void redraw();

    void showMessage(String text);
}
