

public class Player
{
   private int health;
   private int xp;
   private int power;
   
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
}


//ifuhsujdfsksjkdfdjssdfksfdjksfdsdf Hello
