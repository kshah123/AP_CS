package main;

public abstract class Building implements Comparable<Building>
{
    protected int floors;
    protected double tax;
    
    public Building()
    {
        floors = 5;
    }
    
    public int getFloors()
    {
        return floors;
    }
    public void setFloors(int f)
    {
        floors = f;
    }
    public abstract void calcCost(double x);
    
    
    public int compareTo(Building b)
    {
        int c = 0;
      if(getFloors()<b.getFloors())
      {
         c = -1;
      }
      if(getFloors()==b.getFloors())
      {
          c = 0;
      }
      if(getFloors()>b.getFloors())
      {
          c = 1;
      }
      return c;
    }
}
