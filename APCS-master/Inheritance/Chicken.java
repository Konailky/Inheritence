
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
        restoreHp = 10;
    }
    public Chicken(){
     this(10);   
    }
    
 
}
