
/**
 * Write a description of class NPC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class NPC extends Characters
{
    String name;
    int Nhp;
    int nDef;
    public NPC(String name, int Nhp, int nDef ){
        this.name = name;
        this.Nhp = Nhp;
        this.nDef = nDef;
    }

    
    
}
