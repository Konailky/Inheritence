
/**
 * Write a description of class M16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Gun extends Ranged 
{
    public Gun(int damage, boolean parry){
        super(damage, parry);
    }

 public void Attack(){
     System.out.println("You dealt  5 damage");
    }
}
