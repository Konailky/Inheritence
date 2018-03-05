
/**
 * Write a description of class Unarmed here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Unarmed extends Melee
{
    public Unarmed(int damage, int parrychance){
     super(damage, parrychance);
     damage = 1;
     parrychance = 2;
    }
    
   
    
    public boolean parry(int parrychance){
            double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;
    }
}
