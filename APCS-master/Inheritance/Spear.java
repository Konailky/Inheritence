
/**
 * Write a description of class Spear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Spear extends Melee 
{

    public Spear(int damage, boolean parry){
        super(damage, parry);
    }

    public void Attack(){
        System.out.println("You dealt 8 damage.");
    }

}
