/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author 18shahk
 */
public class OfficeSpace extends Building{
    double cFloor;
    double tAmt;
    double sqFt;
    double tCost;
    public OfficeSpace(double c, double t, double s){
        super();
        cFloor = c;
        tAmt = t;
        sqFt = s;
    }
    @Override
    public void calcCost(double t){
        tCost = ((cFloor * this.floors) + t) + (sqFt * 2.75);
    }
    @Override
    public int compareTo(Building b){
        int x = super.compareTo(b);
        return x;
    }
    public String toString(){
        return Double.toString(tCost);
    }

}
