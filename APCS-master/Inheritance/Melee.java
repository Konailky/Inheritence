
/**
 * Write a description of class Melee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Melee extends Weapons
{
    int damage;
    boolean parry;
    
    public Melee(int damage, boolean parry){
     this.damage = damage;
     this.parry =  parry;
    }
}
