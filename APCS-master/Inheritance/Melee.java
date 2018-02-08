
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
    
    public Melee(int damage, boolean parry){
     this.damage = damage;
     this.parry =  parry;
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
}
