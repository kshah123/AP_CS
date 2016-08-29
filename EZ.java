/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ez;
import java.util.Scanner;
/**
 *
 * @author Kush Shah
 */
public class EZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double sum = 0.0;
        System.out.println("How many times would you like to run \"The Big E-Z\"?");
        double trials = (double)console.nextInt();
        for(int i = 0; i < trials; i++){
            System.out.println("Trial " + (i+1));
            int count = 0;
            double add = 0.0;
            do{
                double x = Math.random();
                x = Math.round(x *10.0)/10.0;
                System.out.print(x + " ");
                add+= x;
                count++;
            }while(add <= 1);
            sum+=count;
            System.out.println("= " + count + " numbers");
        }
        double avg = (double)sum/trials;
        System.out.println("The average was " + avg);
    }
    
}
