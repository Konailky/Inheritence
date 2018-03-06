
/**
 * Write a description of class Axe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Axe extends Melee 
{
    public Axe(int damage, int parrychance){
        super(damage, parrychance);
    }
    public Axe(){
     this(15,15);   
    }

    
    public boolean parry(int parrychance){
            double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;
    }
}
