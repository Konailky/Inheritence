
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public  class Player extends Characters
{
    int name;
    int hp;

    public Player(int name, int hp){
        this.name = name;
        this.hp = hp;
        hp = 300;
    }

    public void eat(int food){
        hp += food;
        System.out.println("You now have " + hp + " hp.");
        
    }
}
