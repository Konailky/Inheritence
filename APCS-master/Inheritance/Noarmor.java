
/**
 * Write a description of class NoArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Noarmor extends Armor
{
    public Noarmor (boolean armor, int def){
        super(armor, def);  
        armor = false;
        def = 0;
    }
    public Noarmor(){
     this(false, 0);   
    }

    public void armor(int Edamage){
        if(Edamage == def){
            System.out.println("Your armor blocked all the damage.");}
        else if ( Edamage > def){
            System.out.println("Your armor blocked part of the damage.");}
        else{
            System.out.println("Your armor did not block any damage.");}
    }
}
