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
       int boxTracker = p1.getBoxTracker()+1;
       
       
       while(boxTracker < 4){
           
           //if(p1.getBoxTracker() > 0){
               //answer = s.nextLine();
            //}
           Monsters[] mList = p1.getMonsters(answer);
           
           
           for(Monsters monster: mList){
               if (monster != null){
                   monster.combat(p1);
               }  
           }
           print("Which corner do you want to try now? 1, 2, 3, 4? Don't try one you already went to!");
           answer = s.nextLine();
        }
       //chang4e
   }
   
   public static void print(String s){
       System.out.println(s);
   }
 
   
   public static void drinkHealthPotion(Player player){
       int currentHealth = player.getHealth();
       player.setHealth(currentHealth + 1);
   }
   
}
