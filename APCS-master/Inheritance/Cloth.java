
/**
 * Abstract class Cloth - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Cloth extends Armor
{
    int defense;
    public Cloth(int defense){
        this.defense = defense;
    }

    public boolean Blocked(){
        if( defense >= damage){
            return true;
        }
        return false;
    }
}
