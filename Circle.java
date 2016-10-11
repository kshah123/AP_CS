/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.awt.Graphics;
/**
 *
 * @author 18shahk
 */
public class Circle extends Shape{
    double radius;
    public Circle(double r, String n, String c){
        super(n,c);
        radius = r;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(50, 50, (int)(radius * 2), (int)(radius * 2));
    }
    public double circumference(){
        return Math.PI * 2 * radius;
    }
}
