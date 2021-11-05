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
   //combat with zombies
   //make this a while loop
   //able to look at other boxes afterwards
   //key-door functionality
   
   
   //add stuff to inventory
   // other levels (not gonna happen lol)
   Monsters m1 = new Monsters();
   Monsters m2 = new Monsters();
   Monsters m3 = new Monsters();
   Monsters m4 = new Monsters();
   Monsters m5 = new Monsters();
   Monsters m6 = new Monsters();
   Monsters m7 = new Monsters();
   Monsters[] mList = {null};
      public Monsters[] corner(String answer){
       if (answer.equals("1")){
           Monsters[] mList = {m1};
           Box b1 = new Box(2,mList,false);
           b1.printBoxInfo();
           return(mList);
       } else if (answer.equals("2")){
           Monsters[] mList = {m2,m3};
           Box b2 = new Box(3,mList,false);
           b2.printBoxInfo();
           return(mList);
       } else if (answer.equals("3")){
           Monsters[] mList = {m4, m5, m6};
           Box b3 = new Box(4,mList,true);
           b3.printBoxInfo();
           return(mList);
       } else if(answer.equals("4")){
           Monsters[] mList = {m7};
           Box b4 = new Box(1,mList,false);
           b4.printBoxInfo();
           return(mList);
       } else if(answer.equals("door")){
           print("The door is locked");
           Monsters[] mList = {null};
           return(mList);
       } else {
           print("You didn't answer the question :/");
           return(null);
        }
   }
   
   public  Monsters[] getMonsters(){
       return mList;
   }
   
   /*
   public void corner(String answer, int boxNumber){
       for(int i = 0; i < boxNumber; i++){
           if (answer.equals("1")){
               Box bi = new Box(((int)(Math.random() * i)),((int)(Math.random() * i)),false);
            }
       }
   }
   */
   
      public static void print(String s){
       System.out.println(s);
   }
   
   
}


//ifuhsujdfsksjkdfdjssdfksfdjksfdsdf Hello
