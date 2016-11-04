/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeclass;

/**
 *
 * @author anshulkamath
 */
public class Maintanence extends Employee<Maintanence>
{
    
    private int hoursWorked;
    private double hourlyPay;

    public Maintanence(int hoursWorked, double hourlyPay) throws Exception
    {
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
        calcPay();
    }

    public Maintanence(String name, String job, int age, int vacaWeeks, int hoursWorked, double hourlyPay) throws Exception
    {
        super(name, job, age, vacaWeeks);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
        calcPay();
    }

    
    public Maintanence(String name, String job, String hireDate, int age, int vacaWeeks, int hoursWorked, double hourlyPay) throws Exception 
    {
        super(name, job, hireDate, age, vacaWeeks);
        this.hoursWorked = hoursWorked;
        this.hourlyPay = hourlyPay;
    }
    
    // Getters and Setters

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }
    

    @Override
    public void calcPay() 
    {
        setPay(hoursWorked * hourlyPay);
    }    

    @Override
    public int compareTo(Maintanence o)
    {
        if (o.hourlyPay > this.hourlyPay)
            return -1;
        else if (this.hourlyPay > o.hourlyPay)
            return 1;
        else
            return 0;
    }
}
