
/**
 * Write a description of class Spear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Spear extends Melee 
{
     public Spear(int damage, int parrychance){
        super(damage, parrychance); 
        damage = 20;
        parrychance = 20;
    }

  
  
    public boolean parry(int parrychance){
         double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;   
    }
}
