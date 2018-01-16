package hw_inheritancePolimorphism_part1;

/**
 * Created by nkkhan on 1/11/18.
 */
public class Pathfinder extends Car {

    private int currentGear;

    public Pathfinder() {
        super("Pathfinder", 1, 4, 4, 6);
        this.currentGear = 0;
    }

    public void changeGear(int gear){
        if ((gear > 0) && (gear <=6)){
            this.currentGear = gear;
            System.out.println("Gear changed to "+this.currentGear);
        }else {
            System.out.println("Cannot shift to gear - "+gear+". Grind!!!!");
        }
    }

    public void handSteer(int direction){
        move(direction);
        System.out.println("Current gear number: "+this.currentGear);
    }


    public void movingSpeed(double rev){
        if ((this.currentGear <= 0) && (this.currentGear > 6)){
            System.out.println("Car not moving, please change gear to move");
        }else {
            System.out.println("Current moving speed = "+(this.currentGear*rev)+" mph");
        }
    }
}
