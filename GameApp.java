package BlackJack;
import java.util.*;
public class GameApp {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
		Game p = new Game();
        System.out.print("Wanna Play? (y/n): ");
        String choice = input.next();
        if(choice.equals("y"))
        	Game.play();
        System.out.print("Thanks for playing - Goodbye!");
        input.close();
    } 
}
