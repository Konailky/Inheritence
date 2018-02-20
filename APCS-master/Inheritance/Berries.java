
/**
 * Write a description of class Berries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Berries extends Comsumables
{
   public Berries(int restoreHp){
       super(restoreHp);
    }
    
    public void eat(){
     System.out.println("You regained 5 hp.");   
    }
}
