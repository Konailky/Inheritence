
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Excalibur extends Melee 
{

    public Excalibur(int damage, boolean parry,boolean crit, int critChance){
        super(damage, parry, crit);
  
    }

    public void Attack(){
      if( Excalibur.crit(10)){
            System.out.println("You dealt " +  900 * 2 + " damage.");
        }
        else{
            System.out.println("You dealt 900 damage");}
    }
}

