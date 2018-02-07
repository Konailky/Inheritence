
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Sword extends Melee implements WeaponInterface
{

    public Sword(int damage, boolean parry){
        super(damage, parry);
    }

    public int attack(){
        return damage;
    }

    public boolean parry(){
        double ram = (int ) Math.random() * 10;
        if( ram >= 6) {
            return true;
        }
        else{
            return false;
        }
    }

}

