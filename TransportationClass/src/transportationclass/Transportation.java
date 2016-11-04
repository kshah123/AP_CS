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
public abstract class Transportation implements Comparable<Transportation>
{
    private String source, dest;
    private int dist;
    private double cost;
    
    // Constructors
    public Transportation()
    {
        source = "N/A";
        dest = "N/A";
        dist = 0;
        cost = 0;
    }
    
    public Transportation(String source, String dest, int dist)
    {
        this.source = source;
        this.dest = dest;
        this.dist = dist;
    }
        
    // Getters and Setters
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public abstract void sound();
    public abstract void calcCost(double cost);

    @Override
    public int compareTo (Transportation t)
    {
        if (this.getCost() > t.getCost())
            return 1;
        else if (t.getCost() > this.getCost())
            return -1;
        else
            return 0;
    }
}
