
/**
 * Write a description of class Minotaur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Chimera extends Enemy
{
    public Chimera ( int Edamage, int Ehp, int Edefense){
        super(Edamage, Ehp, Edefense);
        Edamage = 50;
        Ehp = 500;
        Edefense = 50;
    }
    public Chimera(){
     this(50,500,500);   
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
