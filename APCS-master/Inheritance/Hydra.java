
/**
 * Write a description of class Hydra here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hydra extends Enemy
{
     public Hydra ( int Edamage, int Ehp, int Edefense){
        super(Edamage, Ehp, Edefense);
    }
    
        public void defend(int damage){
        if (damage > Edefense){
            System.out.println("The enemy shielded " +  Edefense + " damage so you only dealt "+ (damage - Edefense) + " to its hp.");}
        else if(damage == Edefense){
            System.out.println("The enemy was shieled from all your damage");}
         else{
             System.out.println("You dealt " + damage + " to its hp.");}
    }
}