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
public class Square extends Shape{
    double side;
    public Square(double s, String n, String c){
        super(n,c);
        side = s;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(50, 50, (int)(side), (int)(side));    }
}
