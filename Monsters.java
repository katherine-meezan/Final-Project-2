
/**
 * These are for the monsters that attack you in the game in the game
 */
public class Monsters
{
    private int health;
    private int power;
    //the xp the monsters drop
    private int xp;
    public Monsters(){
        this.health = 50;
        this.xp = 1;
        this.power = 10;
    }
    public Monsters(int health, int power, int xp)
    {
        this.health = health;
        this.power = power;
        this.xp = xp;
    }

    public int getHealth(){
       return this.health;
    }
    public void setHealth(int newHealth){
       this.health = newHealth;
    }
    
    public int getXP(){
       return this.xp;
    }
    public void setXP(int newXP){
       this.xp = newXP;
    }
    
    public int getPower(){
       return this.power;
    }
    public void setPower(int newPower){
       this.power = newPower;
    }
    

}
