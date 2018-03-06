
/**
 * Write a description of class M16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public  class LaserGun extends Ranged 
{

    public LaserGun(int damage, int parrychance){
        super(damage, parrychance);
    }
    public LaserGun(){
     this(200, 200);   
    }
    
    public boolean parry(int parrychance){
            double ram = (int) Math.random() * parrychance;
        if(ram >= parrychance-2){
            return true;
        }
        return false;
    }
}
