
/**
 * Write a description of class Bow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bow extends Ranged
{
    public Bow(int damage, boolean parry){
        super(damage, parry);
    }

    public void Attack(){
        if( Bow.crit(10)){
            System.out.println("You dealt " +  4 * 2 + " damage.");
        }
        else{
            System.out.println("You dealt 4 damage");} 
    }
}

