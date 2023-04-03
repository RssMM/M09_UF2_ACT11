package app.objectes;

import processing.core.PGraphics;

import java.awt.*;

public class Ellipse extends ObjecteGrafic {
    private int radiX, radiY;

    public Ellipse(int x, int y, int radiX, int radiY, Color color) {
        super(x, y, color);
        this.radiX = radiX;
        this.radiY = radiY;
    }

    public void pinta(PGraphics g) {
        super.pinta(g);
        g.ellipse(x,y,radiX, radiY);
    }
}