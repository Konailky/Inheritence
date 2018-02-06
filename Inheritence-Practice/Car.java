
/**
 * Write a description of class Car here.
 *
 * @author Kong Yang
 * @version 2.1.18
 */
public class Car extends Vehicle{
    int wheels;
    int cylinders;
    boolean engineOn;
    int doors;
    /** constructor for objects of class Car
     */
    public Car(int seats, double speed, String name, int wheels, int cylinders, int doors ){
        super(seats,speed,name);
        engineOn = false;
        this.wheels = wheels;
        this.cylinders = cylinders;

    }

    public void turnOn(){
        if (engineOn){
            System.out.println("Nothing Happens.");

        }
        else{
            engineOn = true;
            System.out.println("You push the button and the car turns on.");

        }
    }

    public void turnOff(){
        if(engineOn){
            System.out.println("The engine turns off. You can now remove");
            engineOn = false;
        }
        else{
            System.out.println("You turn the key and the engine turns off");
        }
    }

    public void honk(){
        System.out.println("HONK!!!!!!!!!!!!!");
    }
}


