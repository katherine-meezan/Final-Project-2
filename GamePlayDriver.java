import java.util.ArrayList;
// fighting mechanics
//make box empty after opened
// make a box class
import java.util.Scanner;

public class GamePlayDriver
{
   public static void main(){
       Player p1 = new Player();
       Scanner s = new Scanner(System.in);
       
       print("You wake up in the top layer of the tower");
       print("Theres a door... but it's locked. You look around");
       print("Each corner has a box in it. What do you wish to do?");
       print("Do you want to go to corner 1,2,3, or 4?");
       String answer = s.nextLine();
       
       p1.corner(answer);
       
       Monsters[] mList = p1.getMonsters();
       
       
       for(Monsters monster: mList){
           if (monster != null){
               monster.combat(p1);
               print("segtstgddgdgdr");
           }  
       }
       
   }
   
   public static void print(String s){
       System.out.println(s);
   }
 
   
   public static void drinkHealthPotion(Player player){
       int currentHealth = player.getHealth();
       player.setHealth(currentHealth + 1);
   }
   
}
