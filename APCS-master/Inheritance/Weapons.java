
/**
 * Write a description of class Weapons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Weapons extends Item implements WeaponInterface
{
    int parrychance;
    int damage;

    public Weapons(int damage, int parrychance){
        this.damage = damage;
        this.parrychance = parrychance;   

    }

    public int attack(){
        return damage; 
    }
     
    public void Attack(Enemy target){
        Edefend(damage);
    }

    public int getDamage(){
        return damage;
    }

    public boolean parry(){
        double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;
    }
}
