
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Sword extends Melee 
{

    public Sword(int damage, int parrychance){
        super(damage, parrychance); 
        damage = 10;
        parrychance = 10;
    }

   
    public boolean parry(int parrychance){
        double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;
    }

}

