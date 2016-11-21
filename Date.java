/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemain;
import java.util.Calendar;
/**
 *
 * @author 18shahk
 */
public class Date {
    private int day;
    private int month;
    private int year;
    public Date(){
        Calendar c = Calendar.getInstance();
        String[] a = c.getTime().toString().split(" ");
        day = Integer.parseInt(a[2]);
        month = c.MONTH;
        year = Integer.parseInt(a[5]);
        
    }
    @Override
    public String toString(){
        return month + "/" + day + "/" + year;
    }
}
