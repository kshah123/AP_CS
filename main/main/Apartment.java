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
public class Apartment extends Building{
    protected double costPerFloor;
    protected double totalCost;
    
    public Apartment(double x)
    {
        costPerFloor = x;
    }
    
    public double getCostPerFloor()
    {
        return costPerFloor;
    }
    public double getTotalCost()
    {
        return totalCost;
    }
    @Override
    public String toString()
    {
        return ("$" + "" + totalCost);
    }
    
    @Override
    public void calcCost(double tax) 
    {
        totalCost = getCostPerFloor()*getFloors()+tax;
    }

    @Override
    public int compareTo(Building t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
