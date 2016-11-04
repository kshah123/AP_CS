/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportationclass;

/**
 *
 * @author anshulkamath
 */
public class Air extends Transportation
{
    private String airline;
    
    public Air ()
    {
        airline = "American Airlines";
    }
    
    public Air (String air)
    {
        this.airline = air;
    }
    
    public Air(String source, String dest, int dist, String airline)
    {
        super(source, dest, dist);
        this.airline = airline;
    }
    
    @Override
    public void sound()
    {
        System.out.println("PSHWWWWWWWW");
    }

    @Override
    public void calcCost(double cost)
    {
        // Cost per 100 miles * 1.5 for profit
        setCost(cost * (getDist() / 100.0) * 1.5);
    }
    
}
