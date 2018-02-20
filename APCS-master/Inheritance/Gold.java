
/**
 * Abstract class Cloth - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public class Gold extends Armor
{
    public Gold(boolean armor){
        super(armor);
    }
    
    public void armor(int Edamage){
        if(Edamage == 20){
        System.out.println("Your armor blocked all the damage.");}
        else if ( Edamage > 20){
        System.out.println("Your armor blocked part of the damage.");}
        else{
        System.out.println("Your armor did not block any damage.");}
    }
    
}
