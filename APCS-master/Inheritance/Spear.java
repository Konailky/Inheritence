
/**
 * Write a description of class Spear here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Spear extends Melee 
{

    public Spear(int damage, boolean parry, boolean crit){
        super(damage, parry, crit);
    }

    public void Attack(){
        if( Spear.crit(10)){
            System.out.println("You dealt " +  8 * 2 + " damage.");
        }
        else{
            System.out.println("You dealt 10 damage");}
    }

}
