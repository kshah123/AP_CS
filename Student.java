/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortcomp;
import java.util.*;
/**
 *
 * @author installer
 */
public class Student implements Comparable{
    private String name;
    private ArrayList<Double> grades;
    private double avg;
    public Student(String n){
        name = n;
    }
    public void addGrade(double g){
        grades.add(g);
    }
    public void setAvg(){
        double sum = 0.0;
        for(int i = 0; i < grades.size(); i++)
            sum += grades.get(i);
        avg = sum/grades.size();
    }
    public double getAvg(){
        return avg;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Double> getGrades(){
        return grades;
    }
    
    @Override
    public int compareTo(Student comparestu){
        int compareName = ((Student)comparestu).getName().charAt(0);
        return this.getName().charAt(0)- compareName;
    }
}