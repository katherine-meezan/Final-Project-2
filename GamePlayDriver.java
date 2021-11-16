import java.util.ArrayList;
import java.util.Scanner;

//Fix the fact that it list some boxes twice

public class GamePlayDriver
{
   public static void main(){
       Player p1 = new Player();
       Scanner s = new Scanner(System.in);
       boolean doorOpen = false;
       //print("▏▎▍▌▋▊▉"); ✓ ✔ ✗ ✘ ☓ ∨ √ ✇  ☑ ☒ 〤 〥
       //♥ ♡ ❤ ❥ ❣ ❦ ❧ დ ღ ۵ ლ ლ ❤
       //° ℃ ℉ ϟ ☀ ☁ ☂ ☃ ☉ ☼ ☽ ☾ ♁ ♨ ❄ ❅  
       // ✁ ✂ ✃ ✄ ✆ ✇ ✈ ✉ ✎ ✏ ✐ ✑ ✒ ‰ § ¶ ☞ ☛ ☟ ☜ ☚
       //〈〉《》「」『』【】〔〕︵︶︷︸︹︺︻︼︽︾︿﹀﹁﹂﹃﹄〖〗〘〙〚〛«»‹›〈〉〱
       //★☆✦✧✩✪✫✬✭✮✯✰⁂⁑✢✣✤✥✱✲✳✴✵✶✷✸✹✺✻✼✽✾✿❀❁❂❃❇❈❉❊❋❄❆❅⋆≛⛥☪
       //✽ ✾ ✿ ❀ ❁ ❃ ❊ ❋ ✣ ✣ 
       //❏ ❐ ❑ ❒ ▀ ▁ ▂ ▃ ▄ ▅ ▆ ▇ ▉ ▊ ▋ █ ▌ ▐ ▍ ▎ ▏ ▕ ░ ▒ ▓ ▔ ▬ ▢ ▣ ▤ ▥ ▦ ▧ ▨ ▩ ▪ ▫ ▭ ▮ ▯ ☰ ☲ ☱ ☴ ☵ ☶ ☳ ☷ ▰ ▱ ◧ ◨ ◩ ◪ ◫ ∎ ■ □ ⊞ ⊟ ⊠ ⊡ ❘ ❙ ❚ 〓 ◊ ◈ ◇ ◆ ⎔ ⎚ ☖ ☗
       print("You wake up in the top layer of the tower");
       print("/\\      ☀");
       print("▉");
       print("▊  ✈  ☁");
       print("▌           ☁");
       print("▎ ☁");
       print("------");
       
       print("Theres a door... but it's locked. You look around");
       print("Each corner has a box in it. What do you wish to do?");
       print("Do you want to go to corner 1,2,3, or 4?");
       String answer = s.nextLine();
       
       
       while(doorOpen == false){
           
           Monsters[] mList = p1.corner(answer);
           
           if (mList != null){
               for(Monsters monster: mList){
                   if (monster != null){
                       monster.combat(p1);
                   }  
               }
            }
           print("\nWhich corner do you want to try now? " + p1.boxesAvailable() + "Don't try one you already went to!");
           answer = s.nextLine();
           
           if (p1.getHasKey() == true  && answer.equals("door")){
               doorOpen = true;
               break;
           }
        }
       
       
       //============================================================================

       print("\nYou enter through the door. Down a staircase, you find a new room...");
       print("Three boxes sit ahead of you. Which one do you want to go to?");
       print("Do you want to go to corner 1,2, or 3?");
       answer = s.nextLine();
       doorOpen = false;
        
       p1.newRoom();
       
       
       while(doorOpen == false){

           Monsters[] mList = p1.corner2(answer);
           
           if (mList != null){
               for(Monsters monster: mList){
                   if (monster != null){
                       monster.combat(p1);
                   }  
               }
            }
           print("\nWhich box do you want to try now? " + p1.boxesAvailable() + "Don't try one you already went to!");
           answer = s.nextLine();
           
           if (p1.getHasKey() == true  && answer.equals("door")){
               doorOpen = true;
               break;
           }
         
        }
        
        
        
        
        print("\nCongraduations! You are out of the tower");
        print("You enjoy being free. But Wait...");
        print("A zombie approaches you...");
        print("They get closer... you prepare to fight");
        print("They pull out a gun and hold you at point-blank range");
        if(p1.getHealth() < 50){
            print("They shoot you! You bleed out and die.");
            print("The end :)");
        }else if(p1.getHealth() > 50){
            print("They shoot you! Luckily you have " + p1.getHealth() + " health so you survive!");
            print("You are now severely traumatized.");
            print("The end :)");
        }
        
   }
   

   public static void print(String s){
       System.out.println(s);
   }
 
   
   public static void drinkHealthPotion(Player player){
       int currentHealth = player.getHealth();
       player.setHealth(currentHealth + 1);
   }
   
}
