
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public abstract class Enemy extends Characters
{
    int Edamage;
    int Ehp;
    int Edefense;
    
    public Enemy(int Edamage, int Ehp, int Edefense){
     
        this.Edamage = Edamage;
        this.Ehp = Ehp;
        this.Edefense = Edefense;
    }

    public int Eattack(){
        return Edamage;
    }
    
    public void Edefend(int damage){
        
    }
    
    public void takeDamage(int damage){
        
    }
}
