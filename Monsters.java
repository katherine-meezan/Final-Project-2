import java.util.Scanner;
 
/**
 * These are for the monsters that attack you in the game in the game
 */
public class Monsters
{
    private int health;
    private int power;
    private int xp;
    //the xp the monsters drop
    Scanner s = new Scanner(System.in);
    public Monsters(){
        this.health = 10;
        this.xp = 1;
        this.power = 10;
    }
    public Monsters(int health, int power, int xp)
    {
        this.health = health;
        this.power = (int)(Math.random()*20);
        this.xp = xp;
    }

    public int getHealth(){
       return this.health;
    }
    public void setHealth(int newHealth){
       this.health = newHealth;
    }
    
    
    /*
    public int getXP(){
       return this.xp;
    }
    public void setXP(int newXP){
       this.xp = newXP;
    }
    */
    
    public int getPower(){
       return this.power;
    }
    public void setPower(int newPower){
       this.power = newPower;
    }
    
    public void combat(Player player){
        print("\n ▁ ▂ ▃ ▄ Oh no! A monster is attacking!▄ ▃ ▂ ▁      ");
        
        while(player.getHealth() >= 0 && this.health >= 0){
            //player's stats
            print("\n❤❤  Your health: " + player.getHealth()+ " ❤❤");
           // print("Your XP:" + player.getXP());
            print("☓☓ Your power: " + player.getPower() + " ☓☓");
            //monster's stats
            print("\n☠☠ Monster's health: " + this.health + " ☠☠");
            //print("Monster's XP:" + this.xp);
            print("☠☠ Monster's power: " + this.power + " ☠☠");
            
            //combat
            print("\nWhat do you wish to do?");
            print("Heal, Punch");
            String answer = s.nextLine();
            if(answer.toLowerCase().equals("heal")){
                if (player.getHealth() < 100){
                    player.addHealth(15);
                    print("\n❤❤ Your health increased by 10!");
                }
                else{
                    print("\nYou were unable to heal, as you have full health");
                    print("Unfortunatly, a turn was wasted ✘");
                }
            } else if (answer.toLowerCase().equals("punch")){
                this.health -= player.getPower();
                print("\n☓☓ You punched the monster!");
            }
            player.addHealth(power * (-1));
            print("\n☠☠ The monster punched you! Ouch!");
        }
        
        if (this.health <= 0){
            print("You defeated the monster! ( ͡❛͜ʖ ͡❛)");
            print("▁ ▂ ▃ ▄ ▄ ▃ ▂ ▁");
        }
        if (player.getHealth() <= 0){
            print("You died :(");
            System.exit(1);
        }
    }
    
    public static void print(String s){
       System.out.println(s);
    }

}
