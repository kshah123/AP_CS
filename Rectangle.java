/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapemain;

import java.awt.Graphics;

/**
 *
 * @author 18shahk
 */
public class Rectangle extends Shape{
    double len;
    double wid;
    public Rectangle(double l, double w, String n, String c){
       super(n,c);
       len = l;
       wid = w;
    }
    @Override
    public double area() {
        return len * wid;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(50, 50, (int)len, (int)wid);
    }
    
}
