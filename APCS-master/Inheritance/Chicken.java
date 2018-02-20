
/**
 * Write a description of class Chicken here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chicken extends Comsumables
{
    public Chicken( int restoreHp){
        super(restoreHp);
    }
    
    public void eat(){
     System.out.println("You regained 10");   
    }
}
