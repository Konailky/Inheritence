
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Excalibur extends Melee 
{

    public Excalibur(int damage, int parrychance){
        super(damage, parrychance);
        damage = 1000;
        parrychance = 1000;
    }
    public Excalibur(){
     this(1000,1000);   
    }
    
  

   public boolean parry(int parrychance){
         double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;  
    }
}

