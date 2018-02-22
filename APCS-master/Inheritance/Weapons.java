
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapons extends Item implements WeaponInterface
{
    int damage;
    boolean parry;
    
    public Weapons(int damage, boolean parry){
        this.damage = damage;
        this.parry = parry;
    }
    
      public int attack(Enemy target){
        return damage;
    }
    
    public boolean parry(int parryChance){
        double ram = (int) Math.random() * parryChance;
        if(ram >= parryChance-5){
            return true;
        }
        return false;
    }
    
}
