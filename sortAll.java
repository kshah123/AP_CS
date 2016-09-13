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
    public Comparable[] sort(Comparable[] x){
       for (int i = 0; i < x.length; i++) {
        for (int j = 0; j < i; j++) {
            if (x[j + 1].compareTo(x[j]) < 0) {
                Comparable temp = x[j + 1];
                x[j + 1] = x[j];
                x[j] = temp;
                }
            }
        }
       return x;
    }
}
