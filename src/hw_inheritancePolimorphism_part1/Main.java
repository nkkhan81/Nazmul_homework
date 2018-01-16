package hw_inheritancePolimorphism_part1;

/**
 * Created by nkkhan on 1/11/18.
 */
public class Main {
    public static void main(String[] args) {

//        Homework #1.
//        Start with a Car class as base class.
//        Finally, create another class, a specific type of Car that inherits
//        from the Car class. You should be able to hand steering, changing gears,
//        and moving (speed in other words).You will want to decide where to
//        put the appropriate state and behaviors (fields and methods).As mentioned
//        above, changing gears, increasing/decreasing speed should be included.
//        For you specific type of vehicle you will want to add something
//        specific for that type of car.
//
//
//        Homework #2
//        Now create 3 sub classes for your favorite vehicles.
//        Override the appropriate methods to demonstrate polymorphism in use.
//        put all classes in the one java file.

        Pathfinder pathfinder = new Pathfinder();    //class Pathfinder inherited from Car class
        pathfinder.start();                          //start() method from Car class
        pathfinder.move(45);                //changeGear() form Pathfinder class
        pathfinder.changeGear(7);
        pathfinder.changeGear(1);
        pathfinder.handSteer(60);           //handSteer() form Pathfinder class
        pathfinder.movingSpeed(15.6);           //movingSpeed() form Pathfinder class

        pathfinder.changeGear(3);
        pathfinder.movingSpeed(15.9);
        pathfinder.stop();                          //stop() method from parent class

    }
}
