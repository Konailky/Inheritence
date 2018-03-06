
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
    }
    public Spear(){
     this(20,20);   
    }

  
  
    public boolean parry(int parrychance){
         double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;   
    }
}
