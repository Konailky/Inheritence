
/**
 * Write a description of class Slime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Slime extends Enemy
{
    public Slime( int Edamage, int Ehp, int Edefense){
        super(Edamage, Ehp, Edefense);
    }
    public Slime(){
     this(300,100, 300);   
    }
    
        public void defend(int damage){
   if (damage > Edefense){
            System.out.println("The enemy shielded " +  Edefense + " damage so you only dealt "+ (damage - Edefense) + " to its hp.");
            damage -= Edefense;
            Ehp -= damage; }
        else if(damage == Edefense){
            System.out.println("The enemy was shieled from all your damage but its shields are now lowered.");
            Edefense = 0;}
        else{
            System.out.println("You have lowered its defenses by "+  damage);
            Edefense -= damage;
        }
    }
}
