
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
    
    public Ranged(int damage, boolean parry){
        this.damage = damage;
        this.parry = parry;
    }
}
