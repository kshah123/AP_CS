/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentproj;
import sortall.SortAll;

/**
 *
 * @author anshulkamath
 */
public class InvestmentProj
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        Investment adam = new MutualFund("Adam", 100, 540.12);
        Investment james = new CD("James", 5000, 5, 365);
        Investment john = new CD("John", 10000, 4, 1000);
        
        Investment[] invest = new Investment[3];
        invest[0] = adam;
        invest[1] = james;
        invest[2] = john;
        
        for (Investment temp : invest)
            System.out.println(temp);
        
        SortAll.bubbleSort(invest);
        
        System.out.println();
        
        for (Investment temp : invest)
            System.out.println(temp);
    }
    
}
