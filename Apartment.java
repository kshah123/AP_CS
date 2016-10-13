/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingmain;

/**
 *
 * @author Kush Shah
 */
public class Apartment extends Building{
    protected double costPerFloor;
    protected double totalCost;    
    public Apartment(double x){
        super();
        costPerFloor = x;
    }
    
    public double getCostPerFloor(){
        return costPerFloor;
    }
    public double getTotalCost(){
        return totalCost;
    }
    @Override
    public String toString() {
        return ("$" + Double.toString(totalCost));
    } 
    @Override
    public void calcCost(double tax){
        totalCost = getCostPerFloor() * getFloors() + tax;
    }
}
