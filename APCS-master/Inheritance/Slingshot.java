
/**
 * Write a description of class Slingshot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Slingshot extends Ranged
{
   public Slingshot(int damage, boolean parry){
       super(damage, parry);
    }
    
    public void Attack(){
    if( Slingshot.crit(10)){
            System.out.println("You dealt " +  1 * 2 + " damage.");
        }
        else{
            System.out.println("You dealt 1 damage");}
    }
}
