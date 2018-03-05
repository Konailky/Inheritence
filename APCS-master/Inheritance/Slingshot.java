
/**
 * Write a description of class Slingshot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Slingshot extends Ranged
{
   public Slingshot(int damage, int parrychance){
       super(damage, parrychance);
       damage = 2;
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
