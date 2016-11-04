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
public class Sea extends Transportation
{
    private String type;
    
    public Sea()
    {
        type = "Aircraft Carrier";
    }

    public Sea(String type)
    {
        this.type = type;
    }
    
    public Sea(String source, String dest, int dist, String type)
    {
        super(source, dest, dist);
        this.type = type;
    }

    @Override
    public void sound()
    {
        System.out.println("Crasssshhhhhh");
    }

    @Override
    public void calcCost(double cost)
    {
        setCost(getDist() * 2 * cost);
    }
    
}
