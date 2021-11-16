import java.util.ArrayList;

public class Player
{
   private int health;
   private int xp;
   private int power;
   ArrayList<String> items = new ArrayList<String>();
   private int boxTracker;
   private boolean hasKey;
   ArrayList<String> boxesAvailable = new ArrayList<String>();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
   
   public Player(){
       this.health = 100;
       this.xp = 0;
       this.power = 10;
       this.hasKey = false;
       boxesAvailable.add("1");
       boxesAvailable.add("2");
       boxesAvailable.add("3");
       boxesAvailable.add("4");
    }
    
   public Player(int health, int xp, int power){
       this.health = health;
       this.xp = xp;
       this.power = power;
       this.hasKey = false;
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
   Monsters[] blankList = {null};
   Box box = new Box(false);
   //public static void addBoxesGodIHateCoding(){
    //}

      public Monsters[] corner(String answer){
       
       if (answer.equals("1")){
           Monsters[] mList = {m1};
           //Box b1 = new Box(2,mList,false);
           for (String boxo : boxesAvailable){
               if (boxo.equals("1")){
                   boxesAvailable.remove(boxo);
                   box.setHealth(2);
                   box.setMonsters(mList);
                   box.setHasKey(false);
                   this.health+=box.getHealth() *10;
                   box.printBoxInfo();
                   return(mList);
                }
            }
           print("\nYou already checked this box! Nothing spawned in while you were looking away");
           return(null);
       } else if (answer.equals("2")){
           Monsters[] mList = {m2,m3};
           //Box b2 = new Box(3,mList,false);
           for (String boxo: boxesAvailable){
               if (boxo.equals("2")){
                   boxesAvailable.remove(boxo);
                   box.setMonsters(mList);
                   box.setHasKey(false);
                   this.health+=box.getHealth() *10;
                   box.printBoxInfo();
                   return(mList);
                }
            }
            print("\nYou already checked this box! Nothing spawned in while you were looking away");
            return(null);
       } else if (answer.equals("3")){
           Monsters[] mList = {m4, m5, m6};
           //Box b3 = new Box(4,mList,true);
           for (String boxo : boxesAvailable){
               if (boxo.equals("3")){
                   boxesAvailable.remove(boxo);
                   box.setHealth(4);
                   box.setMonsters(mList);
                   box.setHasKey(true);
                   this.health+=box.getHealth() *10;
                   box.printBoxInfo();
                   this.hasKey = true;
                   return(mList);
                }
            }
            print("\nYou already checked this box! Nothing spawned in while you were looking away");
            return null;
       } else if(answer.equals("4")){
           Monsters[] mList = {m7};
           //Box b4 = new Box(1,mList,false);
           for (String boxo : boxesAvailable){
               if (boxo.equals("4")){
                   boxesAvailable.remove(boxo);
                   box.setHealth(1);
                   box.setMonsters(mList);
                   box.setHasKey(false);
                   this.health+=box.getHealth() *10;
                   box.printBoxInfo();
                   return(mList);
                }
            }
            print("\nYou already checked this box! Nothing spawned in while you were looking away");
            return null;
       } else if(answer.equals("door")){
           if (hasKey == true){
               print("The door opens!");
           } else {
               print("The door is locked");
           }
           Monsters[] mList = {null};
           return(mList);
       } else {
           print("You didn't answer the question :/");
           return(blankList);
        }
   }
   public int getBoxTracker(){
       return this.boxTracker;
   }
   
   public boolean getHasKey(){
       return this.hasKey;
   }
   public String boxesAvailable(){
       String string = "";
       for (String boxo : boxesAvailable){
           string += boxo;
           string += " ";
       }
       return string;
   }
   
   
      public static void print(String s){
       System.out.println(s);
   }
   
   
   
   
   
   //============================================ ROOM 2 ======================================
   
   
   
   
   
   
   
   
   public void newRoom(){
        Monsters[] mList = {m1,m2,m3,m4,m5,m6,m7};
        this.hasKey = false;
        
        for(Monsters mon: mList){
            mon.setHealth((int) Math.random()*10+10);
        }
       
       for(int i = boxesAvailable.size()-1;i>0; i--){
           boxesAvailable.remove(i);
       }
       boxesAvailable.add("1");
       boxesAvailable.add("2");
       boxesAvailable.add("3");
   }
   
         public Monsters[] corner2(String answer){
       
       if (answer.equals("1")){
           Monsters[] mList = {m1};
           //Box b1 = new Box(2,mList,false);
           for (String boxo : boxesAvailable){
               if (boxo.equals("1")){
                   boxesAvailable.remove(boxo);
                   box.setHealth(2);
                   box.setMonsters(mList);
                   box.setHasKey(false);
                   this.health+=box.getHealth() *10;
                   box.printBoxInfo();
                   return(mList);
                }
            }
           print("\nYou already checked this box! Nothing spawned in while you were looking away");
           return(null);
       } else if (answer.equals("2")){
           Monsters[] mList = {m2,m3};
           //Box b2 = new Box(3,mList,false);
           for (String boxo: boxesAvailable){
               if (boxo.equals("2")){
                   boxesAvailable.remove(boxo);
                   box.setMonsters(mList);
                   box.setHasKey(false);
                   this.health+=box.getHealth() *10;
                   box.printBoxInfo();
                   return(mList);
                }
            }
            print("\nYou already checked this box! Nothing spawned in while you were looking away");
            return(null);
       } else if (answer.equals("3")){
           Monsters[] mList = {m4, m5, m6};
           //Box b3 = new Box(4,mList,true);
           for (String boxo : boxesAvailable){
               if (boxo.equals("3")){
                   boxesAvailable.remove(boxo);
                   box.setHealth(4);
                   box.setMonsters(mList);
                   box.setHasKey(true);
                   this.health+=box.getHealth() *10;
                   box.printBoxInfo();
                   this.hasKey = true;
                   return(mList);
                }
            }
            print("\nYou already checked this box! Nothing spawned in while you were looking away");
            return null;
       } else if(answer.equals("door")){
           if (hasKey == true){
               print("The door opens!");
           } else {
               print("The door is locked");
           }
           Monsters[] mList = {null};
           return(mList);
       } else {
           print("You didn't answer the question :/");
           return(blankList);
        }
   }
   
}


//ifuhsujdfsksjkdfdjssdfksfdjksfdsdf Hello
