
/**
 * Write a description of class Bow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bow extends Ranged
{
    public Bow(int damage, int parrychance){
        super(damage, parrychance);
        
    }
    public Bow(){
     this(12,12);   
    }


    
    public boolean parry(int parrychance){
         double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;   
    }
 }


