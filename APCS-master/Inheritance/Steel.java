
/**
 * Abstract class Steel - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public  class Steel extends Armor
{
    public Steel(boolean armor, int def){
        super(armor, def); 
        armor = true;
        def = 50;
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
