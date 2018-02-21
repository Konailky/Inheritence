
/**
 * Abstract class Cloth - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Diamond extends Armor
{
    public Diamond(boolean armor){
        super(armor);
    }
    
    public void armor(int Edamage){
        if(Edamage == 200){
        System.out.println("Your armor blocked all the damage.");}
        else if ( Edamage > 200){
        System.out.println("Your armor blocked part of the damage.");}
        else{
        System.out.println("Your armor did not block any damage.");}
    }
    
}
