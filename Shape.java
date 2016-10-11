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
public abstract class Shape {
    String name;
    String color;
    public Shape(String n, String c){
        name = n;
        color = c;
    }
    public abstract double area();
    public abstract void draw(Graphics g);
}
