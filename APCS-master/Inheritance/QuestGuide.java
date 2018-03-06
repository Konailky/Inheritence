
/**
 * Write a description of class QuestGuide here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuestGuide extends NPC
{
    public QuestGuide(String name, int nHp, int nDef){
        super(name, nHp, nDef);
    }
    public QuestGuide(){
        this("QuestGuide", 30000,300000);
    }
    
    public void quest(){
     System.out.println("I have no quests at the moment. Come back at a later time.");   
    }
}
