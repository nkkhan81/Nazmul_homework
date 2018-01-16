package hw_inheritancePolimorphism_part2;

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

    public static void main(String[] args) {
        Sienna sienna = new Sienna();
        sienna.start();
        sienna.move();
        sienna.stop();

        System.out.println("--------------------------");
        Pilot pilot = new Pilot();
        pilot.start();
        pilot.move();
        pilot.stop();

        System.out.println("--------------------------");
        Tesla3 tesla3 = new Tesla3();
        tesla3.start();
        tesla3.move();
        tesla3.stop();
    }


    private String name;
    private int engine;
    private int wheels;
    private int doors;
    private int gears;

    public Car(String name, int engine, int wheels, int doors, int gears) {
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
    }

    public void start(){
        System.out.println("Car.start()  -> "+getClass().getSimpleName()+" started");
    }

    public void move(){
        System.out.println("Car.move() -> "+getClass().getSimpleName()+" is moving...");
    }

    public void stop(){
        System.out.println("Car.stop()  -> "+getClass().getSimpleName()+" stopped.");
    }

}

class Sienna extends Car {

    private String driveType;

    public Sienna() {
        super("Pathfinder", 1, 4, 4, 6);
        this.driveType = "4WD";
    }


    public void move() {
        System.out.println("Sienna.move() -> "+getClass().getSimpleName()+" is moving...");
        System.out.println("Drive type is "+this.driveType);
    }
}

class Pilot extends Car{

    String specialFeature;

    public Pilot() {
        super("Pathfinder", 1, 4, 4, 6);
        this.specialFeature = "360 outside camera view";
    }


    public void start() {
        System.out.println("pilot.start()   ->  Vehicle has started...");
        System.out.println("Special feature: "+this.specialFeature);
    }
}

class Tesla3 extends Car{

    private String specialFeature;

    public Tesla3() {
        super("Pathfinder", 1, 4, 4, 6);
        this.specialFeature = "Automatic brake";
    }

    public void start() {
        System.out.println("Tesla3.start()   ->  Vehicle has started...");
        System.out.println("Special feature: "+this.specialFeature);
    }
}


