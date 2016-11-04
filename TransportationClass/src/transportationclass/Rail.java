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
public class Rail extends Transportation
{
    private boolean isDoubleDecker;
    private int noCars;
    
    public Rail()
    {
        isDoubleDecker = true;
        noCars = 5;
    }

    public Rail(boolean isDoubleDecker, int noCars)
    {
        this.isDoubleDecker = isDoubleDecker;
        this.noCars = noCars;
    }
    
    public Rail(String source, String dest, int dist, boolean isDoubleDecker, int noCars)
    {
        super(source, dest, dist);
        this.isDoubleDecker = isDoubleDecker;
        this.noCars = noCars;
    }

    @Override
    public void sound()
    {
        System.out.println("Chugga Chugga Chugga Chugga Chugga Chugga Chugga Chugga Chugga Chugga Chugga Chugga Choo choo!!");
    }

    @Override
    public void calcCost(double cost)
    {
        // Cost/hour * miles * 1.25
        setCost(cost * getDist() * 1.25);
    }

}
