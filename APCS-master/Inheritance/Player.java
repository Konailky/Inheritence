
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public  class Player extends Characters 
{
    String name;
    int hp;
    int pdamage;
    int pspeed;
    int pdef;

    public Player(String name, int hp, int pdamage, int pspeed, int pdef){
        this.name = name;
        this.hp = hp;
        this.pdamage = pdamage;
        this.pspeed = pspeed;
        this.pdef = pdef;
        name = null;
        hp = 300;
        pdamage = 30;
        pspeed = 30;
        pdef = 30;
    }

    public void eat(Comsumables food){
        hp += food.getHp();
        System.out.println("You now have " + hp + " hp.");
        
    }
    
    public void equipWep(Weapons x){
        pdamage += x.getDamage();
        System.out.println("You have acquired " + x + " and powered up to "+ pdamage + " points of damage.");
    }
    
    public void equipDef(Armor y ){
        pdef += y.getDef();
        System.out.println("You have put on the armor called " + y + " and increased your defenses to " + pdef + " points.");
    }
    
    public void ride(Vehicle z){
        pspeed += z.getSpeed();
        System.out.println("You have mounted a " + z + " and increased your speed to " + pspeed + " points.");
        
    }
    
}
