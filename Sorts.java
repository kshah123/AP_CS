/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts;
import java.util.Arrays;
/**
 *
 * @author user
 */
public class Sorts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {7,3,5,3,2,4,1};
        //for(int i = 0; i < a.length; i++)
            //a[i] = (int)(Math.random() * a.length);
        System.out.println(Arrays.toString(mergeSort(a)));
    }
    public static void ssort(double[] x){
        for(int i = 0; i < x.length-1; i++){
            int index = 1;
            for(int j = 0; j < x.length - i; j++){
                if(x[j] > x[index])
                    index = j;
            }
            swap(x, index, x.length - 1 - i);
        }
    }
    public static void swap(double[] x, int i1, int i2){
            double temp = x[i1];
            x[i1] = x[i2];
            x[i2] = temp;   
    }
    public static void isort(double[] x){
        for(int i = 1; i < x.length; i++){ //i logically determines subarray being sorted
            int c = 0;//determines subarray being sorted
            while(c <= i-1 && x[i-1-c] > x[i-c]){
                swap(x, i-1-c, i-c);
                c++;
            }
        }
    }
    public static int[] mergeSort(int[] x){
        if(x.length == 1)
            return x;
        else
            return merge(mergeSort(Arrays.copyOfRange(x, 0, x.length/2)), mergeSort(Arrays.copyOfRange(x, x.length/2, x.length)));
    }
    public static int[] merge(int[] x, int[] y){
        int[] z = new int[x.length + y.length];
        int xc = 0;
        int yc = 0;
        for(int i = 0; i < z.length; i++){
            if(xc == x.length){
                    z[i] = y[yc];
                    yc++;
            }
            else if(yc == y.length){
                    z[i] = x[xc];
                    xc++;
            }
            else{
                if(x[xc] < y[yc]){
                    z[i] = x[xc];
                    xc++;
                }
                else{
                    z[i] = y[yc];
                    yc++;
                }
            }
        }
        return z;
    }       
    
    
}
