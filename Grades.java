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
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        File f = new File("grades.txt");
        Scanner console = new Scanner(f);
        ArrayList<Student> students = new ArrayList();
        ArrayList<String> in = new ArrayList();
        while(console.hasNextLine())
            in.add(console.nextLine());
        for(int i = 0; i < in.size(); i++){
            String[] a = in.get(i).split(":");
            Student s = new Student(a[0]);
            in.set(i, a[1]);
        }
        for(int i = 0; i < students.size(); i++){
            String[] c = in.get(i).split(",");
            
        }
    }
    
}
