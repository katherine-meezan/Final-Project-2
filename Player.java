import java.util.ArrayList;

public class Player
{
   private int health;
   private int xp;
   private int power;
   ArrayList<String> items = new ArrayList<String>();
   
   public Player(){
       this.health = 100;
       this.xp = 0;
       this.power = 10;
    }
    
   public Player(int health, int xp, int power){
       this.health = health;
       this.xp = xp;
       this.power = power;
    }
    
   // getters and setters
   ///////////////////////////////////////////////////////////
   public int getHealth(){
       return this.health;
    }
   public void setHealth(int newHealth){
       this.health = newHealth;
    }
   public void addHealth(int moreHealth){
       this.health += moreHealth;
    }
    
   public int getXP(){
       return this.xp;
    }
   public void setXP(int newXP){
       this.xp = newXP;
    }
   public void addXP(int moreXP){
       this.xp += moreXP;
    }
    
   public int getPower(){
       return this.power;
    }
   public void setPower(int newPower){
       this.power = newPower;
    }
   public void addPower(int morePower){
       this.power += morePower;
    }
    
    
    
   // Items
   ///////////////////////////////////////////////////////////
   public ArrayList<String> returnItems(){
       return items;
   }
   
   public void addItem(String Item){
       items.add(Item);
   }
   
   public void addItem(String Item, int amount){
       for (int i = 0; i > amount; i++){
           items.add(Item);
        }
   }
   
   public void removeItem(String Item){
       items.remove(items.indexOf(Item));
   }
   
   // Gameplay
   ///////////////////////////////////////////////////////////
   
      public void corner(String answer){
       if (answer.equals("1")){
           print("A zombie springs out! Oh no!");
           // combat();
       } else if (answer.equals("2")){
           print("You found two bottles with strange red liquid");
           addItem("health poition", 2);
       } else if (answer.equals("3")){
           print("You found a key! What's it for...");
           addItem("key");
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


//ifuhsujdfsksjkdfdjssdfksfdjksfdsdf Hello
