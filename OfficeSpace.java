/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildmain;

/**
 *
 * @author 18shahk
 */
public class OfficeSpace extends Building{
    double tAmt;
    double sqPerFloor;
    double totalCost;
    double costFloor;
    public OfficeSpace(double t, double sq, double c){
        super();
        tAmt = t;
        sqPerFloor = sq;
        costFloor = c;
    }
    public double getCost(){
        return totalCost;
    }
    @Override
    public void calcCost(double x) {
        totalCost = (costFloor * floors) + tAmt + (sqPerFloor * 2.75);
    }
}
