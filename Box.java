

public class Box
{
   private int healthAdd;
   private Monsters[] monsters;
   private boolean hasKey;
   
   public Box(boolean key){
       this.healthAdd = (int)(Math.random() * 10) +1;
       this.monsters = new Monsters[1];
       int monsterHealth = (int)(Math.random() * 20) +1;
       int monsterPower = (int)(Math.random() * 10) +1;
       int monsterXP = (int)(Math.random() * 5) +1;
       monsters[0] = new Monster(monsterHealth, monsterPower, monsterXP);
       this.hasKey = key;
    }
   
   public Box(int healthAdd, Monsters[] monsters, boolean hasKey){
       this.healthAdd = healthAdd;
       this.monsters = monsters;
       this.hasKey = hasKey;
    }
    
   public void printBoxInfo(){
       print("This box has " + this.healthAdd + " health in it");
       print("there is also " + monsters.length + " monsters in it"
       if(this.hasKey == true){
           System.out.print(" and a key");
        }
    }
    
 
    
    public static void print(String s){
       System.out.println(s);
   }
   
}
