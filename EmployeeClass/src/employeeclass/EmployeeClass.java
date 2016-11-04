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
public class EmployeeClass 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Keep adding employees (Max 10) and if the max is exceeded,
        // then throw an error. When an employee goes out of scope, 
        // decrement the counter by 1. Continue to do this.
        
        try
        {
            Employee a = new Maintanence(50, 50);
            Employee b = new Maintanence(50, 50);
            Employee c = new Maintanence(50, 50);
            Employee d = new Maintanence(50, 50);
            Employee e = new Maintanence(50, 50);
            
            System.out.println(Employee.getEmployees());
            
            e = null;
            
            System.out.println(Employee.getEmployees());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
