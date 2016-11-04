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
public class StaticVariables
{
    
    public static boolean pass(String pwd)
    {
        int counter = 0;
        boolean num = false;
        boolean isUpper = false;
        
        if (6 <= pwd.length() && pwd.length() <= 12)
        {
            for (int i = 0; i < pwd.length(); i++)
            {
                if (Character.isUnicodeIdentifierPart(pwd.charAt(i)))
                {
                    if (Character.isDigit(pwd.charAt(i)))
                    {
                        counter++;
                        
                        if (counter >= 2)
                            num = true;
                    }

                    else if (Character.isUpperCase(pwd.charAt(i)))
                        isUpper = true;
                }
            }
        }
        
        return num && isUpper;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Basic a = new Basic();
        Basic b = new BasicExtension();
        BasicExtension c = new BasicExtension();
        
        System.out.println(Basic.getNumInstances());
        a.printProt();
        b.printProt();
        ((BasicExtension)b).poly();
        c.printProt();
        
        System.out.println(pass("Anshul12"));
    }
    
}
