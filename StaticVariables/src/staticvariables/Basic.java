/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticvariables;

/**
 *
 * @author anshulkamath
 */
public class Basic
{
    private static int numInstances;
    protected String val;
    
    public Basic()
    {
        numInstances++;
        val = null;
    }
    
    public Basic(String val)
    {
        numInstances++;
        this.val = val;
    }

    public static int getNumInstances()
    {
        return numInstances;
    }

    public static void setNumInstances(int numInstances) 
    {
        Basic.numInstances = numInstances;
    }
    
    private void printPri()
    {
        System.out.println("Print");
    }
    
    protected void printProt(String prot)
    {
        System.out.println(prot);
    }
    
    protected void printProt()
    {
        System.out.println("Print");
    }
    
    
}
