
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
    }

    public static void start(){
       // Scanner scaner = new Scanner();
        System.out.println("Enter your name: ");
    }
}
