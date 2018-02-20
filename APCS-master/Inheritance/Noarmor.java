
/**
 * Write a description of class NoArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Noarmor extends Armor
{
    public Noarmor (boolean armor){
        super(armor);   
    }

    public void armor(int Edamage){
        if(Edamage == 0){
            System.out.println("Your armor blocked all the damage.");}
        else if ( Edamage > 0){
            System.out.println("Your armor blocked part of the damage.");}
        else{
            System.out.println("Your armor did not block any damage.");}
    }
}
