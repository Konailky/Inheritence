
/**
 * Write a description of class HPpotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HPpotion extends Comsumables
{
   public HPpotion(int restoreHp){
     super(restoreHp);  
    }
    
    public void eat(){
       System.out.println("You regained 20 hp.");
    }
}
