
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
public class Sword extends Melee 
{
    int critChance;

    public Sword(int damage, boolean parry,boolean crit, int critChance){
        super(damage, parry, crit);
        this.critChance = critChance;
    }

    public void Attack(){
        if( Sword.crit(10)){
        System.out.println("You dealt " +  damage * 2 + " damage.");
    }


}
}

