
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
        Edamage = 80;
        Ehp= 1000;
        Edefense = 80;
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
