
/**
 * Write a description of class Cookie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cookie extends Comsumables
{
   public Cookie(int restoreHp){
       super(restoreHp);
    }
    
    public void eat(){
     System.out.println("You regained 15 hp.");   
    }
}
