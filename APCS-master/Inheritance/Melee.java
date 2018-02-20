
/**
 * Write a description of class Melee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public abstract class Melee extends Weapons
{
    int damage;
    boolean parry;
    boolean crit;
    
    public Melee(int damage, boolean parry, boolean crit){
     this.damage = damage;
     this.parry =  parry;
     this.crit = crit;
    }
    
    public int attack(){
        return damage;
    }
    
    public boolean parry(){
        double ram = (int) Math.random() * 10;
        if(ram >= 5){
            return true;
        }
        return false;
    }
    
    public boolean crit(int critChance){
        double ran = (int) Math.random() * critChance;
        if ( ran > critChance -5){
         return true;   
        }
        return false;
    }
}
