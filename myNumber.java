/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package run;

/**
 *
 * @author 18shahk
 */
public class myNumber extends Number{
    Number x;
    public myNumber(Number i){
        x = i;
    }
    @Override
    public double doubleValue(){
        return (Double)(x);
    }
    @Override
    public float floatValue(){
        return (Float)(x);
    }

    @Override
    public int intValue() {
        return (Integer)(x);
    }

    @Override
    public long longValue() {
        return (Long)(x);
    }
    @Override
    public String toString(){
        return x + "";
    }
}
