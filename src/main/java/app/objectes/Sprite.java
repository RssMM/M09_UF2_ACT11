package app.objectes;

import java.awt.*;
import processing.core.*;

public class Sprite extends ObjecteGrafic {
    private PImage img;

    public Sprite( PImage img, int x, int y) {
        super(x, y, Color.WHITE);
        this.img = img;
    }

    public void pinta(PGraphics g) {
        super.pinta(g);
        g.image(img, x, y);
        img.resize(70,70);
    }
}
