/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revar;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Kush Shah
 */
public class RevAr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner console = new Scanner(System.in);
        ArrayList<String> a = new ArrayList();
        System.out.println("Type in any value you feel like and press enter to type in the next. Type in 'done' when done typing in values");
        while(true){
            String in = console.next();
            if(in.equals("done"))
                break;
            else
                a.add(in);
        }
        ArrayList<String> b = new ArrayList();
        for(int i = a.size()-1; i < -1; i--)
            b.add(a.get(i));
        for(int i = 0; i < b.size(); i++)
            System.out.println(b.get(i));
    }
    
}
