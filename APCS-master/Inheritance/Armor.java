
/**
 * Abstract class Armor - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
import java.lang.Math;
public abstract class Armor extends Item implements DefenseCommands
{
    boolean armor;
    int def;
    public Armor(boolean armor, int def){
        this.armor = armor;
        this.def = def;
    }
    
    public int getDef(){
     return def;
    }

    public boolean blocked(){
        if(armor = true){
            return true;  
        }
        else{
            return false;   
        }
    }

    public String armorType(){
        String armor;
        double ran = (int)(Math.random()) * 2;
        if(ran == 3){
          armor = "Gold";
          return armor;}
        else if(ran == 2){
            armor = "Steel";
            return armor;}
        else{
            armor = "Noarmor";
            return armor;}
    }
}

