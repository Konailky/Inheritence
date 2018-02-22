
/**
 * Abstract class Comsumables - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Comsumables extends Item
{
    int restoreHp;
    
    public Comsumables(int restoreHp){
        this.restoreHp = restoreHp;
    }
    
    public void food(){
        //player.eat(restoreHp);
    }
    
}
