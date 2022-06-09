package edu.escuelaing.arsw.app;

import java.util.List;

public class Canvas {
    public void draw(Shape s) {
        s.draw(this);
    } 

    public void drawAll(List<? extends Shape> ls){
        for(Shape s: ls){
            s.draw(this);
        }
    }
}
