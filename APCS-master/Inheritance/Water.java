
/**
 * Write a description of class Water here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Water extends Comsumables
{
      public Water( int restoreHp){
        super(restoreHp);
    }
    
    public void eat(){
     System.out.println("You regained 50");   
    }
}
