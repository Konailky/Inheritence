
/**
 * Write a description of class Ranged here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Ranged extends Weapons
{
    int damage;
    boolean parry; 
    boolean crit;
   
    
    public Ranged(int damage, boolean parry, boolean crit){
        this.damage = damage;
        this.parry = parry;
        this.crit = crit;
    }
    
       public int attack(){
        return damage;
    }
    
    public boolean parry(){
        double ram = (int) Math.random() * 10;
        if (ram <= 2){
            return true;
        }
        return false;
    }
 
     public  boolean crit(int critChance){
        double ran = (int) Math.random() * critChance;
        if ( ran > critChance -5){
         return true;   
        }
        return false;
    }
}
