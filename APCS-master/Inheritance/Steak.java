
/**
 * Write a description of class Steak here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Steak extends Comsumables
{
    public Steak(int restoreHp){
        super(restoreHp);
    }
    
    public void eat(){
     System.out.println("You regained 25 hp.");   
    }
}
