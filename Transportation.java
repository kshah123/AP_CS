/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportmain;

/**
 *
 * @author 18shahk
 */
public abstract class Transportation implements Comparable<Transportation>{
    protected String source;
    protected String destination;
    public double distance;
    protected double cost;
    public Transportation(String s, String d, double dis, double c){
        source = s;
        destination = d;
        distance = dis;
        cost = c;
    }
    public abstract String sound();
    public abstract double calcCost();
    @Override
    public int compareTo(Transportation a){
        if(cost > a.calcCost())
            return 1;
        else if(cost < a.calcCost())
            return -1;
        else{
            return 0;
        }
    }
}
