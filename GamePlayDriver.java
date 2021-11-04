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
       
       //ArrayList<String> objects = ArrayList<string>;
       
       print("You wake up in the top layer of the tower");
       print("Theres a door... but it's locked. You look around");
       print("Each corner has a box in it. What do you wish to do?");
       print("Do you want to go to corner 1,2,3, or 4?");
       String answer = s.nextLine();
       
       if (answer.equals("1")){
           print("A zombie springs out! Oh no!");
       } else if (answer.equals("2")){
           print("You found two bottles with strange red liquid");
       } else if (answer.equals("3")){
           print("You found a key! What's it for...");
           
       } else if(answer.equals("4")){
           print("A zombie springs out! Oh no!");
       } else if(answer.equals("door")){
           print("The door is locked");
       }
       
   }
   
   public static void print(String s){
       System.out.println(s);
   }
}
