/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortmain;

/**
 *
 * @author Kush Shah
 */
public class sortAll {
    public static Comparable[] sort(Comparable[] x){
        Comparable[] y = new Comparable[x.length];
        for(int i = 0; i < x.length; i++)
            y[i] = x[i];
        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < i; j++) {
                if (y[j + 1].compareTo(y[j]) < 0) {
                    Comparable temp = y[j + 1];
                    y[j + 1] = y[j];
                    y[j] = temp;
                }
            }
        }
       return y;
    }
}
