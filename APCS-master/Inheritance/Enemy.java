
/**
 * Write a description of class Enemy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public abstract class Enemy extends Characters
{
    int Edamage;
    int Ehp;
    int Edefense;
    
    public Enemy(int Edamage, int Ehp, int Edefense){
     
        this.Edamage = Edamage;
        this.Ehp = Ehp;
        this.Edefense = Edefense;
    }

    public int Eattack(){
        return Edamage;
    }
    
    public void Edefend(int damage){
        if( damage == Edefense){
            damage = 0;
            System.out.println("The monster has been shielded from all your damage.");}
        else if( damage > Edefense ){ 
            damage -= Edefense;
            System.out.println("The monster was not able to withstand your might and you dealt " + (damage-=Edefense) + " points of damage to its life.");}
        else{
            Edefense -= damage;
            System.out.println("You are too weak and was only able to shred part of the monster's armors.");}
            
        takeDamage(damage);
    }
    
    public void takeDamage(int damage){
        Ehp -= damage;
    }
}
