/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spellcheck;
import java.util.*;
import java.io.*;
/**
 *
 * @author Kush Shah
 */
public class SpellCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner csgo = new Scanner(System.in);
        String[] arrayofstrings = new String[20];
        File spellcheck = new File("spellcheck.txt");
        Scanner spell = new Scanner(spellcheck);
        char[] temp = new char[0];
        int correctcounter = 0;
        int maxcorrect = 0;
        String closestmatch = "lol";
       
        for(int i = 0; i < 20; i++){
            arrayofstrings[i] = spell.nextLine();            
        }
        
        System.out.println("Enter a word to spellcheck.");
        String input = csgo.nextLine();
        
        //converts string to char array
        char[] inputarray = new char[input.length()];
        for(int z = 0; z < input.length(); z++){
            inputarray[z] = input.charAt(z);
        }
        
        for(int a = 0; a < 20; a++){
            //if string is correct
            if(input.equals(arrayofstrings[a])){
                System.out.println("Your spelling is correct!");
                closestmatch = arrayofstrings[a];
            }
            //if spelling is not correct
            else{
                temp = new char[arrayofstrings[a].length()]; 
                //makes .txt string a char array
                for(int z = 0; z < arrayofstrings[a].length(); z++){
                    temp[z] = arrayofstrings[a].charAt(z); 
                    
                }
                if(temp.length >= inputarray.length){
                    for(int i = 0; i < inputarray.length; i++){                     
                        if(inputarray[i] == temp[i]){  
                            correctcounter++;
                        }                        
                    }                  
                }
                else if(temp.length < inputarray.length){
                    for(int i = 0; i < temp.length; i++){                     
                        if(inputarray[i] == temp[i]){   
                            correctcounter++;
                        }                        
                    }   
                }
                if(correctcounter > maxcorrect){
                    maxcorrect = correctcounter;
                    closestmatch = arrayofstrings[a];
                    correctcounter = 0;                    
                }
                else if(correctcounter < maxcorrect){
                    correctcounter = 0;
                }
                
            }
            
        }
        System.out.println("Did you mean: " + closestmatch + "?");
        String yn = csgo.next();
        if(yn.equalsIgnoreCase("yes"))
            System.out.println("Word changed to " + closestmatch);
        else
            System.out.println("Word not found");
        
    }
    
}