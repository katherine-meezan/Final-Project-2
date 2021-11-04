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
   //make this a while loop
   //combat with zombies
   //add stuff to inventory
   //able to look at other boxes afterwards
      public void corner(String answer){
       if (answer.equals("1")){
           Box b1 = new Box(2,1,false);
           b1.printBoxInfo();
       } else if (answer.equals("2")){
           Box b2 = new Box(3,2,false);
           b2.printBoxInfo();
       } else if (answer.equals("3")){
           Box b3 = new Box(4,5,true);
           b3.printBoxInfo();
       } else if(answer.equals("4")){
           Box b4 = new Box(1,1,false);
           b4.printBoxInfo();
       } else if(answer.equals("door")){
           print("The door is locked");
       }
   }
   
   public void corner(String answer, int boxNumber){
       for(int i = 0; i < boxNumber; i++){
           if (answer.equals("1")){
               Box bi = new Box(((int)(Math.random() * i)),((int)(Math.random() * i)),false);
            }
       }
   }
   
      public static void print(String s){
       System.out.println(s);
   }
}


//ifuhsujdfsksjkdfdjssdfksfdjksfdsdf Hello
