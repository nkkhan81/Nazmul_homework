package hw_inheritancePolimorphism_part1;

/**
 * Created by nkkhan on 1/11/18.
 */
public class Car {

//        Homework #1.
//        Start with a Car class as base class.
//        Finally, create another class, a specific type of Car that inherits
//        from the Car class. You should be able to hand steering, changing gears,
//        and moving (speed in other words).You will want to decide where to
//        put the appropriate state and behaviors (fields and methods).As mentioned
//        above, changing gears, increasing/decreasing speed should be included.
//        For you specific type of vehicle you will want to add something
//        specific for that type of car.

    private String name;
    private int engine;
    private int wheels;
    private int doors;
    private int gears;
    private int direction;

    public Car(String name, int engine, int wheels, int doors, int gears) {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
    }

    public void start(){
        System.out.println("Car "+getClass().getSimpleName()+" started");
    }

    public void move(int direction){
        System.out.println("Vehicle is moving at "+direction+" degrees");
    }

    public void stop(){
        System.out.println("Car "+getClass().getSimpleName()+" stopped.");
    }

}
