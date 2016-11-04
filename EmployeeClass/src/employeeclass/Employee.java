/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeclass;

/**
 *
 * @author arnold
 */
public abstract class Employee <T extends Employee> implements Comparable<T>
{
    private static int employeeNum = 0;
    private String name, job, hired;
    private int age, vacaWeeks;
    private double pay;

    public Employee() throws Exception
    {
        employeeNum++;
        name = Integer.toString(employeeNum);
        job = "Temp";
        hired = "06/24/2011";
        age = 29;
        vacaWeeks = 4;
        
        if (employeeNum > 5)
            throw new Exception("Too many instances");
    }
    
    public Employee(String name, String job, int age, int vacaWeeks) throws Exception
    {
        employeeNum++;
        this.name = name;
        this.job = job;
        hired = "N/A";
        this.age = age;
        this.vacaWeeks = vacaWeeks;
        
        if (employeeNum > 5)
            throw new Exception("Too many instances");
    }
    
    public Employee(String name, String job, String hireDate, int age, int vacaWeeks) throws Exception 
    {
        employeeNum++;
        this.name = name;
        this.job = job;
        this.hired = hireDate;
        this.age = age;
        this.vacaWeeks = vacaWeeks;
        
        if (employeeNum > 5)
            throw new Exception("Too many instances");
    }
    
    public abstract void calcPay();
    
    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHired() {
        return hired;
    }

    public void setHired(String hired) {
        this.hired = hired;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getVacaWeeks() {
        return vacaWeeks;
    }

    public void setVacaWeeks(int vacaWeeks) {
        this.vacaWeeks = vacaWeeks;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
    
    public static int getEmployees()
    {
        return employeeNum;
    }

    @Override
    protected void finalize() throws Throwable
    {
        employeeNum--;
    }
    
    @Override
    public String toString()
    {
        return "My name is Employee #" + name + " and I make $" + pay + " a year.";
    }

}
