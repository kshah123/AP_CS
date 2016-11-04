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
public class Manager extends Employee<Manager>
{
    private double annualSalary;
    
    public Manager() throws Exception
    {
        annualSalary = 50000;
        calcPay();
    }
    
    public Manager (double annual) throws Exception
    {
        annualSalary = annual;
        calcPay();
    }

    public Manager(String name, String job, int age, int vacaWeeks, double annualSalary) throws Exception
    {
        super(name, job, age, vacaWeeks);
        this.annualSalary = annualSalary;
        calcPay();
    }

    public Manager(String name, String job, String hireDate, int age, int vacaWeeks, double annualSalary) throws Exception 
    {
        super(name, job, hireDate, age, vacaWeeks);
        this.annualSalary = annualSalary;
        calcPay();
    }
    
    // Getters and Setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    

    @Override
    public void calcPay()
    {
        setPay(annualSalary / 52);
    }

    @Override
    public int compareTo(Manager o)
    {
        if (o.annualSalary > this.annualSalary)
            return -1;
        else if (this.annualSalary > o.annualSalary)
            return 1;
        else
            return 0;
    }
}
