import java.util.Scanner;
/**
 * These are for the monsters that attack you in the game in the game
 */
public class Monsters
{
    private int health;
    private int power;
    //the xp the monsters drop
    private int xp;
    Scanner s = new Scanner(System.in);
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
    
    public void combat(Player player){
        print("A monster is attacking!");
        
        while(player.getHealth() >= 0 && this.health >= 0){
            //player's stats
            print("\nYour health:" + player.getHealth());
            print("Your XP:" + player.getXP());
            print("Your power:" + player.getPower());
            //monster's stats
            print("\nMonster's health:" + this.health);
            print("Monster's XP:" + this.xp);
            print("Monster's power:" + this.power);
            
            //combat
            print("What do you wish to do?");
            print("Heal, Punch");
            String answer = s.nextLine();
            if(answer.toLowerCase().equals("heal")){
                player.addHealth(10);
            } else if (answer.toLowerCase().equals("punch")){
                this.health =- player.getPower();
            }
            player.addHealth(power * (-1));
        }
        
        if (this.health <= 0){
            print("You defeated the monster! (:");
        }
        if (player.getHealth() <= 0){
            print("You died :(");
        }
    }
    
    public static void print(String s){
       System.out.println(s);
    }

}
