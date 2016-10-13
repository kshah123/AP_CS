package buildingmain;

public abstract class Building implements Comparable<Building>
{
    protected int floors;    
    public Building(){
        floors = 5;
    }
    public int getFloors(){
        return floors;
    }
    public void setFloors(int x){
        floors = x;
    }
    public abstract void calcCost(double x);
    @Override
    public int compareTo(Building x)
    {
      int a = 0;
      if(getFloors() < x.getFloors()){
          a = -1;
      }
      if(x.getFloors() == x.getFloors()){
          a = 0;
      }
      if(x.getFloors() > x.getFloors()){
          a = 1;
      }
      return a;
    }
}