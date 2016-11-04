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
public class Ground extends Transportation
{
    private int rims;
    
    public Ground()
    {
        rims = 22;
    }
    
    public Ground (int rims)
    {
        this.rims = rims;
    }

    public Ground(String source, String dest, int dist, int rims)
    {
        super(source, dest, dist);
        this.rims = rims;
    }

    @Override
    public void sound()
    {
        System.out.println("Vrroooooom!");
    }

    @Override
    public void calcCost(double cost)
    {
        // cost/mile * dist
        setCost(cost * getDist());
    }
    
}
