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
public class Executive extends Employee<Executive>
{
    private double annualSalary, yearEnd, weekly;
    
    public Executive() throws Exception
    {
        annualSalary = 500000;
        yearEnd = 20000;
        weekly = 1000;
        calcPay();
    }

    public Executive(double annualSalary, double yearEnd, double weekly) throws Exception
    {
        this.annualSalary = annualSalary;
        this.yearEnd = yearEnd;
        this.weekly = weekly;
        calcPay();
    }

    public Executive(String name, String job, int age, int vacaWeeks, double annualSalary, double yearEnd, double weekly) throws Exception
    {
        super(name, job, age, vacaWeeks);
        this.annualSalary = annualSalary;
        this.yearEnd = yearEnd;
        this.weekly = weekly;
        calcPay();
    }

    public Executive(String name, String job, String hireDate, int age, int vacaWeeks, double annualSalary, double yearEnd, double weekly) throws Exception
    {
        super(name, job, hireDate, age, vacaWeeks);
        this.annualSalary = annualSalary;
        this.yearEnd = yearEnd;
        this.weekly = weekly;
        calcPay();
    }
    
    // Getters and Setters

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getYearEnd() {
        return yearEnd;
    }

    public void setYearEnd(double yearEnd) {
        this.yearEnd = yearEnd;
    }

    public double getWeekly() {
        return weekly;
    }

    public void setWeekly(double weekly) {
        this.weekly = weekly;
    }
    

    @Override
    public void calcPay()
    {
        setPay(annualSalary / 52 + weekly);
    }

    @Override
    public int compareTo(Executive o)
    {
        if (o.annualSalary > this.annualSalary)
            return -1;
        else if (this.annualSalary > o.annualSalary)
            return 1;
        else
            return 0;
    }
    
    
}
