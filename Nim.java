package nim;
import java.util.Scanner;

public class Nim {

    /**
     * @param args the command line arguments
     */
    static boolean winlose = false;
    static int pile1 = 0;
    static int pile2 = 0;
    static int pile3 = 0;
    public static void main(String[] args) {
        System.out.println("This game is called NIM. There are 3 piles. There are 3 stones in the first pile, 5 in the second, and 8 in the third.");
        System.out.println("Two players take turns taking stones. Play until someone is forced to take the last stone and lose.");
        do{
            System.out.println("P1, please select a pile.");
            checkPile();
            checkWin();
            if(winlose == false){
                System.out.println("P2, please select a pile.");
                checkPile();
                checkWin();
                if(winlose == true){
                    System.out.println("P1 wins!");
                }
            }
            else if(winlose == true){
                System.out.println("P2 wins!");
            }
                    
        }while (winlose == false);
        
        
    }
    public static void checkWin(){
        if(pile1 == 3 || pile2 == 5 || pile3 == 8){
            winlose = true;
        }
    }
    public static void checkPile(){
        Scanner csgo = new Scanner(System.in);
        int next = csgo.nextInt();
        boolean x;
        do{
            x = true;
            if(next == 1){
                pile1++;
            }
            else if(next == 2){
                pile2++;
            }
            else if(next == 3){
                pile3++;
            }
            else{
                x = false;
                System.out.println("That is an invald input, please try again");
            }
        }while(x == false);
    }
}