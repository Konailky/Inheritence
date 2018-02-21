
/**
 * Write a description of class M16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class LaserGun extends Ranged 
{
    public LaserGun(int damage, boolean parry){
        super(damage, parry);
    }

 public void Attack(){
     if( LaserGun.crit(10)){
            System.out.println("You dealt " +  500 * 2 + " damage.");
        }
        else{
            System.out.println("You dealt 500 damage");}
    }
}
