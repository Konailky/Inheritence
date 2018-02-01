
/**
 * Write a description of class KeylessCar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class KeylessCar extends Car
{
    public KeylessCar(int seats, double speed, String name, int wheels,int cylinders, int doors){
        super(seats, speed, name, wheels, cylinders, doors);
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
     if (engineOn){
         System.out.println("You push the button and the engine turns off");
         engineOn = false;
        }
        else{
            System.out.println("The engine is already off");
        }
    }
}
