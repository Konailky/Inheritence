
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Sword extends Melee 
{
  

    public Sword(int damage, boolean parry,boolean crit){
        super(damage, parry, crit);
       
    }

    public void Attack(){
        if( Sword.crit(10)){
            System.out.println("You dealt " +  10 * 2 + " damage.");
        }
        else{
            System.out.println("You dealt 10 damage");}
            

    }
}

