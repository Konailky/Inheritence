
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
        
    }
    public Player(){
     this(null,1000,30,30,30);   
    }
    
    public int getHp(){
        return hp;
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
        System.out.println("You have armored yourself with the " + y + " and increased your defenses to " + pdef + " points.");
    }
    
    public void ride(Vehicle z){
        pspeed += z.getSpeed();
        System.out.println("You have mounted a " + z + " and increased your speed to " + pspeed + " points.");
        
    }
    
}
