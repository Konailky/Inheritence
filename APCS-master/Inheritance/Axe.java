
/**
 * Write a description of class Axe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Axe extends Melee 
{
    public Axe(int damage, boolean parry, boolean crit){
        super(damage, parry, crit);
    }

    public void Attack(){
      if( Axe.crit(10)){
            System.out.println("You dealt " +  15 * 2 + " damage.");
        }
        else{
            System.out.println("You dealt 10 damage");}
    }
    
}
