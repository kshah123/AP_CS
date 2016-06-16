/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;
import java.util.*;
import java.io.*;
/**
 *
 * @author installer
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    ArrayList<Student> students = new ArrayList();
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File f = new File("grades.txt");
        Scanner console = new Scanner(f);
        Grades grades = new Grades();
        ArrayList<String> in = new ArrayList();
        while(console.hasNextLine())
            in.add(console.nextLine());
        for(int i = 0; i < in.size(); i++){
            String[] a = in.get(i).split(":");
            Student s = new Student(a[0]);
            in.set(i, a[1]);
        }
        for(int i = 0; i < grades.students.size(); i++){
            String[] c = in.get(i).split(",");
            for(int t = 0; t < c.length; t++)
                grades.students.get(i).addGrade(Double.parseDouble(c[t]));
            grades.students.get(i).setAvg();
        }
        bubbleSort(grades.students);
    }
    public static void bubbleSort(ArrayList<Student> ar) {
               
               
        int n = ar.size();
        Student temp;
               
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(ar.get(j-1).getAvg() > ar.get(j).getAvg()){
                temp = ar.get(j-1);
                ar.set(j-1, ar.get(j));
                ar.set(j, temp);
                }                  
            }
        }
       
    }
}
