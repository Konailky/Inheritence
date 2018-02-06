
/**
 * Write a description of class Vehicle here.
 *
 * @author Kong Yang
 * @version 2.1.18
 */
public abstract class Vehicle implements BasicCar
{
    int seats;
    double speed;
    String name;

    public Vehicle(int seats, double speed, String name){
        this.seats = seats; 
        this.speed = speed;
        this.name = name;
    }

    public void moveForward(){
        System.out.println("You move forward");   
    }
    
}
