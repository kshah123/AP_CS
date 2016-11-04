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
public class BasicExtension extends Basic
{
    private int people;
    
    public BasicExtension()
    {
        super("102912904u1092u5");
        people = 0;
    }
    
    public BasicExtension(int people)
    {
        this.people = people;
    }
    
    protected void printProt()
    {
        System.out.println("This is overridden.");
    }
    
    public void poly()
    {
        System.out.println("This is a polymorphic method");
    }
}
