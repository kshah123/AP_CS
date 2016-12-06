/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmain;

/**
 *
 * @author 18shahk
 */
public class Course {
    private String name;
    private int numGrade;
    private char letterGrade;
    public Course(String n, int g, char l){
        name = n;
        numGrade = g;
        letterGrade = l;
    }
    public int getGrade(){
        return numGrade;
    }
    public char getLetter(int n){
        if(!(n > 100 || n < 0))
            throw new IllegalArgumentException("Not a valid grade");
        if(n > 90)
            return 'A';
        else if(n > 80)
            return 'B';
        else if(n > 70)
            return 'C';
        else if(n > 60)
            return 'D';
        else
            return 'F';
    }
}
