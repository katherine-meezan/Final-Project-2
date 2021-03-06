

public class Box
{
   private int healthAdd;
   private Monsters[] monsters;
   private int monsterCount;
   private boolean hasKey;
   
   public Box(boolean key){
       this.healthAdd = (int)(Math.random() * 10) +1;
       this.monsters = new Monsters[1];
       int monsterHealth = (int)(Math.random() * 20) +1;
       int monsterPower = (int)(Math.random() * 10) +1;
       int monsterXP = (int)(Math.random() * 5) +1;
       monsters[0] = new Monsters(monsterHealth, monsterPower, monsterXP);
       this.hasKey = key;
    }
   
   public Box(int healthAdd, Monsters[] monsters, boolean hasKey){
       this.healthAdd = healthAdd;
       this.monsters = monsters;
       //this.monsterCount = monsters;
       this.hasKey = hasKey;
    }
   
   //getters and setters
   public int getHealth(){
       return healthAdd;
   }
   
   public void setHealth(int healthAdd){
       this.healthAdd = healthAdd; 
   }
   
   public int getMonstersCount(){
       return monsterCount;
   }
   
   public void setMonsterCount(int monsterCount){
       this.monsterCount = monsterCount; 
   }
   
   public boolean getHasKey(){
       return hasKey;
   }
   
   public void setHasKey(boolean hasKey){
       this.hasKey = hasKey; 
   }
   
      public Monsters[] getMonsters(){
       return monsters;
   }
   
   public void setMonsters(Monsters[] monsters){
       this.monsters = monsters; 
   }
    
    
    
   public Monsters[] printBoxInfo(){
       print("❤❤ This box has " + this.healthAdd + " health potions in it");
       print("❤❤ You drank the potions... your health increased by " + this.healthAdd + "!");
       print("☠☠ There is also " + monsters.length + " monsters in it! Oh no!");
       if(this.hasKey == true){
           System.out.print(" It also has a key...");
        }
       return this.monsters;
    }
    
 
    
   public static void print(String s){
       System.out.println(s);
   }
   
}
