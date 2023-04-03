package app.objectes;

import app.App;
import processing.core.PGraphics;

import java.awt.Color;

public class ObjecteGrafic implements Movible {
    protected int x, y;
    protected int vX, vY;
    protected Color color;

    public ObjecteGrafic(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.vX = 0;
        this.vY = 0;
    }

    public void pinta(PGraphics g) {
        g.fill(color.getRGB());
    }

    public void mou() {
        int width = App.width;
        int height = App.height;

        x += vX;
        if(x >= width || x <= 0){
            vX *= -1;
        }

        y += vY;
        if(y >= height || y <= 0){
            vY *= -1;
        }
    }

    public void setVelocitat(int x, int y) {
        this.vX = x;
        this.vY = y;
    }

}